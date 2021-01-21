public class Secretaria extends Empregado implements Financeiro {
    private static final float imposto = 2;

    public Secretaria(float salario) {
        super(salario,imposto);
    }

    public Secretaria(float salario, String nome, String cpf, String endereco) {
        super(salario, imposto, nome, cpf, endereco);

    }

    public float salarioReal() {
        float salarioBase = this.getSalarioBase();
        return salarioBase - salarioBase * (this.getPorcentagemImpostoRenda());
    }


    public float getPorcentagemImpostoRenda() {
        return this.getImpostoRenda()/100;
    }


    @Override
    public Desempenho verificarDesempenho() {
        float nota = this.getNota();

        if(nota> 9){
            this.desempenho = Desempenho.EXCELENTE;
            return this.desempenho;
        }
        if(nota> 8){
            this.desempenho = Desempenho.BOM;
            return this.desempenho;
        }
        if(nota> 6){
            this.desempenho = Desempenho.MEDIO;
            return this.desempenho;
        }
        this.desempenho = Desempenho.RUIM;
        return this.desempenho;
    }

    @Override
    public void apresentacao() {
        System.out.println("Olá meu nome é " + this.getNome()+". E sou uma secretaria.");
    }
}


