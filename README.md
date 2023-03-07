# Gerenciamento-de-Medicamentos

A aplicação deve ter as seguintes funcionalidades:
1. Medicamentos
  - [x] Listar os medicamentos
  - [x] Adicionar um novo medicamento
  - [x] Atualizar um medicamento
  - [x] Excluir um medicamento
  - [x] Listar um medicamento pelo id

2. Reações Adversas
  - [x] Listar as reações adversas
  - [x] Adicionar uma nova reação adversa
  - [x] Atualizar uma reação adversa
  - [x] Excluir uma reação adversa

  # Sumário

- [Habilidades desenvolvidas](#habilidades-desenvolvidas)
- [Tecnologias utilizadas](#tecnologias-utilizadas)
- [Pré-requisitos](#pré-requisitos)
  - [Ferramentas necessárias](#ferramentas-necessárias)
  - [Rodando no servidor local](#rodando-no-servidor-local)
- [Autora](#autora)

  ---

# Habilidades desenvolvidas

- A API foi desenvolvida com a linguagem Java e com Spring Boot.
- O teste foi criado com JUnit e SpringBootTest.
- O banco de dados utilizado foi o Postegres.
- Teste das rotas utilizando Insomnia.
- Criação, leitura, edição e exclusão (CRUD).

---

# Tecnologias utilizadas

- [Java](https://www.java.com/pt-BR/)
- [Spring](https://start.spring.io/)
- [JUnit](https://junit.org/junit5/)
- [Postegres](https://www.postgresql.org/)
- [Docker](https://www.docker.com/)
- [Insomnia](https://insomnia.rest/)

---

# Pré-requisitos

## Ferramentas necessárias

Para rodar o projeto, você vai precisar instalar as seguintes ferramentas:
 - [Git](https://git-scm.com);
 - [Java](https://www.java.com/pt-BR/);
 - [Spring](https://start.spring.io/);
 - [Docker](https://www.docker.com/);
 - Um editor para trabalhar com o código como [VSCode](https://code.visualstudio.com/) ou outro de sua preferência;

 ---

## Rodando no servidor local

 - Clone do Projeto e realize os comandos necessários

    - Clone este repositório
    ```bash
    git clone git@gitlab.com:prgalhardo/projeto-avaliacao.git
    ```

    - Acesse a pasta do projeto no terminal/cmd
    ```bash
    cd projeto-avalicao
    ```

    - Suba os containers docker
    ```bash
    cd database-docker && docker-compose up
    ```
  
  ---

## Autora

- [@prgalhardo](https://www.github.com/prgalhardo)
