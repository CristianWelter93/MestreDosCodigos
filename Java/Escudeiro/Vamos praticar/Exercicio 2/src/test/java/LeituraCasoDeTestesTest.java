import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class LeituraCasoDeTestesTest {

    private static List<Grupo> grupos = new ArrayList<>();

    @Test
    public void should_open_file() throws IOException {
        LeituraCasoDeTestes.leitor("src/test/java/CaseTesteTest.txt", grupos);
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
    public void should_validate_number() throws IllegalArgumentException {
        LeituraCasoDeTestes.validaNumero("12345678911234567891");
    }

    @Test
    public void should_validate_group_size() throws IllegalArgumentException {
        LeituraCasoDeTestes.validaTamanhoGrupo(10000);
    }

    @Test
    public void should_validate_data() throws IllegalArgumentException {
        LeituraCasoDeTestes.validaTipo("1");
    }

}
