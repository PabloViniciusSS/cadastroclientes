
# Cadastro Cliente

Programa feito como forma de estudo, é um cadastro de alunos Simples feito na linguagem Java



## Autores

- [@PabloVinicius](https://www.github.com/PabloViniciusSS)


## Rodando localmente

Clone o projeto

```bash
  git clone https://github.com/PabloViniciusSS/cadastroclientes
```

É necessario ter o JDK instalado, foi utilizado o Maven para gerenciar os pacotes.
## Stack utilizada

**Back-end:** Java, Spring Data JPA, Spring Framework, Postgresql.



## 🛠 Habilidades
Java, Api Rest, Banco de Dados, Postgresql...


## Aprendizados

O que você aprendeu construindo esse projeto? Quais desafios você enfrentou e como você superou-os?

Absorve melhor como utilizar o JPA, como dividir as pastas do projeto para ficar mais coeso e facilitar o entendimento, Os desafios foi superados com estudo e testes.
## Documentação da API (Obs: onde tem a {id} coloca o id do cliente, para excluir, atualizar ou pesquisar).

#### Retorna todos os Clientes:

```http
  GET: /clientes
```

#### Retorna um cliente especifico:

```http
  GET: /clientes/{id}
```

| Parâmetro   | Tipo       | Descrição                           |
| :---------- | :--------- | :---------------------------------- |
| `id` | `string` | **Obrigatório**. Id do Cliente|


#### Para criar novos clientes:

```http
  POST: /clientes
```

| Parâmetro   | Tipo       | Descrição                                   |
| :---------- | :--------- | :------------------------------------------ |
| `nome`      | `string` | **Obrigatório**. O Nome do Cliente |
| `cpf`      | `string` | **Obrigatório**. O CPF do Cliente |
| `bairro`      | `string` | **Obrigatório**. O bairro do Cliente |
| `dataDeNascimento`  | `string` | **Obrigatório**. A data de nascimento do Cliente |




#### Para atualizar um clientes:


```http
  PUT: /clientes/{id}
```

| Parâmetro   | Tipo       | Descrição                                   |
| :---------- | :--------- | :------------------------------------------ |
| `nome`      | `string` | **Obrigatório**. O Nome do Cliente |
| `cpf`      | `string` | **Obrigatório**. O CPF do Cliente |
| `bairro`      | `string` | **Obrigatório**. O bairro do Cliente |
| `dataDeNascimento`  | `string` | **Obrigatório**. A data de nascimento do Cliente |




#### Para deletar um clientes:


```http
  DEL: /clientes/{id}
```


| Parâmetro   | Tipo       | Descrição                                   |
| :---------- | :--------- | :------------------------------------------ |
| `alunoId`      | `int` | **Obrigatório**. O Id do cliente |





## Variáveis de Ambiente

Para rodar esse projeto, você vai precisar adicionar o caminho do banco na pasta resource application.yml.


