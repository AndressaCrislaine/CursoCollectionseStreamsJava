package util.Comparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
/**Concluimos que Comparator e Comparable são interfaces auxiliares da API de Collections
 * para podermos trabalhar com ordenação de coleções, pode-se usar em List, Map e Set */

public class ComparatorsExemploList {

    public static void main(String[] args) {

       List<Estudante> estudantes = new ArrayList<>();
       estudantes.add(new Estudante("Pedro",19));
       estudantes.add(new Estudante("Carlos", 23));
       estudantes.add(new Estudante("Mariana",21));
       estudantes.add(new Estudante("João",18));
       estudantes.add(new Estudante("Thiago", 20));
       estudantes.add(new Estudante("George",22));
       estudantes.add(new Estudante("Larissa",21));

        System.out.println("Ordem de inserção: " + estudantes);

        /**Expressão Lambda
         * Método sort do Comparator recebe 2 obj parâmetro
         * Aconcelhado para algoritmos simples
         * Não pode ser usado em outros lugares*/
        estudantes.sort((first,second) -> first.getIdade() - second.getIdade());
        System.out.println("Ordem CRESCENTE (expressão Lambda)" + estudantes);
        estudantes.sort((first,second) -> second.getIdade() - first.getIdade());
        System.out.println("Ordem DECRESCENTE (expressão Lambda)" + estudantes);

        /**Comparator tem métodos default que podemos comparar nºs inteiros, double
         * Compara os inteiros usando get idade*/
        estudantes.sort(Comparator.comparingInt(Estudante::getIdade));
        System.out.println("Método comparingInt " + estudantes);

        //Através desse método podemos chamar o reversed para uma ordenação decrescente
        estudantes.sort(Comparator.comparingInt(Estudante::getIdade).reversed());
        System.out.println("Reverso método comparingInt " + estudantes);

        /**Interface Comparable
         * Chamar o método sort pelo Collections
         * Só podemos passar uma lista por parâmetro se nessa lista os objetos implementam Comparable*/
        Collections.sort(estudantes);
        System.out.println("Usando Comparable " + estudantes);

        /**Nesse caso não é obrigado a implementar o Comparable
         * Onde eu tenho uma lista, porém já passo por parâmetro uma classe que implementa Comparator
         * */
        Collections.sort(estudantes, new EstudandeOrdemIdadeReversa());
        System.out.println("Usando Comparable descrescente " + estudantes);

    }
}
