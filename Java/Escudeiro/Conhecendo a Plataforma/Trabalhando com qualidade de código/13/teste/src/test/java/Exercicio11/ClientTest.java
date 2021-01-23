package Exercicio11;

import org.junit.Assert;
import org.junit.Test;

public class ClientTest {

    @Test
    public void should_reduce_credit_if_have_debt(){
        Cliente c = new Cliente(50000);
        c.setMontanteDivida(10000);
        Assert.assertEquals(40000, c.saldo(),0);
    }
}
