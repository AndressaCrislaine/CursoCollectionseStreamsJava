package util.Set;

import java.util.HashSet;
import java.util.Set;

public class ExercicioSet {

    public static void main(String[] args) {
        Set<Integer> numerosSet = new HashSet<>();
        numerosSet.add(3);
        numerosSet.add(88);
        numerosSet.add(20);
        numerosSet.add(44);
        numerosSet.add(3);

        for (Integer numero: numerosSet
             ) {
            System.out.println("Navegando..." + numero);
        }

        numerosSet.remove(3);
        numerosSet.add(23);

        System.out.println("O tamanho do set é " + numerosSet.size());
        System.out.println("O set está vazio?" + numerosSet.isEmpty());


    }

}
