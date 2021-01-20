import java.util.*;

public class MapEstudo {
    public static void main (String[] args) {
        System.out.println("\nMap: Esta interface é um objeto que mapeia valores para chaves, facilitando assim a busca " +
                "das informações através de terminada key. A chave não pode ser repetida, já o valor sim. \n");

        exemploHashTable();
        exemploHashMap();
	    exemploSortedMap();
    }


    public static void exemploHashTable() {
        System.out.println("\nHashTable: Trabalha com algoritmo hash para conversão das chaves e um mecanismo de " +
                "pesquisa de valores, é thread-safe portando possui tratamento para concorrência" +
                "(diferentemente do HashMap). Não permite valores nulos.\n");

        Hashtable<Integer, String> hashTableNomes = new Hashtable<>();

        hashTableNomes.put(10, "João");
        hashTableNomes.put(22, "Ana");
        hashTableNomes.put(3, "Amanda");

        System.out.println("Um integer pode ser utilizado como Key pois não viola o HashCode, ou seja," +
                "objetos iguais devem retornar o mesmo código");

        System.out.println(hashTableNomes);

        System.out.println("\n Hashtable - Exibindo nome na posição 2:");
        System.out.println(hashTableNomes.get(22));

        System.out.println("\nvalues():");
        System.out.println(hashTableNomes.values());

        System.out.println("\nkeySet():");
        System.out.println(hashTableNomes.keySet());

        System.out.println("\nentrySet():");
        Set set = hashTableNomes.entrySet();
        set.forEach(s-> System.out.println(s));


        System.out.println("\nput() na key 3 o nome Carlos:");
        hashTableNomes.put(3,"Carlos");
        System.out.println(hashTableNomes);

        System.out.println("\nput() na key 4, nome Novo:");
        hashTableNomes.put(4, "Novo");
        System.out.println(hashTableNomes);

        System.out.println("\nHashTable possui o método getOrDefault, para quando se tenta pegar uma chave não existente" +
                "retornar um valor padrão. Como por exemplo pegar o dado da key 10:");
        System.out.println(hashTableNomes.getOrDefault(10, "not found"));

    }


    public static void exemploHashMap() {
        System.out.println("\nHashMap: Implementação mais utilizada da interface Map. Seus elementos não são ordenados" +
                ", rápida busca e inserção de dados, permite valores e chaves nulas e consome menos memória que a HashTable." +
                "Não há garantia sobre a ordem de interação como no TreeMap\n");
        System.out.println("\nLinkedHashMap: O mapa de hash vinculado é baseado na tabela de hash e na lista vinculada" +
                " para aprimorar a funcionalidade do mapa de hash. Mantém uma lista duplamente vinculada. Irá interar na" +
                "ordem em que as entradas foram colocadas no mapa\n");

        HashMap<Integer, String> hashMapNomes = new HashMap<>();
        hashMapNomes.put(10, "João");
        hashMapNomes.put(22, "Ana");
        hashMapNomes.put(3, "Amanda");
        hashMapNomes.put(null, "null");

        LinkedHashMap<Integer, String> linkedHashMapNomes = new LinkedHashMap<>();
        linkedHashMapNomes.put(10, "João");
        linkedHashMapNomes.put(22, "Ana");
        linkedHashMapNomes.put(3, "Amanda");
        linkedHashMapNomes.put(null, "null");

        System.out.println("Ordem de inserção ods nomes: 10 - João, 22 - Ana, 3 - Amanda, null - null");

        System.out.println("\nHashMap - Exibindo nome na key 22:");
        System.out.println(hashMapNomes.get(22));

        System.out.println("\nlinkedHashMapNomes - Exibindo nome na key 22:");
        System.out.println(linkedHashMapNomes.get(22));


        System.out.println("\nHashMap - put() na key 3 o nome Carlos:");
        hashMapNomes.put(3,"Carlos");

        System.out.println("\nlinkedHashMapNomes - put() na key 3 o nome Carlos:");
        linkedHashMapNomes.put(3,"Carlos");

        System.out.println("\nHashMap - put() na key 4, nome Novo:");
        hashMapNomes.put(4, "Novo");
        System.out.println(hashMapNomes);

        System.out.println("\nlinkedHashMapNomes - put() na key 4, nome Novo:");
        linkedHashMapNomes.put(4, "Novo");
        System.out.println(linkedHashMapNomes);


        System.out.println("Como verificado acima LinkedHashMap irá iterar na ordem em que as entradas foram colocadas " +
                "no mapa. Enquanto o HashMap não nos oferece esta garantia. Diferente do HashTable, valores null" +
                "puderam ser inseridos");
    }


    public static void exemploSortedMap() {
        System.out.println("\n SortedMap: É um subtipo do Map em que os elementos são armazenados conforme uma" +
                "ordem de classificação.\n");
        System.out.println("\n NavigableMap: Fornece mais métodos de navegação como: lowerKey, floorKey, roofKey " +
                "e higherKey. Também fornece maneiras de criar um Sub Mapa a partir de um Mapa existente.\n");
        System.out.println("\n TreeMap: Iterará de acordo com a \"ordem natural\" das chaves, de acordo com o" +
                " compareTo() ou Comparator. Implementa as interfaces SortedMap e NavigableMap.\n");

        SortedMap sortedMap = new TreeMap();

        NavigableMap navigable = new TreeMap();

        System.out.println("\nOrdem de inserção ods nomes: 10 - João, 22 - Ana, 3 - Amanda");
        sortedMap.put(10, "João");
        sortedMap.put(22, "Ana");
        sortedMap.put(3, "Amanda");

        navigable.put(10, "João");
        navigable.put(22, "Ana");
        navigable.put(3, "Amanda");



        System.out.println("\nComo os elementos ficaram inseridos na TreeMap");
        System.out.println(sortedMap);
        System.out.println("Obedeceram a ordenação dos números inteiros");

        System.out.println("\nHá como recuperar a primeira e a ultima key através de métodos já existentes");
        System.out.println("Primeiro :"+ sortedMap.firstKey());
        System.out.println("Primeiro :"+ sortedMap.lastKey());

        System.out.println("\nNavigableMap possui métodos que ajudam na navegação, como por exemplo pegar a próxima key" +
                "menor em relação a uma fornecida. Como por exemplo a key anterior a 22");
        System.out.println("lowerKey(22) :"+ navigable.lowerKey(22));

    }
}


