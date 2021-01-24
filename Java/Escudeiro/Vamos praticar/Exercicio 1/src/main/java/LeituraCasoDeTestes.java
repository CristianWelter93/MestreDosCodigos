import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class LeituraCasoDeTestes {

    public static void leitor(String path, List<Integer> velocidades, List<Integer> tempos) throws IOException {
        BufferedReader buffRead = new BufferedReader(new FileReader(path));
        String linha = "";
        String[] conteudo;
        while (true) {
            if (linha != null) {
                if (linha != "") {
                    conteudo = linha.split(" ");
                    velocidades.add(Integer.valueOf(conteudo[0]));
                    tempos.add(Integer.valueOf(conteudo[1]));
                }
            } else
                break;
            linha = buffRead.readLine();
        }
        buffRead.close();
    }
}
