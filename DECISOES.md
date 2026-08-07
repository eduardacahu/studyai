# DECISÕES DO PROJETO

## Escolha da Stack

Para o desenvolvimento do StudyAI optamos por utilizar Java com Spring Boot, pois é um dos frameworks mais utilizados para construção de APIs REST e oferece uma estrutura organizada, escalável e de fácil manutenção. Além disso, a utilização do Maven facilitou o gerenciamento das dependências do projeto e a padronização do ambiente de desenvolvimento.

Como modelo de Inteligência Artificial Generativa, escolhemos a API Gemini, do Google, por disponibilizar uma integração simples através de requisições HTTP, permitindo conectar rapidamente a aplicação com um modelo de linguagem capaz de responder perguntas dos usuários.

Para o versionamento utilizamos Git e GitHub, realizando commits frequentes durante todo o desenvolvimento. Também implementamos um pipeline de Integração Contínua (CI) utilizando GitHub Actions, garantindo que o projeto seja compilado automaticamente sempre que alterações forem enviadas ao repositório.

## Aprendizados

Durante o desenvolvimento aprendemos conceitos importantes relacionados ao desenvolvimento de APIs REST, integração com serviços externos, gerenciamento de variáveis de ambiente e boas práticas de segurança, evitando expor chaves de acesso no código-fonte.

Também adquirimos experiência na utilização do Spring Boot para criação de endpoints, organização do projeto em controllers e services, configuração do Maven e utilização do GitHub Actions para automação do processo de build.

Outro aprendizado importante foi compreender como estruturar um projeto utilizando boas práticas de DevOps, com documentação adequada, controle de versões, integração contínua e preparação para deploy em ambiente de produção.

Ao final do projeto, conseguimos desenvolver uma aplicação funcional capaz de receber perguntas do usuário, consultar uma Inteligência Artificial Generativa e retornar respostas por meio de uma API REST, além de preparar a base para futuras evoluções, como interface web, banco de dados, testes automatizados e deploy contínuo.