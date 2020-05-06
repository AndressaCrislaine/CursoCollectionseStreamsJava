package util.Comparators;

import java.util.Comparator;

public class EstudandeOrdemIdadeReversa implements Comparator<Estudante> {

    /**É feita a comparação numa classe externa da sua classe domínio
     * Recebe dois parâmetro para comparar*/
    public int compare(Estudante o1, Estudante o2){
        return o2.getIdade() - o1.getIdade();
    }
}
