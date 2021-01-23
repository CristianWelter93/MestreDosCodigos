package Exercicio11;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("\nNeste cenário existem Pessoas. Estas pessoas possuem nome, endereço e cpf e sabem se apresentar");
        Pessoa pessoa1 = new Pessoa("Carlos Pessoa","12345678","Rua Brasil");
        System.out.println(pessoa1);
        pessoa1.apresentacao();

        System.out.println("\n Uma Pessoa pode ser um Cliente ou um Empregado.");
        System.out.println("\nO Cliente não sobrescreveu o toString e o apresentacao, logo utiliza os métodos da classe pai.");
        Cliente cliente1 = new Cliente(5000, "Patricia Cliente", "999999","Avenida São Paulo" );
        System.out.println("\n"+ cliente1);
        cliente1.apresentacao();
        System.out.println("Porém possui métodos adicionais para manipular o seu crédito na loja");
        System.out.println("Saldo da Patricia: R$ "+ cliente1.saldo());
        cliente1.setMontanteDivida(1000);
        System.out.println("Saldo da Patricia após realizar uma compra de R$ 1000: R$ "+ cliente1.saldo());
        System.out.println(cliente1.getNome());

        System.out.println("\nSe a Pessoa for um Empregado ou ela é um Vendedor ou uma Secretária, ela não pode apenas" +
                " ser um empregado. Quando ela é um empregado a sua apresentação é diferente da de uma Pessoa comum");
        Vendedor vendedor1 = new Vendedor(3000,12,"João Vendedor", "123456","Travessa 123");
        Secretaria secretaria1 = new Secretaria(3000,"Marcela Secretaria","54321", "BR 357");
        System.out.println(vendedor1);
        System.out.println(secretaria1);
        vendedor1.apresentacao();
        secretaria1.apresentacao();
        System.out.printf("\nA classe abstrata Empregado sobrescreve o toString da classe Pessoa, por isso ambos são " +
                "apresentados como empregados. Em Vendedor e Secretaria o metodo apresentação está sobrescrito também," +
                "por isso suas apresentações são diferentes.");

        System.out.println("\n Tanto o Vendedor quanto a Secretária implementam a interface Financeiro, que exige a " +
                "implementação de métodos capazes de calcular o seu salário.\nO Vendedor paga de imposto 5% do seu" +
                " salário, enquanto a Secretária paga 2%. Então mesmo" +
                "recebendo um mesmo salario bruto, o salário real entre os dois será diferente.");
        System.out.println("Salario real do vendedor : R$"+ vendedor1.salarioReal());
        System.out.println("Salario real da secretaria : R$"+ secretaria1.salarioReal());

        System.out.println("\nPorém o Vendedor possua a vantagem de ter o atributo bonificação, que caso o seu desempenho" +
                "não seja considerado ruim ele recebe esse bonus. Para isso ele utiliza o calculo do salario Real" +
                "existente no Empregado através do super.salarioReal() ou senão retorna este valor somado ao bonus");
        vendedor1.setNota(8.5F);
        System.out.println("Salario real do vendedor : R$"+ vendedor1.salarioReal());
        System.out.println("Salario real da secretaria : R$"+ secretaria1.salarioReal());

        System.out.println("\nComo verificarDesempenho() é um método abstrato de Empregado, ele deve ser implementado" +
                "nas classes filhos. Desta forma para uma mesma nota foi atribuido desempenho diferentes conforme o cargo");
        secretaria1.setNota(8.5F);
        System.out.println("Desempenho Vendedor com nota 8.5: "+ vendedor1.verificarDesempenho());
        System.out.println("Desempenho Secretaria com nota 8.5: "+ secretaria1.verificarDesempenho());

        System.out.println("\nComo todos são filhos de Pessoa, pode-se colocar todos em uma List do tipo Pessoa");
        List<Pessoa> listaPessoa = List.of(pessoa1, cliente1,vendedor1,secretaria1);
        System.out.println(listaPessoa);
        System.out.println("\nAo se apresentar, cada um irá se apresentar a sua maneira mesmo estando em uma lista de PEssoas:");
        listaPessoa.forEach(pessoa -> pessoa.apresentacao());

        System.out.println("\nO mesmo se pode fazer com Vendedor e Secretária, utilizando uma List de Empregados");
        List<Empregado> listaEmpregados = List.of(vendedor1,secretaria1);
        System.out.println(listaEmpregados);

        ArrayList array= null;

        System.out.println(array.size());
    }
}

