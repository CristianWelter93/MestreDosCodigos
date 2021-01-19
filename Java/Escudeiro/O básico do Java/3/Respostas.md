Primeiramente eu criei um arquivo chamado Escudeiro.Java, dentro dele declarei uma classe chamada "Escudeiro". Nesta classe criei um método void e static que recebe como argumento um vetor de String chamado main.

Dentro do main eu utilizei o System.out.println para imprimir na tela o texto descrito no enunciado, e salvei o arquivo.

Instalei então o JDK no computador, em seguida foi necessário adicionar a variável de ambiente JAVA_HOME indicando o caminho do JDK (nas variáveis do sistema). Também foi alterado a variável de usuário PATCH, adicionando a ela o valor %JAVA_HOME%\bin. Esta configuração foi necessária para que pudesse ser utilizado o comando javac diretamente no terminal.

No terminal naveguei até a pasta onde estava o projeto e digitei o seguinte comando:

   javac Escudeiro.java
Ele faz com que o código seja compilado gerando um arquivo .class da classe em questão.

Depois de compilado pude digitar o comando:

   java Escudeiro

Este comando roda o código compilado exibindo a mensagem:

   Hello Word!

Para que uma classe possa ser executada pelo comando `"java"` ela deve possuir no mínimo o método `Main`, até consegue-se compilar uma classe sem o método main, porém, ela não será executável.
O método main é um método especial que contém as instruções da principal linha de execução de um programa, ou seja, de onde ele começa.

O `BYTECODE` foi gerado quando o programa foi compilado através do comando `"javac"`, o arquivo de classe gerado `.class` é formado por instruções de bytecodes que é a linguagem de máquina virtual Java.
                                                                                                                                                                                                                                                                                                                                       


