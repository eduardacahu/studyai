# StudyAI
![CI](https://github.com/eduardacahu/studyai/actions/workflows/ci.yml/badge.svg)
O **StudyAI** é uma aplicação web desenvolvida em Java com Spring Boot que utiliza Inteligência Artificial Generativa para responder perguntas e auxiliar nos estudos.

O projeto foi desenvolvido como parte do desafio de **DevOps e Inteligência Artificial**, integrando desenvolvimento de software, IA generativa, testes automatizados, integração contínua, conteinerização e deploy em nuvem.

## Aplicação em produção

O StudyAI está publicado no Render e pode ser acessado em:

https://studyai-fvyp.onrender.com

> Por utilizar uma instância gratuita do Render, o primeiro acesso pode levar alguns segundos enquanto o serviço é inicializado.

## Tecnologias utilizadas

- Java 25
- Spring Boot
- Maven
- HTML, CSS e JavaScript
- Gemini API (Google)
- REST API
- Git e GitHub
- GitHub Actions
- Docker
- Render

## Funcionalidades

O StudyAI possui uma interface web que permite ao usuário enviar perguntas e receber respostas geradas por Inteligência Artificial.

A aplicação também disponibiliza endpoints REST.

### Verificação da API

```http
GET /hello
```

Exemplo de resposta:

```text
Olá! O StudyAI está funcionando!
```

### Pergunta para Inteligência Artificial

```http
GET /perguntar?pergunta=SuaPergunta
```

A pergunta é enviada à API Gemini e a resposta gerada pela Inteligência Artificial é retornada pela aplicação.

## Configuração da API

Por segurança, a chave da API Gemini não é armazenada diretamente no código-fonte.

A aplicação utiliza a variável de ambiente:

```text
GEMINI_API_KEY
```

O arquivo `.env.example` demonstra a configuração necessária sem expor credenciais reais.

## Executando o projeto localmente

Configure a variável de ambiente `GEMINI_API_KEY` e execute:

```bash
./mvnw spring-boot:run
```

A aplicação ficará disponível em:

```text
http://localhost:8080
```

## Testes automatizados

O projeto possui testes automatizados utilizando o suporte de testes do Spring Boot.

Para executar os testes:

```bash
./mvnw test
```

Os testes também são executados automaticamente pelo pipeline de integração contínua.

## Integração Contínua

O projeto utiliza **GitHub Actions** para executar automaticamente o processo de build e testes a cada novo push ou pull request realizado na branch `main`.

O workflow realiza:

- Checkout do código-fonte;
- Configuração do Java 25;
- Configuração do ambiente Maven;
- Build da aplicação;
- Execução automática dos testes com `./mvnw clean verify`.

Dessa forma, alterações no código são verificadas automaticamente antes de serem consideradas válidas no projeto.

## Docker

O projeto possui um `Dockerfile`, permitindo que a aplicação seja construída e executada em um ambiente conteinerizado.

O Docker também é utilizado no processo de publicação da aplicação no Render.

## Deploy

O StudyAI está hospedado no **Render**.

O serviço está conectado ao repositório do GitHub e utiliza deploy automático, permitindo que novas versões da aplicação sejam publicadas após alterações enviadas para a branch principal.

## Objetivo do projeto

O objetivo do StudyAI é demonstrar, de forma prática, a integração entre uma aplicação Spring Boot e Inteligência Artificial Generativa, aplicando conceitos de DevOps como versionamento, integração contínua, testes automatizados, conteinerização, proteção de credenciais e deploy em nuvem.

## Autora

Maria Eduarda Cahu