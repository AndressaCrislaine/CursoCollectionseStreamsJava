package util.Set;

import java.util.TreeSet;

public class ExercicioTreeSet {

    /**Árvore binária
     * mantém ordem e pode ser reordenado através de Comparators
     * É performatico para leitura, mas é o pior para alteração se precisa alterar usar o LinkedHashSet
     * */
    public static void main(String[] args) {

        TreeSet<String> treeCapitais = new TreeSet<>();

        //Monta árvore com as capitais
        treeCapitais.add("Porto Alegre");
        treeCapitais.add("Florianópolis");
        treeCapitais.add("Curitiba");
        treeCapitais.add("São Paulo");
        treeCapitais.add("Rio de Janeiro");
        treeCapitais.add("Belo Horizonte");

        System.out.println(treeCapitais);

        System.out.println(treeCapitais.first()); //Retorna capital do topo da árvore
        System.out.println(treeCapitais.last()); // Retorna a última capital da árvore

        //Retorna a 1º capital abaixo da capital passada no parâmetro
        System.out.println("Abaixo de Floripa: " + treeCapitais.lower("Florianópolis"));

        //Retorna a 1º capital acima da capital passada no parâmetro
        System.out.println("Acima de Floripa: " +treeCapitais.higher("Florianópolis"));

        /**Essas modificações dão trabalho, pois a árvore é refeita, perde a performace*/
        //Retorna 1º capital do topo da árvore, removendo do set
        System.out.println(treeCapitais.pollFirst());

        //Retorna 1º capital do final da árvore, removendo do set
        System.out.println(treeCapitais.pollLast());

        for (String capital: treeCapitais
             ) {
            System.out.println("Navegando..." + capital);
        }
    }
}
