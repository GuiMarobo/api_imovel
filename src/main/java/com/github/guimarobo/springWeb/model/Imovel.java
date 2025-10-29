package com.github.guimarobo.springWeb.model;

public class Imovel {
    private int id;
    private String endereco;
    private String tipo;
    private double valor;

    public Imovel(int id, String endereco, String tipo, double valor) {
        this.id = id;
        this.endereco = endereco;
        this.tipo = tipo;
        this.valor = valor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Imovel{" +
                "id=" + id +
                ", endereco='" + endereco + '\'' +
                ", tipo='" + tipo + '\'' +
                ", valor=" + valor +
                '}';
    }
}
