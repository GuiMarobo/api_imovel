package com.github.guimarobo.springWeb.controller;

import com.github.guimarobo.springWeb.model.Imovel;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/imoveis")
public class ImovelController {
    private List<Imovel> imoveis = new ArrayList<>();

    // POST - criar imovel
    @PostMapping
    public ResponseEntity<Imovel> criarImovel(@RequestBody Imovel imovel) {
        imoveis.add(imovel);
        return new ResponseEntity<>(imovel, HttpStatus.CREATED);
    }

    // GET - busca todos
    @GetMapping
    public ResponseEntity<List<Imovel>> listarImoveis() {
        return ResponseEntity.ok(imoveis);
    }

    // GET - busca por ID
    @GetMapping("/{id}")
    public ResponseEntity<Imovel> buscaId(@PathVariable int id) {
        Optional<Imovel> imovel = imoveis.stream()
                .filter(i -> i.getId() == id)
                .findFirst();
        return imovel.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    // GET - filtro por tipo
    @GetMapping("/buscar")
    public ResponseEntity<List<Imovel>> buscarTipo(@RequestParam String tipo) {
        List<Imovel> filtrados = imoveis.stream()
                .filter(i -> i.getTipo().equalsIgnoreCase(tipo))
                .toList();

        return new ResponseEntity<>(filtrados, HttpStatus.OK);
    }

    // DELETE - apagar imovel por id
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarImovel(@PathVariable int id) {
        boolean removido = imoveis.removeIf(i -> i.getId() == id);
        return removido
                ? new ResponseEntity<>(HttpStatus.NO_CONTENT)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}
