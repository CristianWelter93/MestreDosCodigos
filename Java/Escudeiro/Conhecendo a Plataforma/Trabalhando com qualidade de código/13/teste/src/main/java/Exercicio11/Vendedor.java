package Exercicio11;

public class Vendedor extends Empregado implements Financeiro {
    private float bonificacao;
    private static final float imposto = 5;


    public Vendedor(){
        super();
    }
    public Vendedor(float salario) {
        super(salario, imposto);
        this.bonificacao = 0;

    }

    public Vendedor(float salario, float bonificacao) {
        super(salario, imposto);
        this.bonificacao = bonificacao;

    }

    public Vendedor(float salario, float bonificacao, String nome, String cpf, String endereco) {
        super(salario,imposto, nome, cpf, endereco);
        this.bonificacao = bonificacao;
    }

    @Override
    public float salarioReal() {
        float salarioReal = super.salarioReal();

        this.verificarDesempenho();

        if(desempenho.equals(Desempenho.RUIM)){
            return salarioReal;
        }
        return salarioReal+ (this.getSalarioBase() * (bonificacao /100));
    }


    public float getPorcentagemImpostoRenda() {
        return this.getImpostoRenda()/100;
    }

    @Override
    public Desempenho verificarDesempenho() {
        float nota = this.getNota();

        if(nota > 8){
            this.desempenho = Desempenho.EXCELENTE;
            return this.desempenho;
        }
        if(nota > 7){
            this.desempenho = Desempenho.BOM;
            return this.desempenho;
        }
        if(nota > 6){
            this.desempenho = Desempenho.MEDIO;
            return this.desempenho;
        }

        this.desempenho = Desempenho.RUIM;
        return this.desempenho;
    }

    public float getBonificacao() {
        return bonificacao;
    }

    public void setBonificacao(float bonificacao) {
        this.bonificacao = bonificacao;
    }

    @Override
    public void apresentacao() {
        System.out.println("Olá meu nome é " + this.getNome()+". E sou um vendedor.");
    }

}


