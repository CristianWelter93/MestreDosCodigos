import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigInteger;
import java.util.List;
import java.util.Objects;

public class LeituraCasoDeTestes {

    public static void leitor(String path, List<Grupo> grupos) throws IOException {
        BufferedReader buffRead = new BufferedReader(new FileReader(path));
        String linha = "";
        Integer tamanhoGrupo;
        Grupo grupo;
        while (true) {
            if (Objects.nonNull(linha)) {
                if (!linha.equals("")) {
                    validaTipo(linha);
                    tamanhoGrupo = Integer.valueOf(linha);
                    validaTamanhoGrupo(tamanhoGrupo);
                    grupo = new Grupo();
                    for (int i = 0; i < tamanhoGrupo; i++) {
                        validaTipo(linha);
                        linha = buffRead.readLine();
                        if (linha != null && linha != "") {
                            validaNumero(linha);
                            grupo.addNumero(linha);

                        } else
                            break;
                    }
                    grupos.add(grupo);
                }
            } else
                break;
            linha = buffRead.readLine();
        }
        buffRead.close();
    }

    public static void validaNumero(String linha) {
        validaTipo(linha);
        if (linha.length() > 200) {
            throw new IllegalArgumentException("Um número não pode possuir mais que 200 caracteres :" + linha);
        }
    }

    public static void validaTamanhoGrupo(Integer tamanho) {
        if (tamanho < 1 || tamanho > Math.pow(10, 5)) {
            throw new IllegalArgumentException("A quantidade de números deve ser entre 1 e 10^5 :" + tamanho);
        }
    }

    public static void validaTipo(String linha) {
        linha.chars().forEach(value -> {
            if(!Character.isDigit(value)){
                throw new NumberFormatException("Informe somente caracteres numericos! " + linha);
            }
        });
    }
}
