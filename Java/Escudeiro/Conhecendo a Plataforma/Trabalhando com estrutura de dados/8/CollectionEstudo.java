import java.util.*;

public class CollectionEstudo {
    public static void main(String[] args) {
        setInterface();
        listInterface();
        queueInterface();
    }


    public static void setInterface() {
        System.out.println("\nSet: Define uma coleção que não contém valores duplicados. \n");
        System.out.println("  SortedSet:  Possibilita a classificação natural dos elementos, tal como a ordem" +
                " alfabética.");
        System.out.println("  NavigableSet: É parecido como o SortedSet com a diferença de que possuí métodos de" +
                " navegação, como por exemplo navegar na ordem inversa.");
        System.out.println("  TreeSet: Implementa as duas interfaces anteriores. Os dados são classificados, desta" +
                " forma é preferível quando se necessita um conjunto de elementos não duplicados e acesso em ordem natural.");
        System.out.println("  HashSet:  Acesso aos dados mais rápidos que um TreeSet ( e muito mais rápido que uma List " +
                "quando utilizamos por exemplo o método contains), mas não há garantias de que os dados estejam" +
                " ordenados. Utilizado quando a ordem dos elementos não é importante");
        System.out.println("  LinkedHashSet:  É uma HashSet com uma lista duplamente ligada através de seus itens." +
                " Seus elementos são iterados na ordem em que foram inseridos.");

        TreeSet<String> nomesTreeSet = new TreeSet<>();
        HashSet<String> nomesHashSet = new HashSet<>();
        LinkedHashSet<String> nomesLinkedHashSet = new LinkedHashSet<>();

        String[] nomes = {"Maria","José","Carlos","Monica","Luiz","Ana","Zelia","Beatriz","Fernando","Fernanda"};

        nomesTreeSet.addAll(Arrays.asList(nomes));

        nomesHashSet.addAll(Arrays.asList(nomes));

        nomesLinkedHashSet.addAll(Arrays.asList(nomes));

        System.out.println("\nOrdem de inserção da lista de nomes :");
        System.out.println(Arrays.asList(nomes));

        System.out.println("\nLista de nomes com TreeSet :");
        System.out.println(nomesTreeSet);

        System.out.println("\nLista de nomes com TreeSet usando navegação inversa :");
        System.out.print("[");
        nomesTreeSet.descendingIterator().forEachRemaining(s -> System.out.print(" "+s+","));
        System.out.print("]\n");

        System.out.println("\nLista de nomes com HashSet :");
        System.out.println(nomesHashSet);

        System.out.println("\nLista de nomes com LinkedHashSet :");
        System.out.println(nomesLinkedHashSet);
    }


