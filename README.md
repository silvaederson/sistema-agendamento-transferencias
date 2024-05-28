# Sistema de Agendamento de Transferências - API Spring

Este é o repositório da API Spring do Sistema de Agendamento de Transferências. Este projeto foi desenvolvido como parte de uma avaliação para um sistema de agendamento de transferências financeiras.

## Tecnologias Utilizadas

- **Spring Boot**: Framework para construção de aplicativos Java baseados em Spring.
- **Spring Data JPA**: Biblioteca que simplifica a implementação de camadas de acesso a dados baseadas em JPA.
- **Spring Web**: Módulo Spring para desenvolvimento de aplicativos web.
- **H2 Database**: Banco de dados em memória para desenvolvimento e teste.
- **Java 11**: Linguagem de programação utilizada para o desenvolvimento da aplicação.
- **Maven**: Ferramenta de automação de compilação e gerenciamento de dependências para projetos Java.
- **Git**: Sistema de controle de versão distribuído para rastreamento de alterações no código fonte.
- **GitHub**: Plataforma de hospedagem de código-fonte e colaboração utilizando o Git.

## Estrutura do Projeto

- **/src/main/java**: Contém os arquivos do código-fonte Java do projeto.
  - **/controller**: Classes de controladores REST para lidar com as requisições HTTP.
  - **/model**: Classes de modelo que representam entidades de negócio.
  - **/repository**: Interfaces de repositório para interação com o banco de dados.
  - **/service**: Classes de serviço que contêm a lógica de negócio da aplicação.
- **/src/main/resources**: Contém os arquivos de configuração e recursos da aplicação.
  - **application.properties**: Arquivo de configuração do Spring Boot.

## Como Executar

1. Certifique-se de ter o Java Development Kit (JDK) e o Maven instalados na sua máquina.
2. Clone este repositório: `git clone https://github.com/silvaederson/sistema-agendamento-transferencias.git`
3. Navegue até o diretório do projeto: `cd sistema-agendamento-transferencias`
4. Execute o comando Maven para construir o projeto: `mvn clean install`
5. Execute o arquivo JAR gerado: `java -jar target/sistema-agendamento-transferencias.jar`


## Autor

- [Nome do Autor](https://github.com/silvaederson)

