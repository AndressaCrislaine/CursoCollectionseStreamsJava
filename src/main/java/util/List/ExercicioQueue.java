package util.List;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class ExercicioQueue {

    //Usado para fila - Não tem método set para fazer alterações.
    public static void main(String[] args) {
        Queue<String> filaBanco = new LinkedList<>();

        filaBanco.add("Patricia");
        filaBanco.add("Roberto");
        filaBanco.add("Flávio");
        filaBanco.add("Pamela");
        filaBanco.add("Anderson");

        System.out.println(filaBanco);

        //poll retorna e remove 1º elemento da fila
        String clienteASerAtendido = filaBanco.poll();
        System.out.println(filaBanco);

        //peek retorna quem é o 1º elemento da fila, mas não remove
        String primeiroCliente = filaBanco.peek();
        System.out.println(filaBanco);

        /*Limpo a fila
        filaBanco.clear();*/

        /** Situação que preciso que sistema lance um erro caso a fila esteja vazia, devo usar element
         * Exception lançada - NoSuchElementException*/
        String primeiroClienteOuErro = filaBanco.element();

        //Posso interagir com fila assim
        for (String nomeCliente: filaBanco) {
            System.out.println(nomeCliente);
        }

        //Outro modo de interagir com a fila
        Iterator<String> iteratorFilaBanco = filaBanco.iterator();
        while(iteratorFilaBanco.hasNext()) {//faça enquanto tem mais um objeto na coleção
            System.out.println("-->" + iteratorFilaBanco.next());
        }

        //Quantos elementos a fila tem
        System.out.println(filaBanco.size());
        System.out.println(filaBanco.isEmpty()); //Se a fila esta vazia

        /**Resposta do exercicio final**/

        Queue<String> nomes = new LinkedList<>();
        nomes.add("Juliana");
        nomes.add("Pedro");
        nomes.add("Carlos");
        nomes.add("Larissa");
        nomes.add("João");

        for (String name: nomes
             ) {
            System.out.println("Navegando..." + name);
        }

        System.out.println(nomes.peek());
        System.out.println(nomes.poll());
        nomes.add("Daniel");
        System.out.println(nomes);

        System.out.println("O tamanho da lista é " + nomes.size());
        System.out.println("A lista está vazia? " + nomes.isEmpty());
        System.out.println("O Carlos está na lista? " + nomes.contains("Carlos"));

    }
}
