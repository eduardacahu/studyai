# DECISÕES DO PROJETO

## Escolha da Stack

Para o desenvolvimento do StudyAI, optamos por utilizar Java com Spring Boot, por ser uma tecnologia amplamente utilizada no desenvolvimento de aplicações web e APIs REST. O Spring Boot também permitiu organizar o projeto de forma clara, separando as responsabilidades entre controllers e services. O Maven foi utilizado para gerenciamento das dependências, execução dos testes e padronização do processo de build.

Como solução de Inteligência Artificial Generativa, escolhemos a API Gemini, do Google. A integração foi realizada através de requisições HTTP, permitindo que o StudyAI envie as perguntas realizadas pelo usuário e apresente as respostas geradas pela Inteligência Artificial.

Também foi desenvolvida uma interface web utilizando HTML, CSS e JavaScript, permitindo que o usuário utilize a aplicação diretamente pelo navegador, sem precisar realizar as requisições manualmente.

## DevOps e Deploy

Para o versionamento do projeto, utilizamos Git e GitHub, realizando commits durante as diferentes etapas do desenvolvimento.

Foi configurado um pipeline de Integração Contínua utilizando GitHub Actions. A cada push ou pull request realizado na branch principal, o workflow executa automaticamente o build e os testes da aplicação. Dessa forma, é possível identificar problemas antes que novas alterações sejam consideradas válidas.

Também utilizamos Docker para conteinerizar a aplicação e facilitar sua execução em diferentes ambientes. O deploy foi realizado no Render, deixando o StudyAI disponível através de uma URL pública. O serviço está integrado ao repositório, permitindo a atualização da aplicação após novas alterações enviadas ao GitHub.

## Segurança

Uma preocupação durante o desenvolvimento foi evitar a exposição da chave utilizada para acessar a API Gemini. Por esse motivo, a credencial não foi armazenada diretamente no código-fonte. A aplicação utiliza uma variável de ambiente chamada `GEMINI_API_KEY`, permitindo configurar a chave de maneira separada do código.

Também foi criado um arquivo `.env.example`, que demonstra a configuração necessária sem armazenar a credencial verdadeira.

## Testes

Foram adicionados testes automatizados para verificar o carregamento do contexto da aplicação e o funcionamento de um dos endpoints. Os testes podem ser executados localmente através do Maven e também fazem parte do processo automatizado executado pelo GitHub Actions.

Essa etapa foi importante para compreender como testes automatizados podem ser integrados a um fluxo de CI e utilizados para aumentar a confiabilidade das alterações realizadas no projeto.

## Aprendizados

Durante o desenvolvimento do StudyAI, tivemos contato prático com diferentes etapas do ciclo de desenvolvimento de software. Além da criação de uma aplicação com Spring Boot, aprendemos a integrar um serviço externo de Inteligência Artificial, trabalhar com variáveis de ambiente, desenvolver uma interface web e publicar uma aplicação em ambiente de produção.

Também enfrentamos situações que exigiram investigação e correção, como configuração da variável de ambiente, conflitos de porta durante a execução local, configuração dos testes e ajustes na comunicação com a API.

O projeto permitiu compreender melhor como desenvolvimento, testes, versionamento, integração contínua, Docker e deploy podem fazer parte de um mesmo fluxo de DevOps.

Ao final, o StudyAI se tornou uma aplicação web funcional, integrada à Inteligência Artificial Generativa, com testes automatizados, pipeline de CI, conteinerização e deploy em nuvem.