import java.math.BigDecimal;

public class ConversaoBigDecimal
{
	public static void main(String[] args) {
		String numeroString= "1000000000000000000.65487894564";

		BigDecimal bigDecimal = new BigDecimal(numeroString);

		System.out.println("Conversão String para Bigdecimal: \n"+numeroString + "->" + bigDecimal+"\n" );
		
		Double numeroDouble = 572.85;

		//Uso valueOf para não ter que especificar o numero de casas depois da virgula consideradas na conversão utilizando o MathContext
		bigDecimal = BigDecimal.valueOf(numeroDouble);

		System.out.println("Conversão Double para Bigdecimal: \n"+ numeroDouble + "->" + bigDecimal+"\n"  );
		
		arredondamentos();

	}
	
	public static void arredondamentos(){
	    BigDecimal b1;
	    BigDecimal b2;
	    BigDecimal b3;
	    BigDecimal b4;
	    BigDecimal b5;
	    BigDecimal b6;
	    BigDecimal resultado1;
	    BigDecimal resultado2;
	    
	    //Adição BigDecimal passado como String
	    
	    b1 = new BigDecimal("0.1");
	    b2 = new BigDecimal("0.2");
	    resultado1 = b1.add(b2);
	    
	    //Adição BigDecimal passado como Double
	    b3 = new BigDecimal(0.1);
	    b4 = new BigDecimal(0.2);
	    resultado2 = b3.add(b4);
	    
	    System.out.println("Soma com bigdecimal passado como String: "+b1 +" + "+b2+" = "+ resultado1 );
	    System.out.println("Soma com bigdecimal passado como double: "+b3 +" + "+b4+" = "+ resultado2 +"\n");
	    
	    //Adição
	    
	    b5 = new BigDecimal("1.789654");
	    b6 = new BigDecimal("1.23456");
	    System.out.println("Adição sem arredondamento: 1.789654 + 1.23456                             = "
	    + b5.add(b6) );
	    //Arredonda em direção ao +infinito
	    System.out.println("Adição com  arredondamento ROUND_CEILING, 2 casas: 1.789654 + 1.23456     = "
	    + b5.add(b6).setScale(2, BigDecimal.ROUND_CEILING));
	    //Arredonda para o zero
	    System.out.println("Adição com  arredondamento ROUND_DOWN, 2 casas: 1.789654 + 1.23456        = "
	    + b5.add(b6).setScale(2, BigDecimal.ROUND_DOWN));
	    //Arredonda em direção ao -infinito
	    System.out.println("Adição com  arredondamento ROUND_FLOOR, 2 casas: 1.789654 + 1.23456       = "
	    + b5.add(b6).setScale(2, BigDecimal.ROUND_FLOOR));
	    //Arredonda em direção ao "vizinho mais próximo" a menos que esteja no meio, dai arredonda para baixo
	    System.out.println("Adição com  arredondamento ROUND_HALF_DOWN, 2 casas: 1.789654 + 1.23456   = "
	    + b5.add(b6).setScale(2, BigDecimal.ROUND_HALF_DOWN));
	    //Arredonda em direção ao "vizinho mais próximo" a menos que esteja no meio, dai arredonda para cima
	    System.out.println("Adição com  arredondamento ROUND_HALF_UP, 2 casas: 1.789654 + 1.23456     = "
	    + b5.add(b6).setScale(2, BigDecimal.ROUND_HALF_UP));
	    //Arredonda em direção ao "vizinho mais próximo" a menos que esteja no meio, dai arredonda para o vizinho par
	    System.out.println("Adição com  arredondamento ROUND_HALF_EVEN, 2 casas: 1.789654 + 1.23456   = "
	    + b5.add(b6).setScale(2, BigDecimal.ROUND_HALF_EVEN));
	    //Arredonda para longe do zero
	    System.out.println("Adição com  arredondamento ROUND_UP, 2 casas: 1.789654 + 1.23456          = "
	    + b5.add(b6).setScale(2, BigDecimal.ROUND_UP)+"\n");
	    
	    //Subtração
	    
	    System.out.println("Subtração sem arredondamento: 1.789654 - 1.23456                             = "
	    + b5.subtract(b6) );
	    //Arredonda em direção ao +infinito
	    System.out.println("Subtração com  arredondamento ROUND_CEILING, 2 casas: 1.789654 - 1.23456     = "
	    + b5.subtract(b6).setScale(2, BigDecimal.ROUND_CEILING));
	    //Arredonda para o zero
	    System.out.println("Subtração com  arredondamento ROUND_DOWN, 2 casas: 1.789654 - 1.23456        = "
	    + b5.subtract(b6).setScale(2, BigDecimal.ROUND_DOWN));
	    //Arredonda em direção ao -infinito
	    System.out.println("Subtração com  arredondamento ROUND_FLOOR, 2 casas: 1.789654 - 1.23456       = "
	    + b5.subtract(b6).setScale(2, BigDecimal.ROUND_FLOOR));
	    //Arredonda em direção ao "vizinho mais próximo" a menos que esteja no meio, dai arredonda para baixo
	    System.out.println("Subtração com  arredondamento ROUND_HALF_DOWN, 2 casas: 1.789654 - 1.23456   = "
	    + b5.subtract(b6).setScale(2, BigDecimal.ROUND_HALF_DOWN));
	    //Arredonda em direção ao "vizinho mais próximo" a menos que esteja no meio, dai arredonda para cima
	    System.out.println("Subtração com  arredondamento ROUND_HALF_UP, 2 casas: 1.789654 - 1.23456     = "
	    + b5.subtract(b6).setScale(2, BigDecimal.ROUND_HALF_UP));
	    //Arredonda em direção ao "vizinho mais próximo" a menos que esteja no meio, dai arredonda para o vizinho par
	    System.out.println("Subtração com  arredondamento ROUND_HALF_EVEN, 2 casas: 1.789654 - 1.23456   = "
	    + b5.subtract(b6).setScale(2, BigDecimal.ROUND_HALF_EVEN));
	    //Arredonda para longe do zero
	    System.out.println("Subtração com  arredondamento ROUND_UP, 2 casas: 1.789654 - 1.23456          = "
	    + b5.subtract(b6).setScale(2, BigDecimal.ROUND_UP)+"\n");
	    
	    //Multiplicacao
	    
	    System.out.println("Multiplicação sem arredondamento: 1.789654 * 1.23456                             = "
	    + b5.multiply(b6) );
	    //Arredonda em direção ao +infinito
	    System.out.println("Multiplicação com  arredondamento ROUND_CEILING, 2 casas: 1.789654 * 1.23456     = "
	    + b5.multiply(b6).setScale(2, BigDecimal.ROUND_CEILING));
	    //Arredonda para o zero
	    System.out.println("Multiplicação com  arredondamento ROUND_DOWN, 2 casas: 1.789654 * 1.23456        = "
	    + b5.multiply(b6).setScale(2, BigDecimal.ROUND_DOWN));
	    //Arredonda em direção ao -infinito
	    System.out.println("Multiplicação com  arredondamento ROUND_FLOOR, 2 casas: 1.789654 * 1.23456       = "
	    + b5.multiply(b6).setScale(2, BigDecimal.ROUND_FLOOR));
	    //Arredonda em direção ao "vizinho mais próximo" a menos que esteja no meio, dai arredonda para baixo
	    System.out.println("Multiplicação com  arredondamento ROUND_HALF_DOWN, 2 casas: 1.789654 * 1.23456   = "
	    + b5.multiply(b6).setScale(2, BigDecimal.ROUND_HALF_DOWN));
	    //Arredonda em direção ao "vizinho mais próximo" a menos que esteja no meio, dai arredonda para cima
	    System.out.println("Multiplicação com  arredondamento ROUND_HALF_UP, 2 casas: 1.789654 * 1.23456     = "
	    + b5.multiply(b6).setScale(2, BigDecimal.ROUND_HALF_UP));
	    //Arredonda em direção ao "vizinho mais próximo" a menos que esteja no meio, dai arredonda para o vizinho par
	    System.out.println("Multiplicação com  arredondamento ROUND_HALF_EVEN, 2 casas: 1.789654 * 1.23456   = "
	    + b5.multiply(b6).setScale(2, BigDecimal.ROUND_HALF_EVEN));
	    //Arredonda para longe do zero
	    System.out.println("Multiplicação com  arredondamento ROUND_UP, 2 casas: 1.789654 * 1.23456          = "
	    + b5.multiply(b6).setScale(2, BigDecimal.ROUND_UP)+"\n");
	    
	     //Divisao
	    
	    System.out.println("Divisao sem arredondamento não é possível, gera ArithmeticException          "
	    );
	    //Arredonda em direção ao +infinito
	    System.out.println("Divisao com  arredondamento ROUND_CEILING, 2 casas: 1.789654 / 1.23456     = "
	    + b5.divide(b6,2, BigDecimal.ROUND_CEILING));
	    //Arredonda para o zero
	    System.out.println("Divisao com  arredondamento ROUND_DOWN, 2 casas: 1.789654 / 1.23456        = "
	    + b5.divide(b6,2, BigDecimal.ROUND_DOWN));
	    //Arredonda em direção ao -infinito
	    System.out.println("Divisao com  arredondamento ROUND_FLOOR, 2 casas: 1.789654 / 1.23456       = "
	    + b5.divide(b6,2, BigDecimal.ROUND_FLOOR));
	    //Arredonda em direção ao "vizinho mais próximo" a menos que esteja no meio, dai arredonda para baixo
	    System.out.println("Divisao com  arredondamento ROUND_HALF_DOWN, 2 casas: 1.789654 / 1.23456   = "
	    + b5.divide(b6,2, BigDecimal.ROUND_HALF_DOWN));
	    //Arredonda em direção ao "vizinho mais próximo" a menos que esteja no meio, dai arredonda para cima
	    System.out.println("Divisao com  arredondamento ROUND_HALF_UP, 2 casas: 1.789654 / 1.23456     = "
	    + b5.divide(b6,2, BigDecimal.ROUND_HALF_UP));
	    //Arredonda em direção ao "vizinho mais próximo" a menos que esteja no meio, dai arredonda para o vizinho par
	    System.out.println("Divisao com  arredondamento ROUND_HALF_EVEN, 2 casas: 1.789654 / 1.23456   = "
	    + b5.divide(b6,2, BigDecimal.ROUND_HALF_EVEN));
	    //Arredonda para longe do zero
	    System.out.println("Divisao com  arredondamento ROUND_UP, 2 casas: 1.789654 / 1.23456          = "
	    + b5.divide(b6,2, BigDecimal.ROUND_UP)+"\n");
	    
	    
	    //Potencia
	    System.out.println("Potencia sem arredondamento: 1.789654^2                             = "
	    + b5.pow(2) );
	    //Arredonda em direção ao +infinito
	    System.out.println("Potencia com  arredondamento ROUND_CEILING, 2 casas: 1.789654^2     = "
	    + b5.pow(2).setScale(2, BigDecimal.ROUND_CEILING));
	    //Arredonda para o zero
	    System.out.println("Potencia com  arredondamento ROUND_DOWN, 2 casas: 1.789654^2        = "
	    + b5.pow(2).setScale(2, BigDecimal.ROUND_DOWN));
	    //Arredonda em direção ao -infinito
	    System.out.println("Potencia com  arredondamento ROUND_FLOOR, 2 casas: 1.789654^2       = "
	    + b5.pow(2).setScale(2, BigDecimal.ROUND_FLOOR));
	    //Arredonda em direção ao "vizinho mais próximo" a menos que esteja no meio, dai arredonda para baixo
	    System.out.println("Potencia com  arredondamento ROUND_HALF_DOWN, 2 casas: 1.789654^2   = "
	    + b5.pow(2).setScale(2, BigDecimal.ROUND_HALF_DOWN));
	    //Arredonda em direção ao "vizinho mais próximo" a menos que esteja no meio, dai arredonda para cima
	    System.out.println("Potencia com  arredondamento ROUND_HALF_UP, 2 casas: 1.789654^2     = "
	    + b5.pow(2).setScale(2, BigDecimal.ROUND_HALF_UP));
	    //Arredonda em direção ao "vizinho mais próximo" a menos que esteja no meio, dai arredonda para o vizinho par
	    System.out.println("Potencia com  arredondamento ROUND_HALF_EVEN, 2 casas: 1.789654^2   = "
	    + b5.pow(2).setScale(2, BigDecimal.ROUND_HALF_EVEN));
	    //Arredonda para longe do zero
	    System.out.println("Potencia com  arredondamento ROUND_UP, 2 casas: 1.789654^2          = "
	    + b5.pow(2).setScale(2, BigDecimal.ROUND_UP)+"\n");
	    
	    //Comparação entre BigDecimal
	    BigDecimal big1 = new BigDecimal("0.1");
	    BigDecimal big2 = new BigDecimal("0.1");
	    BigDecimal big3 = new BigDecimal("0.4");
	    
	    System.out.println("Comparação de BigDecimal\n");
	    System.out.println("big1 : "+big1);
	    System.out.println("big2 : "+big2);
	    System.out.println("big3 : "+big3);
	    //Retorna 0 se igual
	    System.out.println("big1 em relação a big2 ->  "+big1.compareTo(big2) + " = IGUALDADE");
	    
	    
	    //Retorna -1 se big1 < big3
	    System.out.println("big1 em relação a big3 -> "+big1.compareTo(big3)+ " = MENOR");
	    
	    //Retorna 1 se big3 > big1
	    System.out.println("big3 em relação a big1 ->  "+big3.compareTo(big1)+ " = MAIOR");
	    
	    
	    return;
	}

}
