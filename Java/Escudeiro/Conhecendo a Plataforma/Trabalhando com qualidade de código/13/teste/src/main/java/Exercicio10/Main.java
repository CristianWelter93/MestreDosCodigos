package Exercicio10;

import java.time.LocalDate;

public class Main {
    public static void main (String[] args) {
        System.out.println("\nUtilizando método estático Pessoa.getQuantidadePessoas()");
        System.out.println("Quantidade de Pessoas criadas: "+ Pessoa.getQuantidadePessoas());

        System.out.println("\nCriando Pessoa p1 através do construtor padrão new Pessoa()");
        Pessoa p1 = new Pessoa();
        System.out.println("Quantidade de Pessoas criadas: "+ Pessoa.getQuantidadePessoas());
        System.out.println("Pessoa Criada: "+ p1);

        System.out.println("\nCriando Pessoa p2 através da sobrecarga do construtor que contém os atributos nome" +
                " e nascimento");
        Pessoa p2 = new Pessoa("Ana", LocalDate.of(1993,5,6));
        System.out.println("Quantidade de Pessoas criadas: "+ Pessoa.getQuantidadePessoas());
        System.out.println("Pessoa Criada: "+ p2);

        System.out.println("\nEncapsulamento: Adicionando valores as variáveis privadas através do método set");
        p1.setCpf("111.111.111-00");
        p1.setNome("João");
        p1.setNascimento(LocalDate.of(1997,9,6));
        p1.setTelefone("(44) 991323232");
        p2.setCpf("222.222.222-00");
        p2.setTelefone("(44) 992222232");
        System.out.println("P1: "+ p1);
        System.out.println("P2: "+ p2);

        System.out.println("\nEncapsulamento: O atributo ultimoAcesso é public, então pode ser alterado sem a" +
                " necessidade do método set");
        p1.ultimoAcesso = (LocalDate.now());
        p2.ultimoAcesso = (LocalDate.now());
        System.out.println("P1: "+ p1);
        System.out.println("P2: "+ p2);

        System.out.println("\nDesativando Pessoa P1 através de método que não possui parâmetro");
        p1.desativar();
        System.out.println("P1 está ativo? "+ p1.isAtivo());
        System.out.println("P2 está ativo? "+ p2.isAtivo());

        System.out.println("\nUtilizando sobrecarga no método getIdade() para exibir a idade da P2 em relação a data de" +
                " hoje e em relação a uma data informada");
        System.out.println("P2 idade em relação a data atual: "+ p2.getIdade());
        System.out.println("P2 idade no dia 01/01/2000: "+ p2.getIdade(LocalDate.of(2000,01,01)));

        System.out.println("\nUtilizando método estático Pessoa.getQuantidadePessoas() " +
                "e Pessoa.getQuantidadePessoasAtivas()");
        System.out.println("Quantidade de Pessoas criadas: "+ Pessoa.getQuantidadePessoas());
        System.out.println("Quantidade de Pessoas ativas: "+ Pessoa.getQuantidadePessoasAtivas());

    }
}
