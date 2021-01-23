# Frameworks de teste unitários
## JUnit
	Framework para rodar de forma automática todos os método criados e para realizar as validações de
regras de negócio estabelecidas pelo sistema. Suas principais vantagens são:
* JUnit pode verificar se cada unidade de código funciona da forma esperada;
* Facilita a criação, execução automática de testes e a apresentação dos resultados;
* Orientado a Objeto;
* Gratuito;
* Melhor compatibilidade com as últimas versões da JDK.
* Melhor integração com as IDEs
* Amplamente utilizado.

## JBehave
	Se baseia no auxílio ao desenvolvimento orientado ao comportamento (BDD) ,que é uma evolução do TDD. O BDD visa minimizar falhas de comunicação entre o pessoal de negócio e o pessoal técnico.
	Para isto utiliza uma linguagem semi-formal para facilitar a consistência e leitura do código entre os membros da equipe (técnicos ou não).
	O objetivo é que o próprio teste possa valer como documentação do sistema
	O seu uso consiste em 3 passos:
* A implementação de uma classe POJO com anotações para criar uma correspondência entre o texto da estória e os métodos dessa classe.
* A criação de uma estória (essencialmente um arquivo de texto com extensão .story)
* A implementação de um embedder, para que as estórias sejam executadas através de um framework de testes como o JUnit.

## Serenity
	Também é voltada para a aplicão do BDD, e tem eles como seus conceitos principais.
	Os seus requisitos são organizados em três níveis:
* capacidades;
* caracteristicas;
* estórias; 
	Possuem os Steps, que é onde se colocam os comportamentos e retornos esperados. Se utiliza uma notação @Steps ou se descreve o comportamento esperado e logo abaixo está o método que manipula o código.
	Assim como o JBehave o Serenety não apenas exibe os resultados dos testes mas também os utiliza para gerar a documentação para descrever os requisitos e comportamentos da aplicação.
	É possível entrega-lo como um framework já existente na aplicação como o JBehave.
## TestNG
	Ele é baseado no JUnit e no NUnit porém trás com eles algumas novas funcionalidades que o deixam mais poderoso e fácil de usar, como por exemplo:
* Testa se o código é multithread safe;
* Configurações de teste flexível;
* Suporta data-driven testing (criação de caso de teste positivos e negativos em um único teste);
* Surportado por uma variedade de ferramentas e plugins;
* Incorpora BeanShell para maior flexibilidade.
* Funções JDK para runtime and loggin por default;
	Sua utilização é bem parecida com o JUnit.

	
## Selenide
	Mais voltada para os teste funcionais de aplicações web, é uma wrapper para o Selenium Web Driver que executa uma gravação mais ágil e fácil dos testes de UI, além de oferecer uma ótima sintaxe para a escrita de testes em Java.
	Ela vem derivada da Selenium, porém nesta era necessário sempre repetir o mesmo código para iniciar o navegador, fechar, capturar telas, etc.
	Alguns métodos que ela implementa:
* API concisa inspirada em JQuery;
* Captura de telas automáticas em falhas de testes;
* Manipulação automática do ciclo de vida do navegador;
* Manipulação automática da maioria dos problemas com ajax, timeouts e espera.
* Manipulação de radiobutton;
* Seleção de caixa de seleção.

## Spock 
	Framework de testes para aplicações Java e Groovy. Suas características são:
* Teste mais legível e organizado, permite escrever os métodos de forma declarativa e manter o corpo de teste mais simples e conciso;
* Impõe separações de fases, utilizando os blocos: given, when, then;
* Não há necessidade de conhecimento dos métodos "assertion" do JUnit pois utiliza os mesmo operadores de comparação do Java;
* Versatilidade de parametrização de testes: permite a criação de vários cenários de forma mais simples utilizando o bloxo "where" onde se coloca todos os casos possíveis;
* Framework Mock é integrado;



# Escolha do Framework e exercícios.

	Será utilizado o JUnit por ser o mais amplamente utilizado, ter mais documentação e também por ser o que mais tenho tido contato nos projetos que participei dentro da DB1.
	O exercício escolhidos foram:

	10 e 11 (POO): por serem exercícios em que foram implementados mais métodos;
	12. Excepctions: para que através dos teste unitários se comprovar que uma exceção está sendo lançada.

	Foi utilizado o maven para a criação do projeto onde estão os testes.