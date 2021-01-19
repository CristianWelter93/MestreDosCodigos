public class EstudoArray {
	public static void main (String[] args) {

		int[] i = new int[4], i2 = {1,2,3,4};
		Integer[] aI = new Integer[4];
		System.out.println("Valor do Array i, do tipo int, na posição 2 sem nenhum dado inserido: "+i[2]);
		System.out.println("Verificando se Array aI, do tipo INTEGER, na posição 2 sem nenhum dado inserido é NULL: "+ (aI[2] == null));
		System.out.println("Array i2 na posição 2 com dados inseridos na declaração: "+i2[2]+"\n");
		System.out.println("Tamanho do Array de int: "+i2.length+"\n");
		i[2]=50;
		System.out.println("Inserindo novo valor em i[2]: "+i[2]+"\n");

		char[] escrever = {'E','S','C','R','E','V','E','R'};
		System.out.println("Imprimindo valores do array de char");
		for (char k: escrever)
		{
			System.out.println(k);
		}
		System.out.println("\n \nDOUBLE");
		Double[] d = new Double[3];
		d[0]=1.5;
		d[1]=2.0;
		d[2]=d[0]+d[1];
		System.out.println(" d[0]: "+d[0]+"\n d[1]: "+d[1]+"\n d[2] = d[0] + d[1]: "+ d[2]);
	}
}
