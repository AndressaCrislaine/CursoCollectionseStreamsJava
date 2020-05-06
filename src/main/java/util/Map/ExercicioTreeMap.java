package util.Map;

import java.util.Map;
import java.util.TreeMap;

public class ExercicioTreeMap {

    public static void main(String[] args) {

        TreeMap<String,String> capitais = new TreeMap<>();
        //monta árvore com capitais
        capitais.put("RS","Porto Alegre");
        capitais.put("SC","Florianópolis");
        capitais.put("PR","Curitiba");
        capitais.put("SP","São Paulo");
        capitais.put("RJ","Rio de Janeiro");
        capitais.put("MG","Belo Horizonte");

        System.out.println(capitais);
        System.out.println("Topo " + capitais.firstKey()); //Retorna 1º capital do topo da árvore
        System.out.println("Fim " + capitais.lastKey()); //Retorna última capital no final da árvore

        System.out.println("Abaixo SC é: " + capitais.lowerKey("SC"));//Retorna 1ºcapital abaixo do parâmetro
        System.out.println("Acima SC é: " + capitais.higherKey("SC"));//Retorna 1ºcapital acima do parâmetro

        //Outro modo de mostrar 1º capital do topo da árvore
        System.out.println(capitais.firstEntry().getKey() + "-" + capitais.firstEntry().getValue());
        //Outro modo de mostrar última capital no final da árvore
        System.out.println(capitais.lastEntry().getKey() + "-" + capitais.lastEntry().getValue());
        //Outro modo de mostrar 1ºcapital abaixo do parâmetro
        System.out.println(capitais.lowerEntry("SC").getKey() + " - "+ capitais.lowerEntry("SC").getValue());
        //Outro modo de mostrar 1ºcapital acima do parâmetro
        System.out.println(capitais.higherEntry("SC").getKey() + " - " + capitais.higherEntry("SC").getValue());

        Map.Entry<String,String> firstEntry = capitais.pollFirstEntry();
        Map.Entry<String,String> lastEntry = capitais.pollLastEntry();
        //Mostra topo da árvore e remove do Map
        System.out.println(firstEntry.getKey() + " - " + firstEntry.getValue());
        //Mostra última capital da árvore e remove do Map
        System.out.println(lastEntry.getKey() + " - " + lastEntry.getValue());
        System.out.println(capitais);

        for (String capital: capitais.keySet()
             ) {
            System.out.println("Capitais: " + capital + "-" + capitais.get(capital));
        }


    }
}
