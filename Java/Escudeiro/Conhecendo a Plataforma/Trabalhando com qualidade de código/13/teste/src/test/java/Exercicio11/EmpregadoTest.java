package Exercicio11;

import org.junit.Assert;
import org.junit.Test;

public class EmpregadoTest {

    @Test
    public void should_return_desempenho_ruim_if_nota_not_is_seted_and_is_empregado(){
        Secretaria secretaria = new Secretaria(1000F);

        Assert.assertEquals(Desempenho.RUIM,secretaria.verificarDesempenho());
    }

    @Test
    public void should_return_desempenho_bom_if_nota_is_9_and_is_secretaria(){
        Secretaria secretaria = new Secretaria(1000F);
        secretaria.setNota(9);

        Assert.assertEquals(Desempenho.BOM,secretaria.verificarDesempenho());
    }

    @Test
    public void should_not_return_desempenho_excelente_if_nota_is_9_and_is_secretaria(){
        Secretaria secretaria = new Secretaria(1000F);
        secretaria.setNota(9);

        Assert.assertNotEquals(Desempenho.EXCELENTE,secretaria.verificarDesempenho());
    }

    @Test
    public void should_return_desempenho_excelente_if_nota_is_9_and_is_vendedor(){
        Vendedor vendedor = new Vendedor(1000F);
        vendedor.setNota(9);

        Assert.assertEquals(Desempenho.EXCELENTE,vendedor.verificarDesempenho());
    }

    @Test
    public void should_not_return_desempenho_bom_if_nota_is_9_and_is_vendedor(){
        Vendedor vendedor = new Vendedor(1000F);
        vendedor.setNota(9);

        Assert.assertNotEquals(Desempenho.BOM,vendedor.verificarDesempenho());
    }

    @Test
    public void should_return_bonus_wage_if_desempenho_not_is_ruim_and_is_vendedor(){
        Vendedor vendedor = new Vendedor(1000F,20);
        float salarioSemBonificacao = vendedor.salarioReal();
        vendedor.setNota(9);
        float salarioComBonificacao = vendedor.salarioReal();

        Assert.assertTrue(salarioSemBonificacao < salarioComBonificacao);
    }
}
