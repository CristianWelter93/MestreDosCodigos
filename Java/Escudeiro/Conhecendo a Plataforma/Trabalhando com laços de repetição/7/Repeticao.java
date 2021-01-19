public class Repeticao {
	public static void main (String[] args) {

		int[] vectorFor = new int[4];		
		int[] vectorFor2 = {1,2,3,4};
		int[] vectorFor3 = {1,2,3,4};

		for(int i=0; i< 4; i++)
		{
			vectorFor[i]=i+1;
		}

		int valorWhile =20;
		while(valorWhile < 20){
			valorWhile +=20;	
		}

		int valorDoWhile =20;
		do {
			valorDoWhile +=20;		
		}while (valorDoWhile < 20);

		System.out.println("Vector preenchido com for \n");
		for(int elemento: vectorFor) {
			System.out.println(elemento);
		}

		System.out.println("Somando de 20 ao valor 20 enquanto valor for menor que 20:");
		System.out.println("Resultado usando While:"+valorWhile );
		System.out.println("Resultado usando Do While:"+valorDoWhile+"\n" );
		
		for(int i=0; i< 4; i++)
		{
			if(vectorFor2[i]==2) {
				break;
			}
			vectorFor2[i]=0;
			
		}

		System.out.println("Conteúdo do vetor sendo preenchido por 0 até encontrar o break (quando valor é igual a 2), saindo do laço de repetição \n");
		for(int elemento: vectorFor2) {
			System.out.println(elemento);
		}

		for(int i=0; i< 4; i++)
		{
			if(vectorFor3[i]==2) {
				continue;
			}
			vectorFor3[i]=0;
		}


		System.out.println("Conteúdo do vetor sendo preenchido por 0 menos na interação do continue (quando valor é igual a 2) \n");		for(int elemento: vectorFor3) {
			System.out.println(elemento);
		}
		
	}
}
