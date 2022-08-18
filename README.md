<h1>Realizando Deploy na Nuvem de um conjunto de API's desenvolvida em Spring Boot </h1>
<p> Desafio de projeto <strong>Realizando Deploy na Nuvem de um conjunto de API's desenvolvida em Spring Boot</strong> oferecido gratuitamente pela plataforma de cursos online <a href="https://dio.me/"><strong> Digital Innovation One</strong></a>.<br>

## 18/08/2022 - Desafio de Projeto do Bootcamp Spring Framework Experience


⚠️ Não estou disponibilizando o link direto para o desafio, pois o mesmo faz parte da trilha de alguns Bootcamps. Logo, você terá que se matricular no Bootcamp para ter acesso ao curso.⚠️

------------

### Especialista do desafio:
- **Sandro Giacomozzi** - Software engineer - TOTVS
- LinkedIn:  [sandrogiacomozzi](https://www.linkedin.com/in/sandrogiacomozzi/).
- GitHub: [sandrogiacom](https://github.com/sandrogiacom/)
- [GitHub do Projeto Original](https://github.com/sandrogiacom/cloud-parking).

<h3>Desafio:</h3>

<ul>
    <li>Construir uma API  para controle de um estacionamento de veículos.</li>
	<li>Esta API deverá controlar a entrada e saída de veículos.</li>
	<li>Os dados deverão ser cadastrados em um banco de dados relacional.</li>
	<li>Esta API será exposta na nuvem, porém com controle de acesso.</li>
</ul>

<h3>Requisitos:</h3>

<ul>
    <li>Não teremos cadastro de Clientes.</li>
    <li>Nosso cliente é o automóvel onde guardaremos os dados:
		Placa, modelo e cor.</li>
	<li>Armazenaremos a data e hora de entrada par podermos calcular o valor na saída.</li>
	<li>Teremos apenas um tipo de usuário no sistema que será o operador do estacionamento.</li>
</ul>


### Visão Geral
Foram apresentados e abordados os seguintes tópicos:

<ol>
    <li> Apresentação do Projeto Base </li>
    <li> Criação do Repositório no GitHub.</li>
    <li> Criação do aplicativo no Heroku com integração ao GitHub para deploy automático.</li>
    <li> Configuração do banco de dados local (SGBD <em>PostgreSQL</em>)</li>
    <li> Configuração do banco de dados no Heroku (SGBD <em>PostgreSQL</em>)</li>
    <li>Execução do fluxo back-end: <em>Controller - Service - Repository</em></li>
    <li>Utilização do Design Pattern DTO para o retorno da API </li>
    <li>Documentação da API com Swagger - Spring Fox </li>
    <li>Configuração da Segurança da Aplicação com o Spring Security </li>
</ol>

<h2>❤️ Minhas Contribuições para o projeto </h2>

<ul>
    <li>Adionei documentação para cada endpoint da API Parking Controller</li>
    <li>Criei a aplicação e disponibilei no Heroku</li>
    <li>Criei uma <em>Exception</em> para a tentativa de fazer um checkout que já foi feito. </li>
</ul>

<h3>🛠 Para Testes</h3>  

<p>Deixei a API exposta no Heroku:</p>  

[Projeto rodando no Heroku](https://rsm-cloud-parking.herokuapp.com/)

<p>Para testar, acesse a página da documentação da API no Swagger:</p>  

[Documentação da API com Swagger](https://rsm-cloud-parking.herokuapp.com/swagger-ui.html)

<p>Como a aplicação está com a segurança do Spring Security, é preciso informar as credenciais abaixo:</p>

<em>User:</em> <b>user</b>  
<em>Password:</em> <b>admin</b>  

<h2>🛠 Tecnologias Utilizadas</h2>

<ul>
    <li><strong>IDE IntelliJ</strong></li>
    <li><strong>Java 11</strong></li>
    <li><strong>Maven</strong></li>
    <li><strong>Spring Web</strong></li>
    <li><strong>Spring Data JPA</strong></li>
    <li><strong>Spring Security</strong></li>
    <li><strong>PostgreSQL Driver</strong></li>
    <li><strong>Swagger - Spring Fox</strong></li>
    <li><strong>Rest Assured para testes</strong></li>
</ul>



<h2>🔗 Links Úteis</h2>
- [Spring Boot Initialzr](https://start.spring.io/)
- [Spring guides](https://spring.io/guides)
- [Spring projects](https://spring.io/projects)
- [Documentação do Maven](https://maven.apache.org/)
- [OpenJDK para download](https://openjdk.java.net/)
- [OpenJDK 11](https://jdk.java.net/java-se-ri/11)
- [Documentação do git](https://git-scm.com/)
- [Documentação do GitHub](https://docs.github.com/pt)
- [Documentação PostgreSQL](https://www.postgresql.org/docs/)
- [Download PostgreSQL](https://www.postgresql.org/download/)
- [Documentação do Springfox](https://springfox.github.io/springfox/docs/current/)
- [Documentação do REST-assured](https://github.com/rest-assured/rest-assured/wiki/GettingStarted)
- [Capítulo REST da dissertação de Roy Fielding](https://www.ics.uci.edu/~fielding/pubs/dissertation/rest_arch_style.htm)
- [Atalhos do IntelliJ IDEA](https://resources.jetbrains.com/storage/products/intellij-idea/docs/IntelliJIDEA_ReferenceCard.pdf)



### Contribuições
#### Este repositório foi criado para fins de estudo, então fique à vontade para cloná-lo, sugerir mudanças ou correções.
#### Todo comentário é muito bem vindo!🤝

Se possível:

⭐️  Star o projeto

## Autor

Feito com ❤️ por Reginaldo Santos de Medeiros 👋🏽 Entre em contato!

[![Linkedin Badge](https://img.shields.io/badge/-Reginaldo-blue?style=flat-square&logo=Linkedin&logoColor=white&link=https://www.linkedin.com/in/reginaldo-santos-de-medeiros-59517324/)](https://www.linkedin.com/in/reginaldo-santos-de-medeiros-59517324/) [![Gmail Badge](https://img.shields.io/badge/-rsanme@gmail.com-c14438?style=flat-square&logo=Gmail&logoColor=white&link=mailto:rsanme@gmail.com)](mailto:rsanme@gmail.com)

