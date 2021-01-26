import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ListaTelefonicaTest {

    @Test
    public void should_return_case_of_test() {
        List<Grupo> grupos = new ArrayList<>();
        ListaTelefonica.lendoArquivo("src/test/java/CaseTesteTest.txt", grupos);
        String primeiroGrupo1 = "12345";

        Assert.assertEquals(2, grupos.get(0).getNumeros().size());
        Assert.assertEquals(4, grupos.get(1).getNumeros().size());
        Assert.assertEquals(primeiroGrupo1, grupos.get(0).getNumeros().first());
        Assert.assertEquals(2, grupos.size());
    }

    @Test
    public void should_return_saved_char(){
        List<Grupo> grupos = new ArrayList<>();
        ListaTelefonica.lendoArquivo("src/test/java/CaseTesteTest.txt", grupos);

        int quantidadeGrupo1 = grupos.get(0).caracteresEconomizados();
        int quantidadeGrupo2 = grupos.get(1).caracteresEconomizados();

        Assert.assertEquals(3, quantidadeGrupo1);
        Assert.assertEquals(8, quantidadeGrupo2);
    }
}
