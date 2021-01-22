# ArithmeticException
	Ocorre quando alguma operação aritmética é invalida, como por exemplo a divisão por zero.
	Também pode-se lançar esse tipo de exceção quando os valores violam alguma regra de negócio do código que está sendo implementado, como por exemplo:

    int divida = 100;
    int pagamento = 50;

    if(divida < pagamento) {
      throw new ArithmeticException ("O valor de pagamento não pode ser menor que a dívida");
    }

# ArrayIndexOutOfBoundsException
	Este erro ocorre quando se tenta especificar um index inválido  de um array, seriam indexes negativos ou com valor igual o maior que o tamanho da lista.

    List<Integer> array = new ArrayList<>();
    array.add(1);
	
    array.get(-1); //Index negativo

    array.get(1); //O único index existente no array atual é o 0 


# ClassNotFoundException
	Ocorre quando alguma classe não é encontrada no classpatch. Apesar de no design-time ao se tentar importar uma classe não existente a IDE mostrar um erro e não permitir a execução do programa, existem casos como o carregamento de classes via String em que este erro pode ocorrer.
	Há três métodos básicos onde este erro pode ocorrer:
	* forName da classe Class;
	* findSystemClass da classe ClassLoader;
	* LoadClass da classe ClassLoader;

	Porém por ser do tipo Checked, já se é exigida a implementação de seu tratamento. Exemplo:

    try {

     Object o = Class.forName("pacote.NaoExiste").newInstance();

    } catch (ClassNotFoundException e) {

     System.err.println("A classe pacote.NaoExiste não existe.");
     e.printStackTrace();
    } 

# IOException
	Ocorre quando algum sinal de entrada/saída falha ou é interrompido, por exemplo uma leitura de um arquivo em disco, também é um checked exception.

    BufferedReader br = null;
    try {
     br = new BufferedReader(new FileReader("/tmp/arquivoInexistente"));
    } catch (IOException e) {
     e.printStackTrace();
    }

# IllegalArgumentException
	Esta exception é geralmente utilizada para validar parâmetros que não estão nas condições adequadas do programa. Como por exemplo limitar a nota de um aluno a 100:

    if(nota > 100) {
     throw new IllegalArgumentException("A nota não pode ser maior que 100, viola a integridade da aplicação");
    }

# InterruptedException 
	Lançada quando uma thread está aguardando, dormindo ou pausada e uma outra thread a interrompe.

# NullPointerException
	É a que ocorre com maior frequência, ela é lançada quando se tenta acessar um objeto com valor null.

    ArrayList array= null;
    System.out.println(array.size());
