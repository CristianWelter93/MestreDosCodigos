public class Main {
    public static void main (String[] args)throws NotaException {
	
	new EstudoTryCatch().estudoTryCatch();

	System.out.println("\n********************************************************************************************************\n");
	System.out.println("\nCriando própria exception\n");
        System.out.println("\nUma nota de 120 foi atribuída a um aluno, quando isso acontece a NotaException é lançada\n");
        int nota = 120;

        if(nota > 100){
            throw new NotaException();
        }
    }
}
