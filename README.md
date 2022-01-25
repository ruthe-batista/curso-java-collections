
# O objetivo desse Readme é mostrar as principais funcionalidades da API Collections.

Essa interface oferece diversas funcionalidades para a manipulação de dados.
Algumas Collections são organizadas, ou seja, garante que as coleções serão 
percorridas na mesma ordem em que os elementos foram inseridos, já quando 
a Collection é ordenada, esta possui métodos, regras para ordenação dos elementos.

## **Vamos entender  algumas funcionalidades!!**

**List** estende Collections, aceita itens duplicados e nulos, trabalha com índices da mesma forma que os arrays, é 
rápido para inserir elementos, mas um pouco mais lento que o Set.

**ArrayList** é uma implementação da interface List, aceita itens duplicados e seu funcionamento é semelhante a 
um array convencional, a principal diferença é poder crescer conforme a necessidade.

**LinkedList** outra implementação de List, mas também implementa Queue, aceitando itens duplicados sendo organizada. 
É similar ao ArrayList e ao Vector, mas fornece alguns métodos adicionais para a inserção, remoção e acesso aos 
elementos no início e no final da lista. 

A diferença entre as classes ArrayList e LinkedList está na performance, pois o ArrayList é mais rápido na recuperação 
de dados, enquanto o LinkedList tem melhor performance na adição e exclusão de dados. 

Os métodos mais importantes dessa interface são:

* Add: adiciona um objeto na lista.

* Get: recupera um objeto da lista, passando como parâmetro o índice do objeto.

* Remove: remove o objeto da lista.

* Sort: Ordena uma lista.

* Comparator: indica como deve ser feita a ordenação.

* Shuffle: embaralha os dados de uma lista.


### SET

Assim como o List é uma interface e o ArrayList é sua implementação, o Set e HashSet seguem a mesma analogia, onde o 
Set é a interface e o HashSet é sua implementação. 

Set não aceita itens duplicados e nulos, não possui índice, rápido para inserir e pesquisar elementos.

**HashSet:** a ordem da saída é aleatória.

**LinkedHashSet:** a saída é na ordem da inserção dos dados.

**TreeSet:** a saída é com a ordenação dos dados.


## Mapas

Os mapas são coleções relacionadas as chaves com valores, com isso, quando for adicionar um novo objeto na coleção, é preciso dizer qual 
a chave para a busca desse objeto. Todas as classes desse tipo de coleção implementam o pacote java.util.Map.

**HashMap:** Aceita itens duplicados com chaves diferentes, os elementos são percorridos 
aleatoriamente, não ordenados e aceita valores nulos.

**HashTables:** Aceita itens duplicados com chaves diferentes, semelhante ao HashMap.

**TreeMap** Também suporta itens duplicados com índices diferentes, é ordenado.


## **Iterator**

O iterator é uma interface disponível no pacote java.util que permite percorrer coleções da API Collection, desde que 
tenham implementado a Collection, fornecendo métodos como o next(), hasnext() e remove() entre outros.

## **For-each**

Ele serve para percorrer todos os elementos na API Collections.


#### As Collections possuem ampla utilização em Java, muito utilizadas para os mais diversos fins. 
Por serem genéricas por padrão, permite a utilização em diversas soluções.



