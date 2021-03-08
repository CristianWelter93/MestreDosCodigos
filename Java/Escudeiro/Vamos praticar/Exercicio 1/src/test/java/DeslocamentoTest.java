import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

import static java.math.BigDecimal.ZERO;

public class DeslocamentoTest {

    @Test
    public void should_validate_speed_when_is_100() throws IllegalArgumentException {
        Deslocamento.validaVelocidade(100);
    }

    @Test
    public void should_validate_speed_when_is_negative() throws IllegalArgumentException {
        Deslocamento.validaVelocidade(-100);
    }

    @Test
    public void should_throw_exception_to_invalidate_min_speed() {
        Assert.assertThrows(IllegalArgumentException.class, () -> Deslocamento.validaVelocidade(-101));
    }

    @Test
    public void should_throw_exception_to_invalidate_max_speed() {
        Assert.assertThrows(IllegalArgumentException.class, () -> Deslocamento.validaVelocidade(101));
    }

    @Test
    public void should_validate_time() throws IllegalArgumentException {
        Deslocamento.validaTempo(200);
    }

    @Test
    public void should_throw_exception_to_invalidate_min_time() {
        Assert.assertThrows(IllegalArgumentException.class, () -> Deslocamento.validaTempo(-1));
    }

    @Test
    public void should_throw_exception_to_invalidate_max_time() {
        Assert.assertThrows(IllegalArgumentException.class, () -> Deslocamento.validaTempo(201));
    }


    @Test
    public void should_not_read_file_when_file_not_exists() {
        List<Integer> dados = new ArrayList<>();
        Deslocamento.lendoArquivo("Inexistente.txt", dados, dados);

        Assert.assertEquals(0, dados.size());
    }

    @Test
    public void should_calculate_acceleration_and_not_return_zero() {
        BigDecimal velocidade = BigDecimal.valueOf(5);
        BigDecimal tempo = BigDecimal.valueOf(12);
        BigDecimal acellerationExpected = velocidade.divide(tempo, 2, RoundingMode.HALF_EVEN);

        BigDecimal resultado = Deslocamento.calcularAceleracao(velocidade.intValue(), tempo.intValue());

        Assert.assertEquals(acellerationExpected, resultado);
    }

    @Test
    public void should_return_acceleration_zero_if_time_is_zero() {
        BigDecimal velocidade = BigDecimal.valueOf(5);
        BigDecimal zero = BigDecimal.valueOf(0);

        BigDecimal resultado = Deslocamento.calcularAceleracao(velocidade.intValue(), zero.intValue());

        Assert.assertEquals(zero, resultado);
    }

    @Test
    public void should_calculate_final_position() {
        BigDecimal aceleracao = Deslocamento.calcularAceleracao(5, 12);

        BigInteger expected = BigInteger.valueOf(120);
        BigInteger resultado = Deslocamento.calcularPosicaoFinal(aceleracao, 12);

        Assert.assertEquals(expected, resultado);
    }

    @Test
    public void should_return_zero_to_final_position_if_acceleration_is_zero() {
        BigInteger expected = BigInteger.valueOf(0);
        BigInteger resultado = Deslocamento.calcularPosicaoFinal(ZERO, 12);

        Assert.assertEquals(expected, resultado);
    }

    @Test
    public void should_never_thrown_IOException() {
        List<Integer> dados = new ArrayList<>();
        Deslocamento.lendoArquivo("Inexistente.txt", dados, dados);
    }

    @Test
    public void should_return_case_of_test() {
        List<Integer> velocidades = new ArrayList<>();
        List<Integer> tempos = new ArrayList<>();
        Deslocamento.lendoArquivo("src/test/java/CaseTesteTest.txt", velocidades, tempos);

        Assert.assertEquals(2,velocidades.size());
        Assert.assertEquals(2,tempos.size());
        Assert.assertEquals(Integer.valueOf(0),velocidades.get(0));
        Assert.assertEquals(Integer.valueOf(12),tempos.get(1));

    }

    @Test
    public void should_get_result() {
        List<Integer> velocidades = new ArrayList<>();
        List<Integer> tempos = new ArrayList<>();
        List<BigInteger> posicao = new ArrayList<>();
        Deslocamento.lendoArquivo("src/test/java/CaseTesteTest.txt", velocidades, tempos);

        Deslocamento.resultadoFinal(velocidades, tempos, posicao);
        Assert.assertEquals(2,posicao.size());
        Assert.assertEquals(BigInteger.ZERO,posicao.get(0));
        Assert.assertEquals(BigInteger.valueOf(120),posicao.get(1));
    }

}
