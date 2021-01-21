import java.time.LocalDate;
import java.time.Period;

public class Pessoa {

    //modificadores de acesso
    private String nome;
    private String cpf;
    private String telefone;
    private LocalDate nascimento;
    private Boolean ativo;
    private static Integer quantidade = 0; // variavel static
    private static Integer ativos = 0; // variavel static
    public LocalDate ultimoAcesso;

    public Pessoa() { //Construtor Padrão
        this.ativo = true;
        quantidade++;
        ativos++;
    }

    public Pessoa(String nome) {  //Construtor com argumento, sobrecarga
        this.ativo = true;
        quantidade++;
        ativos++;
        this.nome = nome;
    }

    public Pessoa(String nome, LocalDate nascimento) { //Construtor com argumento, sobrecarga
        this.ativo = true;
        quantidade++;
        ativos++;
        this.nascimento = nascimento;
        this.nome = nome;
    }

    public int getIdade() {
        return Period.between(this.nascimento, LocalDate.now()).getYears();
    }

    public int getIdade(LocalDate dataReferencia) { // Sobrecarga de metodos, metodo com argumento e valor de retorno
        return Period.between(this.nascimento, dataReferencia).getYears();
    }

    public void ativar() { //metodo sem argumento e sem valor de retorno
        if(!this.ativo){
            this.ativo = true;
            ativos++;
        }
    }

    public void desativar() { //metodo sem argumento e sem valor de retorno
        if(this.ativo){
            this.ativo = false;
            ativos--;
        }
    }

    public static Integer getQuantidadePessoas(){ //metodo static
        return quantidade;
    }

    public static Integer getQuantidadePessoasAtivas(){ //metodo static
        return ativos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public LocalDate getNascimento() {
        return nascimento;
    }

    public void setNascimento(LocalDate nascimento) {
        this.nascimento = nascimento;
    }

    public Boolean isAtivo() {
        return ativo;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", telefone='" + telefone + '\'' +
                ", nascimento=" + nascimento +
                ", ativo=" + ativo +
                ", ultimoAcesso=" + ultimoAcesso +
                '}';
    }
}

