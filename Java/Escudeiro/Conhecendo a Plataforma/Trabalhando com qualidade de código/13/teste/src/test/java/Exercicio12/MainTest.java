package Exercicio12;

import org.junit.Assert;
import org.junit.Test;

public class MainTest {

    @Test
    public void should_return_nota_when_not_greater_than_100() throws NotaException {
        int nota = 90;
        Assert.assertEquals(Main.verificarNota(nota),90);
    }

    @Test
    public void should_thrown_exception_when_nota_greater_than_100() throws NotaException {
        int nota = 120;
        Assert.assertThrows(NotaException.class,()->Main.verificarNota(nota));
    }
}
