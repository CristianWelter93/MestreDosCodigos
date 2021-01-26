import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ListaTelefonica {
    public static void main(String[] args) {
        List<Grupo> grupos = new ArrayList<Grupo>();
        lendoArquivo("CaseTeste.txt", grupos);

        grupos.forEach(grupo -> System.out.println(grupo.caracteresEconomizados()));
    }

    public static void lendoArquivo(String patch, List<Grupo> grupos) {
        try {
            System.out.println("Lendo dados no caso de testes: " + patch);
            LeituraCasoDeTestes.leitor(patch, grupos);
        } catch (IOException e) {
            System.out.println("Não foi possível realizar a leitura do arquivo. " + e.getMessage());
        }
    }
}


