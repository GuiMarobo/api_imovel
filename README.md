# API REST de Imóveis

Projeto realizado em **Java com Spring Boot Web** que implementa uma API REST para imóveis.

## Estrutura do projeto

* `src/` → código
* `pom.xml` → configuração do Maven
* `mvnw / mvnw.cmd` → scripts do Maven
* `.gitignore` → arquivo para ignorar pastas desnecessárias do repo
* `help.md` → notas adicionais
* `README.md`

## Endpoints disponíveis

Base URL: `http://localhost:8080/imoveis`

| Método | Rota                        | Descrição                |
| ------ | --------------------------- | ------------------------ |
| POST   | /imoveis                    | Cria um novo imóvel      |
| GET    | /imoveis                    | Lista todos os imóveis   |
| GET    | /imoveis/{id}               | Busca um imóvel pelo ID  |
| GET    | /imoveis/buscar?tipo={tipo} | Filtra imóveis pelo tipo |
| DELETE | /imoveis/{id}               | Apaga um imóvel pelo ID  |

## Como rodar o projeto

1. Abra o projeto em sua IDE Java.
2. Execute a classe principal (`SpringWebApplication.java`).
3. O Spring Web vai subir na porta **8080**.
4. Teste os endpoints usando os exemplos acima.
