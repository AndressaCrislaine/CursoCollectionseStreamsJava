package util.Set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class ExercicioLinkedHashSet {

    /**Mantem a ordenação de inserção dos elementos, mais lenta*/
    public static void main(String[] args) {

        LinkedHashSet<Integer> sequenciaNumerica = new LinkedHashSet<>();

        //Adiciona os numeros
        sequenciaNumerica.add(1);
        sequenciaNumerica.add(2);
        sequenciaNumerica.add(4);
        sequenciaNumerica.add(8);
        sequenciaNumerica.add(16);

        System.out.println(sequenciaNumerica);

        sequenciaNumerica.remove(4);//Remove numero do set
        System.out.println("Depois da remoção" + sequenciaNumerica);

        System.out.println("Tamanho do LinkedHashSet: " + sequenciaNumerica.size());

        //Navega em todos os itens do iterator
        Iterator<Integer> iterator = sequenciaNumerica.iterator();
        while (iterator.hasNext()){
            System.out.println("Navegando..." + iterator.next());
        }

        System.out.println("O LinkedHashSet está vazio? " + sequenciaNumerica.isEmpty());
    }
}
