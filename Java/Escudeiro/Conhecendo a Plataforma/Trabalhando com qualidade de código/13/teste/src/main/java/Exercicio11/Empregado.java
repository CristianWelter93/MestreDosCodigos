package Exercicio11;

public abstract class Empregado extends Pessoa {
    private float salarioBase;
    private float impostoRenda;
    protected Desempenho desempenho = Desempenho.RUIM;
    private float nota;

    public Empregado() {
        super();
    }

    public Empregado(float salario, float imposto, String nome, String cpf, String endereco) {
        this.setNome(nome);
        this.setCpf(cpf);
        this.setEndereco(endereco);
        this.impostoRenda = imposto;
        this.salarioBase = salario;

    }

    public Empregado(float salario, float imposto) {
        this.impostoRenda = imposto;
        this.salarioBase = salario;
    }

    public Empregado(String nome, String cpf, String endereco) {
        this.setNome(nome);
        this.setCpf(cpf);
        this.setEndereco(endereco);
    }

    public float getSalarioBase() {
        return salarioBase;
    }

    public float getImpostoRenda() {
        return impostoRenda;
    }

    public void setSalarioBase(float salarioBase) {
        this.salarioBase = salarioBase;
    }

    public void setImpostoRenda(float impostoRenda) {
        this.impostoRenda = impostoRenda;
    }

    public abstract Desempenho verificarDesempenho();

    public void setNota(float nota){
        this.nota = nota;
    }

    protected float getNota(){
        return this.nota;
    }

    @Override
    public String toString() {

        return "Empregado{" +
                "nome='" + this.getNome() + '\'' +
                ", cpf='" + this.getCpf() + '\'' +
                ", endereco='" + this.getEndereco() + '\'' +
                ", salarioBase=" + salarioBase +
                '}';
    }

    public float salarioReal() {
        float salarioBase = this.getSalarioBase();
        return salarioBase - salarioBase * (this.getPorcentagemImpostoRenda());
    }


    public float getPorcentagemImpostoRenda() {
        return this.getImpostoRenda()/100;
    }
}
