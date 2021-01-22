import java.util.*;

public class EstudoTryCatch {
    public static void estudoTryCatch() {
        List<Integer> resultados = new ArrayList<>();
	
	System.out.println("Iremos tentar colocar em uma lista o resultado das seguintes divisões: 8/2, 6/2, 6/,0, 4/2");

	try{
		resultados.add(8/2);
		resultados.add(6/2);
		resultados.add(6/0);
		resultados.add(4/2);

	}catch (ArithmeticException e) {
		System.out.println("Catch pegou uma ArithmeticException, mensagem do erro: "+e.getMessage());
		System.out.println("Devido a este erro a divisão 6/0 e 4/2 não foram adicionadas a lista, pois uma exceção foi lançada ao se dividir por zero e os próximos comandos não foram executados. A execução foi para o catch");
	}finally {
		System.out.println("\nLista de resultados das divisões impressas independente de dar erro (entrar no catch) ou não (executar todo o bloco do try)");
		System.out.println(resultados);
	}

	
	System.out.println("\nColocando na lista a divisão 4/2");

	try{
		resultados.add(4/2);
		System.out.println("\nBloco try completamente executado");

	}catch (ArithmeticException e) {
		System.out.println("Catch pegou uma ArithmeticException, mensagem do erro: "+e.getMessage());
	}finally {
		System.out.println("\nLista de resultados das divisões impressas independente de dar erro (entrar no catch) ou não (executar todo o bloco do try)");
		System.out.println(resultados);
	}
    }  
}


