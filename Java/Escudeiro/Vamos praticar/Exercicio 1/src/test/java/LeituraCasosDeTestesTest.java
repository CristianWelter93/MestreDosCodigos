import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LeituraCasosDeTestesTest {

    @Test
    public void should_open_file() throws IOException {
        List<Integer> dados = new ArrayList<>();
        LeituraCasoDeTestes.leitor("src/test/java/CaseTesteTest.txt", dados, dados);
        Assert.assertTrue(true);
    }

    @Test
    public void should_throw_exception_when_file_not_exists() {
        List<Integer> dados = new ArrayList<>();
        Assert.assertThrows(IOException.class, () -> LeituraCasoDeTestes.leitor("Inexistente.txt", dados, dados));
    }
}
