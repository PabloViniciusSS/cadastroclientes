
# NotasAluno

Programa feito como forma de estudo, é um cadastro de clientes Simples feito na linguagem Java



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
## Documentação da API (Obs: onde tem a {id} coloca o id do cliente que deseja procurar, atualizar ou excluir).

#### Retorna todos os clientes:

```http
  GET: /clientes
```


#### Retorna um cliente especifico:

```http
  GET: /clientes/{id}
```


#### Para criar novos clientes:

```http
  POST: /clientes
```

#### Para atualizar um clientes:


```http
  PUT: /clientes/{id}
```


#### Para deletar um clientes:


```http
  DEL: /clientes/{id}
```




