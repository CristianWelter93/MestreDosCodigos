public class Cliente extends Pessoa {
    private float limiteCredito;
    private float montanteDivida;

    public Cliente(float limite) {
        super();
        this.limiteCredito = limite;
        this.montanteDivida = 0;
    }

    public Cliente(float limite, String nome, String cpf, String endereco){
        super(nome, cpf, endereco);
        this.limiteCredito = limite;
        this.montanteDivida = 0;
    }

    public float getLimiteCredito() {
        return limiteCredito;
    }

    public void setLimiteCredito(float limiteCredito) {
        this.limiteCredito = limiteCredito;
    }

    public float getMontanteDivida() {
        return montanteDivida;
    }

    public void setMontanteDivida(float montanteDivida) {
        this.montanteDivida = montanteDivida;
    }

    public float saldo() {
        return limiteCredito - montanteDivida;
    }
}

