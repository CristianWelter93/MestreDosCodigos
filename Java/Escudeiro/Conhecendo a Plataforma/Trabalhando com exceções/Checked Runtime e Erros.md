# Checked
  São aquelas exceções que são obrigadas a serem tradas, seja com um bloco try-cath ou com um throw. Elas são utilizadas para erros que podem ser tratados e que se sabe que poderão ocorrer, como por exemplo um usuário tentar pagar uma dívida com um valor menor do que o devido.
  
  São todas aquelas que descendem de Exception mas não descendem de RuntimeException. As IOException,FileNotFoundException, ClassNotFoundException por outro lado são Checked, tais exceções não são provocadas por código mal escrito ou mal testado.
# RunTime
  São provocados por código mal escrito/testado, ou seja, causado pelos desenvolvedores. ArithmeticException, IndexOutOfBoundsException e NoSuchElementException fazem parte desse tipo de exceção. Ao contrário da Checked o compilador não obriga que elas sejam tratadas, porém muitas vezes é desejável realizar um tratamento. Por exemplo, pode-se utilizar um bloco try-catch para que não ocorra a divisão de um número por zero o que geraria uma ArithmeticException.
# Error
  Eles decendem de java.lang.Error e não devem jamais ser atirados ou tratados em blocos try/catch. Esse tipo de erro é reservado para indicar problema na JVM. Temos por exemplo o OutOfMemoryError, que é lançado quando a JVM não consegue alocar um objeto porque a sua fatia de memória esgotou e não há mais memória liberada, não há necessidade de trata-lo pois a liberação de memória é feita pelo Garbage Collector. O melhor nestes casos é deixar o programa ser encerrado e encontrar alternativas para a correção do problema.
