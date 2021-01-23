package Exercicio10;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;


public class PessoaTest {
    private Pessoa pessoa;

    @Before
    public void createPerson(){
        LocalDate anoNascimento = LocalDate.of(1993,07,07);
        pessoa = new Pessoa("Maria",anoNascimento );
    }

    @Test
    public void should_return_not_zero_if_some_person_is_created() {
        Assert.assertNotEquals(0f, Pessoa.getQuantidadePessoasAtivas().floatValue(), 0);
        Assert.assertNotEquals(0f, Pessoa.getQuantidadePessoas().floatValue(), 0);
        Assert.assertEquals(Pessoa.getQuantidadePessoas(), Pessoa.getQuantidadePessoasAtivas());
    }

    @Test
    public void should_return_different_values_if_one_person_is_disable() {
        pessoa.desativar();
        Assert.assertNotEquals(Pessoa.getQuantidadePessoasAtivas(), Pessoa.getQuantidadePessoas(), 0);
    }

    @Test
    public void should_return_27_years_for_person(){
        LocalDate dataComparacao = LocalDate.of(2021,01,01);
        Assert.assertEquals(27, pessoa.getIdade(dataComparacao));
    }

    @Test
    public void should_return_person_is_active(){
        Assert.assertTrue(pessoa.isAtivo());
    }
}
