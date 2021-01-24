import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;


public class Deslocamento {
    public static final String patch = "CaseTeste.txt";
    private static List<Integer> velocidades = new ArrayList<>();
    private static List<Integer> tempos = new ArrayList<>();
    private static List<BigInteger> posicao = new ArrayList<>();

    public static void main(String[] args) {
        lendoArquivo(patch, velocidades, tempos);

        Integer velocidade;
        Integer tempo;
        BigDecimal aceleracao;

        System.out.println(" Entrada                    " + " | " + " Saída");
        for (int i = 0; i < velocidades.size(); i++) {
            velocidade = velocidades.get(i);
            tempo = tempos.get(i);
            aceleracao = calcularAceleracao(velocidade, tempo);
            posicao.add(calcularPosicaoFinal(aceleracao, tempo));
            System.out.println(velocidade + " " + tempo + "                    " + " | " + " " + posicao.get(i));
        }
    }

    public static BigInteger calcularPosicaoFinal(BigDecimal aceleracao, Integer tempo) {
        BigDecimal tempoFinalQuadrado = BigDecimal.valueOf(tempo).multiply(BigDecimal.valueOf(2)).pow(2);

        return aceleracao.multiply(tempoFinalQuadrado).divide(BigDecimal.valueOf(2)).toBigInteger();
    }

    public static BigDecimal calcularAceleracao(Integer velocidadeInicial, Integer tempoInicial) {
        validaVelocidade(velocidadeInicial);
        validaTempo(tempoInicial);

        BigDecimal v = BigDecimal.valueOf(velocidadeInicial);
        BigDecimal t = BigDecimal.valueOf(tempoInicial);

        if (tempoInicial == 0) {
            return BigDecimal.ZERO;
        }

        return v.divide(t, 2, RoundingMode.HALF_EVEN);
    }

    public static void validaVelocidade(Integer velocidadeInicial) {
        if (velocidadeInicial < -100) {
            throw new IllegalArgumentException("A velocidade não pode ser inferior a -100");
        }
        if (velocidadeInicial > 100) {
            throw new IllegalArgumentException("A velocidade não pode ser superior a -100");
        }
    }

    public static void validaTempo(Integer tempoInicial) {
        if (tempoInicial < 0) {
            throw new IllegalArgumentException("O tempo não pode ser inferior a zero");
        }
        if (tempoInicial > 200) {
            throw new IllegalArgumentException("O tempo não pode ser superior a 200");
        }
    }

    public static void lendoArquivo(String patch, List<Integer> velocidades, List<Integer> tempos) {
        try {
            System.out.println("Lendo arquivos com caso de testes: " + patch);
            LeituraCasoDeTestes.leitor(patch, velocidades, tempos);
        } catch (IOException e) {
            System.out.println("Não foi possível realizar a leitura do arquivo. " + e.getMessage());
        }
    }
}