    public static void listInterface() {
        System.out.println("\nList: Define uma coleção ordenada que pode conter elementos duplicados. Há controle total " +
                "sobre a posição dos elementos tanto para inserir quando para recuperá-los. Preferível quando" +
                " se necessita de acesso aleatório através do ìndice do elemento.\n");
        System.out.println("  ArrayList: Array cujo tamanho pode crescer. Busca de um elemento é rápida, mas quanto" +
                " maior a estrutura maior o tempo para incluir ou excluir um elemento. Ficar alterando o seu tamanho" +
                " pode ser prejudicial ao desempenho, pois é feita uma cópia do ArrayList atual para um novo ArrayList" +
                " com o novo tamanho.");
        System.out.println("  LinkedList: Cada nó contém uma referência ao próximo nó. As buscas são um pouco mais" +
                " demoradas, porém as exclusões e inserções são mais rápidas. É possível ter acesso a métodos que" +
                " permitem obter ou remover o primeiro e ultimo elemento.");
        System.out.println("  Vector: Muito similar ao ArrayList porém é sincronizado, logo é seguro para ser utilizado" +
                " com threads. Quando sua lista está cheia ele aumenta o dobro do seu tamanho, enquanto um ArrayList " +
                "aumenta 50%. Logo o Vector é mais recomendável se a aplicação exibir que a lista seja aumentada com" +
                " muita frequência.\n");

        Vector vector = new Vector();
        ArrayList arrayList = new ArrayList();
        LinkedList linkedList = new LinkedList();

        // Vector add
        long inicio = System.nanoTime();

        for (int i = 0; i < 100000; i++) {
            vector.add(i);
        }
        long fim = System.nanoTime();
        long duracao = fim - inicio;
        System.out.println("Vector - tempo para se adicionar os elementos:      " + duracao);

        // ArrayList add
        inicio = System.nanoTime();

        for (int i = 0; i < 100000; i++) {
            arrayList.add(i);
        }
        fim = System.nanoTime();
        duracao = fim - inicio;
        System.out.println("ArrayList - tempo para se adicionar os elementos:  " + duracao);

        // LinkedList add
        inicio = System.nanoTime();

        for (int i = 0; i < 100000; i++) {
            linkedList.add(i);
        }
        fim = System.nanoTime();
        duracao = fim - inicio;
        System.out.println("LinkedList - tempo para se adicionar os elementos: " + duracao + "\n");

        // Vector get
        inicio = System.nanoTime();

        for (int i = 0; i < 10000; i++) {
            vector.get(i);
        }
        fim = System.nanoTime();
        duracao = fim - inicio;
        System.out.println("Vector - tempo para buscar um elemento (get):        " + duracao);

        // ArrayList get
        inicio = System.nanoTime();

        for (int i = 0; i < 10000; i++) {
            arrayList.get(i);
        }
        fim = System.nanoTime();
        duracao = fim - inicio;
        System.out.println("ArrayList - tempo para buscar um elemento (get):    " + duracao);

        // LinkedList get
        inicio = System.nanoTime();

        for (int i = 0; i < 10000; i++) {
            linkedList.get(i);
        }
        fim = System.nanoTime();
        duracao = fim - inicio;
        System.out.println("LinkedList - tempo para buscar elementos (get):   " + duracao + "\n");

        // Vector remove
        inicio = System.nanoTime();

        for (int i = 9999; i >= 0; i--) {
            vector.remove(i);
        }
        fim = System.nanoTime();
        duracao = fim - inicio;
        System.out.println("ArrayList - tempo para remover elementos:  " + duracao);

        // ArrayList remove
        inicio = System.nanoTime();

        for (int i = 9999; i >= 0; i--) {
            arrayList.remove(i);
        }
        fim = System.nanoTime();
        duracao = fim - inicio;
        System.out.println("ArrayList - tempo para remover elementos:  " + duracao);

        // LinkedList remove
        inicio = System.nanoTime();

        for (int i = 9999; i >= 0; i--) {
            linkedList.remove(i);
        }
        fim = System.nanoTime();
        duracao = fim - inicio;
        System.out.println("LinkedList - tempo para remover elementos:  " + duracao + "\n");

    }


    public static void queueInterface() {
        System.out.println("\nQueue: Define uma coleção que representa uma fila (First-in, First-Out).\n");
        System.out.println("  LinkedList: Também pode ser utilizada como uma pilha.");
        System.out.println("  PriorityQueue: Mantém uma lista de prioridade, onde a ordem de prioridade dos seus" +
                " elementos é definida pela implementação de Comparable ou Comparator");

        PriorityQueue<String> queue = new PriorityQueue();
        LinkedList<String> linkedList = new LinkedList();

        String[] nomes = {"Maria","Jose","Carlos","Monica","Luiz","Ana","Helia","Beatriz","Fernando","Fernanda"};

        queue.addAll(Arrays.asList(nomes));
        linkedList.addAll(Arrays.asList(nomes));


        System.out.println("\nOrdem de inserção da lista de nomes :");
        System.out.println(Arrays.asList(nomes));

        System.out.println("\nLista de nomes inserida em uma PriorityQueue :");
        System.out.println(queue);

        System.out.println("\nLista de nomes inserida em uma LinkedList :");
        System.out.println(linkedList);

        System.out.println("\nRemovendo elemento da fila, sempre será o primeiro (a menos que seja especificado) :");
        System.out.println("Elemento removido -> "+queue.poll());
        System.out.println(queue);

        System.out.println("\nRemovendo elemento da fila, sempre será o primeiro (a menos que seja especificado) :");
        System.out.println("Elemento removido -> "+linkedList.poll());
        System.out.println(linkedList);

        System.out.println("\nAo adicionar um novo elemento na PriorityQueue ele será inserido na posição conforme a prioridade da fila");
        System.out.println("\nAdicionado elemento na PriorityQueue, nome Amanda :");
        queue.add("Amanda");
        System.out.println(queue);

        System.out.println("\nAo adicionar um novo elemento na LinkedList ele será inserido no final");
        System.out.println("\nAdicionado elemento na LinkedList, nome Amanda :");
        linkedList.add("Amanda");
        System.out.println(linkedList);

        System.out.println("\nAdicionado elemento na PriorityQueue, nome Xuxa :");
        queue.add("Xuxa");
        System.out.println(queue);

        System.out.println("\nAdicionado elemento na LinkedList, nome Xuxa :");
        linkedList.add("Xuxa");
        System.out.println(linkedList);
    }


}

