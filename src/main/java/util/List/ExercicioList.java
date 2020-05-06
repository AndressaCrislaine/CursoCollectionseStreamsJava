package util.List;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ExercicioList {

    //São listas que garatem ordem inserção, permite ordenação com Comparators
    public static void main(String[] args) {

        List<String> nomes = new java.util.ArrayList<>();

        nomes.add("Juliana");
        nomes.add("Pedro");
        nomes.add("Carlos");
        nomes.add("Larissa");
        nomes.add("João");

        for (String nome: nomes
        ) {
            System.out.println(nome);
        }

        nomes.add(2,"Roberto");
        System.out.println(nomes.get(1));
        System.out.println(nomes.get(4));

        nomes.remove("Mateus");

        nomes.remove("João");
        System.out.println(nomes.size());

        System.out.println("Tem Juliano na lista?" + nomes.contains("Juliano"));

        List<String> nomes2 = new java.util.ArrayList<>();
        nomes2.add("Ismael");
        nomes2.add("Rodrigo");

        for (String nomesNovos: nomes2
        ) {
            nomes.add(nomesNovos);
        }

        System.out.println(nomes);
        Collections.sort(nomes);
        System.out.println(nomes);

        System.out.println("A lista esta vazia? " + nomes.isEmpty());

    }

}
