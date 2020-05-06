package util.Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ExercicioHashSet {

    /**Mais usada
     * Não tem ordenação e nem valores repetidos, por isso mais performática de todas*/
    public static void main(String[] args) {

        Set<Double> notasAlunos = new HashSet<>();

        //Adicionar as notas no set
        notasAlunos.add(5.8);
        notasAlunos.add(9.3);
        notasAlunos.add(6.5);
        notasAlunos.add(10.0);
        notasAlunos.add(5.4);
        notasAlunos.add(7.3);
        notasAlunos.add(3.8);
        notasAlunos.add(4.0);

        System.out.println(notasAlunos);

        notasAlunos.remove(3.8);//Remove nota 3.8 do set
        System.out.println("Quantidade de itens: " + notasAlunos.size()); // retorna quantidade de itens do set

        //Navega em todos os itens do iterator
        Iterator<Double> iterator = notasAlunos.iterator();

        while (iterator.hasNext()){
            System.out.println("-->>" + iterator.next());
        }
        //Navegação de outra maneira
        for (Double nota : notasAlunos
             ) {
            System.out.println("***" + nota);
        }
        notasAlunos.clear();
        System.out.println("O set está vazio? " + notasAlunos.isEmpty());
    }
}
