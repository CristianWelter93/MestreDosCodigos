public class OutOfMemory {
    public static void main(String[] args) {
        Long maxMemory = Runtime.getRuntime().maxMemory();
        System.out.println("Maximo de memoria:"+ maxMemory);
         
        int[] erro = new int[(int) (maxMemory + 1)];
        for(int i = 0; i < erro.length; ++i)
            erro[i] = i+1;
    }
}