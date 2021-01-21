import java.time.LocalDate;

public class Pessoa {
    private String nome;
    private String cpf;
    private String endereco;


    public Pessoa() {
        this.cpf = "";
        this.endereco = "";
        this.nome = "";
    }

    public Pessoa(String nome, String cpf, String endereco) {
        this.cpf = cpf;
        this.endereco = endereco;
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return this.endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void apresentacao() {
        System.out.println("Olá meu nome é " + this.nome);
    }

    @Override
    public String toString() {
        return "Pessoa {" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", endereco='" + endereco + '\'' +
                '}';
    }
}

