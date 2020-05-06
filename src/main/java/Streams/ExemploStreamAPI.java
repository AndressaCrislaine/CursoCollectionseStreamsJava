package Streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ExemploStreamAPI {
    public static void main(String[] args) {

        //Cria a coleção de estudantes
        List<String> estudantes = new ArrayList<>();
        estudantes.add("Ana");
        estudantes.add("Carlos");
        estudantes.add("Flávio");
        estudantes.add("Maria");
        estudantes.add("João");
        estudantes.add("Zelandia");
        estudantes.add("Érika");
        estudantes.add("Reinaldo");
        estudantes.add("Andressa");
        estudantes.add("Cauã");

        //Retorna um long - a contagem dos elementos do stream
        System.out.println("Quantos estudantes tem? " + estudantes.stream().count());

        //Retorna elemento com maior nº de letras
        System.out.println("Maior número de letras: " + estudantes.stream().max(Comparator.comparingInt(String::length)));

        //Retorna elemento com menor nº de letras
        System.out.println("Menor número de letras: " + estudantes.stream().min(Comparator.comparingInt(String::length)));

        //Retorna os elementos que tem a letra r no nome
        /* Filter recebe uma regra(algoritmo) que sempre vai retornar true ou false
         * Assim, ele cria uma nova coleção apenas para os itens que deram true, então esses
         * itens podem ser coletados e através do Collectors podemos converter em lista, Set, String,etc..
         * Nesse caso, retorna uma lista*/
        System.out.println("Retorna elementos com a letra R no nome: " + estudantes.stream().filter(estudante ->
                estudante.toLowerCase().contains("r")).collect(Collectors.toList()));

        //Retorna uma nova coleção, com os nomes concatenados e quantidade de letrade cada nome
        /*Map é um dos mais interessantes métodos da API Stream
        * O Map recebe um algoritmo(lambda nesse caso) que vai ser aplicado em cada elemento da coleção e
        * sempre vai retornar uma nova stream(coleção) de mesmo tamanho com os elementos transformados.
        * Nesse caso, esta concatenando o nome do estudante com a quantidade de letras e retornando em lista*/
        System.out.println("Retorna uma coleção com a quantidade de letras: " + estudantes.stream().map(estudante ->
                estudante.concat("-").concat(String.valueOf(estudante.length()))).collect(Collectors.toList()));

        //Retorna somente os 3 primeiros elementos da coleção
        System.out.println("Retorna os três primeiros elementos: " + estudantes.stream().limit(3).collect(Collectors.toList()));

        //Exibe cada elemento no console e depois retorna a mesma coleção
        System.out.println("Primeiro mostrando cada elemento...");
        System.out.println("Retorna os elementos da coleção: " + estudantes.stream().peek(System.out::println).collect(Collectors.toList()));

        //Exibe cada elemento no console sem retornar outra coleção
        System.out.println("Exibe os estudantes novamente: " );
        estudantes.stream().forEach(System.out::println);

        //Retorna boolean
        /* allMath vai executar aquela expressão lambda que foi passada por parâmetro para todos os elementos
        * e caso todos derem true, retorna true*/
        System.out.println("Todos elementos tem o k minúsculo no nome? " + estudantes.stream().allMatch((elemento) -> elemento.contains("k")));

        //Retorna boolean
        /*anyMatch vai executar expressão para todos elementos e se pelo menos um der true, retorna true*/
        System.out.println("Tem algum elemento com a minúscula no nome? " + estudantes.stream().anyMatch((elemento) -> elemento.contains("a")));

        //Retorna boolean
        /*noneMatch é ao contrário do anyMatch
        * ele espera que a expressão retorne false para todos os elementos, se retornar false para todos, ele retorna true
        * se algum elemento retornar true, ele retorna false */
        System.out.println("Não tem nenhum elementos com a minúscula no nome? " +
                estudantes.stream().noneMatch((elemento) -> elemento.contains("a")));

        //Retorna o primeiro elemento da coleção, se existir exibe no console
        System.out.print("Retorna o primeiro elemento da coleção:");
        estudantes.stream().findFirst().ifPresent(System.out::println);

        //Exemplo de operação encadeada
        /**As operações são feitas em paralelo*/
        System.out.println("Operação encadeada: ");

        System.out.println(estudantes.stream()
        .peek(System.out::println)
        .map(estudante -> estudante.concat("-").concat(String.valueOf(estudante.length())))
        .peek(System.out::println).filter((estudante) -> estudante.toLowerCase().contains("r"))
                //Existem várias formas de colecionar:
                //.collect(Collectors.toList()));
                //.collect(Collectors.joining(".. "))); //Separa os elemetos (Delimita) com o que quiser
                //.collect(Collectors.toSet())); //Repare que a ordem muda
                /*O agrupamento é parecido com do sql, onde podemos pegar um conjunto de elementos e agrupar por
                 * um valor, e fazer uma tabela de acordo com uma regra desses elementos.
                 * Nesse caso, quero agrupar pelo primeiro caracter do elemento após o traço, que é o tamanho do nome(length)*/
                .collect(Collectors.groupingBy(estudante -> estudante.substring(estudante.indexOf("-") + 1 ))));
    }
}
