import java.time.LocalDate;

public interface Financeiro {

    public float salarioReal();

    public float getSalarioBase();

    public void setSalarioBase(float salarioBase);

    public float getPorcentagemImpostoRenda();
}


