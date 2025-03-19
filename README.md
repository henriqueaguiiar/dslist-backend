# Projeto DSList - Intensivo Java Spring

## Sobre o projeto

O **DSList** é um projeto desenvolvido no contexto do Intensivão Java Spring, com o objetivo de criar um sistema de listas de jogos usando Java, Spring Boot e tecnologias relacionadas. O backend implementa a lógica de criação, manipulação e persistência dessas listas, utilizando boas práticas de desenvolvimento de software e integração com banco de dados.

Este repositório foi criado para mostrar a implementação de um sistema simples e funcional utilizando Spring Boot, JPA, e PostgreSQL. O projeto também foi desenvolvido para ser facilmente implantado em ambiente de produção, utilizando Railway como plataforma de deployment.

## Modelo de domínio DSList
![Modelo de Domínio](https://raw.githubusercontent.com/devsuperior/java-spring-dslist/main/resources/dslist-model.png)  
O modelo de domínio acima ilustra as principais entidades do sistema e seus relacionamentos, como jogos, listas e categorias. Essas entidades são manipuladas pelo backend para atender às necessidades do sistema.

## Tecnologias utilizadas

### Back end
- Java 17: Linguagem de programação utilizada.
- Spring Boot: Framework para desenvolvimento de aplicações Java baseadas em Spring.
- JPA / Hibernate**: Implementação de persistência de dados para integrar o banco de dados com o sistema.
- Maven: Ferramenta de automação de compilação e gerenciamento de dependências.
- PostgreSQL**: Banco de dados relacional utilizado para persistir dados do sistema.
- H2: Banco de dados em memória, utilizado em ambientes de desenvolvimento e testes.
  Docker Compose: Ferramenta para orquestrar containers Docker, facilitando a configuração de ambientes locais.

### Implantação em produção
- Back end: Implantação no Railway, uma plataforma que oferece deploy automático e escalabilidade para aplicações backend.
- Banco de dados: Utilização do PostgreSQL no ambiente de produção para armazenar os dados persistentes.

## Como rodar o projeto localmente

### 1. Clonar o repositório

Para começar a utilizar o projeto localmente, clone o repositório em sua máquina:

```bash
git clone https://github.com/henriqueaguiiar/dslist-backend.git
```

### 2. Configuração do Banco de Dados

Este projeto utiliza o PostgreSQL para persistir dados, mas você pode rodar a aplicação localmente com o H2 (em memória) para facilitar o desenvolvimento. Caso prefira utilizar o PostgreSQL, basta configurar a string de conexão no arquivo `application.properties`.

- Usando Docker Compose:  
  Se quiser rodar o PostgreSQL via Docker, o repositório já contém o arquivo `docker-compose.yml` para facilitar a configuração.

  Para levantar o banco de dados no Docker, execute:

  ```bash
  docker-compose up
  ```

### 3. Rodando o Projeto

Com o banco de dados configurado, execute o projeto localmente com o Maven:

```bash
./mvnw spring-boot:run
```

A aplicação estará disponível em `http://localhost:8080`.

## Como contribuir

1. Fork este repositório.
2. Crie uma **branch** para a sua feature:  
   ```bash
   git checkout -b minha-feature
   ```
3. Faça suas alterações e **commit**:
   ```bash
   git commit -am 'Adiciona minha feature'
   ```
4. Envie suas alterações para o repositório:
   ```bash
   git push origin minha-feature
   ```
5. Abra um **Pull Request** para discutir e revisar suas alterações.

## Autor

[Henrique Aguiar Pacheco](https://www.linkedin.com/in/henrique-aguiar-35945520b/)

