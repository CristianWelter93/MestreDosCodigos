package Exercicio12;

public class Main {
    public static void main (String[] args) throws NotaException {
        new EstudoTryCatch().estudoTryCatch();

        System.out.println("\n********************************************************************************************************\n");
        System.out.println("\nCriando própria exception\n");

        System.out.println("\nUma nota de 120 foi atribuída a um aluno, quando isso acontece a NotaException é lançada\n");

        int valor = 120;
        int nota = verificarNota(valor);
        System.out.println(nota);


    }

    public static int verificarNota(int nota) throws NotaException {
        if(nota > 100){
            throw new NotaException();
        }
        return nota;
    }
}
