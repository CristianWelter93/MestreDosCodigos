`Garbage Collector` (coletor de lixo) é um processo que opera sempre em uma thread de baixa prioridade, liberando recursos que não são mais utilizados automaticamente, sem que o programador precise se preocupar com a tarefa de liberar memória usada.

Muitas linguagens permitem que o programador aloque memória em tempo de execução, quando ele faz isso basicamente se cria um ponteiro para o início de um espaço de memória.
Quando os dados naquele espaço de memória não são mais necessários ele pode ser liberado, e caso não exista um Garbage Collector o programador é responsável por fazer essa liberação.

Esta é uma tarefa complexa e exige muita atenção do programador, e pode gerar problemas futuros quando o código for executado. O sistema de coleta de lixo aumenta a produtividade e reduz os custos.

A implementação dele está na própria JVM, sendo o HotSpot da Oracle o mais comumente utilizado.

Primeiramente os objetos não referenciados são identificados e marcados como prontos para o garbage collector.

Na segunda etapa estes objetos marcados são excluídos, opcionalmente a memória pode ser compactada após o garbage collector excluir os objetos. Este processo de compactação torna mais fácil alocar memória para novos objetos.

Os garbage collectors do HotSpot implementam uma estratégia geracional que categoriza objetos por idade, parte do princípio de que a maioria dos objetos é de curta duração sendo assim estarão disponíveis para a liberação logo após a sua criação. Basicamente existe uma pilha dividida em 3 partes:

* Young generation: Onde estão os objetos recém criados, dentro dela há uma subdivisão entre Eden e Survivor 0 e Survivor 1. Nos Survivors ficam os objetos novos que sobreviveram a um  ciclo de garbage collection.

* Old Generation: Onde ficam os objetos de longa duração que vieram da Young Generation. Quando os objetos são lixos coletados nesta etapa, é considerado como sendo um grande evento de garbage collection.

* Permanent Generation: onde metadados como classes e métodos são armazenados. As classes não mais em uso podem ser coletadas aqui.
                                                                                                                                                                                                                                      

No código encontrado nesta mesma pasta, "OutOfMemory", verificamos um exemplo do OutOfMemoryError em que a variável que controla o loop é incrementada além do limite permitido, gerando o erro.
Este erro pode ser evitado das seguintes formas:
- Aumentar o tamanho da memória disponível para o JVM caso a sua aplicação demande;
- Verificar se a sua aplicação não está armazenando informações desnecessárias;
- Utilizar tools que analisam a memória disponível como, por exemplo, o Java Heap Analysis Tool ou Eclipse Memory Analyzer.


