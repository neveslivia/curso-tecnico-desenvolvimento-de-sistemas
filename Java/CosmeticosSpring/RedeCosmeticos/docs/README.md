
# Projeto do software de uma rede de cosméticos usando Spring Boot


## Projeto Spring Boot

Este repositório contém um projeto desenvolvido com o framework **Spring Boot**, com foco em construção de APIs RESTful utilizando **DTOs**, **Exception Handling**, **Model**, **Repository**, **Service** e integração com **Banco de Dados em Memória** na criação de um ‘software’ para rede de cosméticos Maresia Beauty(nome fictício).
## Descrição

Este projeto foi desenvolvido em conjunto e aborda os seguintes pontos:
- Configuração de um projeto Spring Boot.
- Criação de **Models**, **Repositories**, **DTOs** e **Services**.
- Tratamento de exceções com **@ExceptionHandler**.
- Conexão e persistência de dados com banco de dados em memória (H2).
- Métodos HTTP (GET, POST, PUT, DELETE) para interação com a API.

## Autoras
- Lívia Estevam
- Yasmin Martimiano

## Estrutura do Projeto

O projeto segue uma estrutura organizada, com as principais camadas do Spring Boot divididas conforme os padrões do framework:

- **Model**: Contém a definição de entidades como `Estoque` e `Nota Fiscal`.
- **Repository**: Interface para manipulação dos dados no banco.
- **Service**: Lógica de negócios, encapsulando a manipulação dos dados.
- **Controller**: Gerencia as requisições HTTP e interage com os serviços.
- **DTO**: Objetos de transferência de dados para comunicação entre cliente e servidor.
- **Exceptions**: Tratamento de exceções personalizadas.

## Exemplos de Funcionalidades Implementadas

- **GET /fornecedores**: Retorna todos os fornecedores cadastrados.
- **POST /produto**: Cria um novo produto no banco de dados.
- **PUT /contas-a-receber/{id}**: Atualiza as informações de uma conta a receber.
- **DELETE /produto/{id}**: Remove um produto do banco de dados.


