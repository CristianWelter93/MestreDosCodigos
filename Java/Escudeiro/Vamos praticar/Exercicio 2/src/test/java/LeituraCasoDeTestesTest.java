import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class LeituraCasoDeTestesTest {

    private static List<Grupo> grupos = new ArrayList<>();

    @Test
    public void should_open_file() {

        try {
            LeituraCasoDeTestes.leitor("src/test/java/CaseTesteTest.txt", grupos);
            Assert.assertTrue(true);
        } catch (IOException e) {
            System.out.println("Erro ao abrir arquivo");
            Assert.assertTrue(false);
        }
    }

    @Test
    public void should_throw_exception_when_file_not_exists() {
        Assert.assertThrows(IOException.class, () -> LeituraCasoDeTestes.leitor("Inexistente.txt", grupos));
    }

    @Test
    public void should_throw_exception_when_number_is_invalid() {
        String numero = String.valueOf(Math.pow(10,22));
        Assert.assertThrows(IllegalArgumentException.class, () -> LeituraCasoDeTestes.validaNumero(numero));
    }

    @Test
    public void should_throw_exception_when_group_size_is_invalid_if_is_zero() {
        Assert.assertThrows(IllegalArgumentException.class, () -> LeituraCasoDeTestes.validaTamanhoGrupo(0));
    }

    @Test
    public void should_throw_exception_when_group_size_is_invalid_if_is_grater_than_10_pow_5() {
        Assert.assertThrows(IllegalArgumentException.class, () -> LeituraCasoDeTestes.validaTamanhoGrupo(1000000));
    }

    @Test
    public void should_throw_exception_when_data_is_invalid() {
        Assert.assertThrows(NumberFormatException.class, () -> LeituraCasoDeTestes.validaTipo("a123"));
    }

    @Test
    public void should_validate_number() {
        try {
            LeituraCasoDeTestes.validaNumero("12345678911234567891");
            Assert.assertTrue(true);
        } catch (IllegalArgumentException e) {
            System.out.println("Lançou exception na validação do numero");
            Assert.assertTrue(false);
        }
    }

    @Test
    public void should_validate_group_size() {
        try {
            LeituraCasoDeTestes.validaTamanhoGrupo(10000);
            Assert.assertTrue(true);
        } catch (IllegalArgumentException e) {
            System.out.println("Lançou exception na validação do tamanho do grupo");
            Assert.assertTrue(false);
        }
    }

    @Test
    public void should_validate_data() {
        try {
            LeituraCasoDeTestes.validaTipo("1");
            Assert.assertTrue(true);
        } catch (IllegalArgumentException e) {
            System.out.println("Lançou exception na validação do tipo");
            Assert.assertTrue(false);
        }
    }

}
