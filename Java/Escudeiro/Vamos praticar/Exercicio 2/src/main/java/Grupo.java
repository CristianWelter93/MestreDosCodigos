import java.util.TreeSet;

public class Grupo {
    private TreeSet<String> numeros;
    private String numero;
    private int caracteres;

    public Grupo() {
        numeros = new TreeSet<>();
    }

    public void addNumero(String numero) {
        this.numeros.add(numero);
    }

    public TreeSet<String> getNumeros() {
        return this.numeros;
    }

    public int caracteresEconomizados() {
        caracteres = 0;
        numero = "";

        this.getNumeros().iterator().forEachRemaining(atual -> {
            if(numero.equals("")){
                numero = atual;
            } else {
                for(int i=0; i< numero.length(); i++){
                    if(numero.charAt(i)==atual.charAt(i)){
                        caracteres++;
                    }else{
                        numero = "";
                        break;
                    }
                }
            }
        });
        return caracteres;
    }
}
