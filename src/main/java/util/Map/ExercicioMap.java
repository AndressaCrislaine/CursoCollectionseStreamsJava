package util.Map;

import java.util.HashMap;
import java.util.Map;

public class ExercicioMap {

    /**Não extende da java.util.collection
     * Tem chave e valor, permite repetir apenas valores, pode ser ordenada através de comparators
     * HashMap é a mais utilizada*/

    /**Dá para usar para objetos que você não conhece a estrutura, por ex. faz um select no banco de dados
     * ou lê um arquivo csv, onde a chave vai ser o nome da coluna e o 2º campo pode ser uma lista*/
    public static void main(String[] args) {
        //Temos chave, valor
        Map<String, Integer> campeoesMundialFifa = new HashMap<>();

        //Adiciona os campeões no mapa
        campeoesMundialFifa.put("Brasil",5);
        campeoesMundialFifa.put("Alemanha",4);
        campeoesMundialFifa.put("Itália",4);
        campeoesMundialFifa.put("Uruguai",2);
        campeoesMundialFifa.put("Argentina",2);
        campeoesMundialFifa.put("França",2);
        campeoesMundialFifa.put("Inglaterra",1);
        campeoesMundialFifa.put("Espanha",1);

        System.out.println(campeoesMundialFifa);

        //Supondo que o Brasil ganhe o Hexa, alteramos usando o put
        campeoesMundialFifa.put("Brasil",6);
        System.out.println(campeoesMundialFifa);

        //Retorna quantas vezes a Argentina ganhou
        System.out.println("Quantas vezes a Argentina foi campeã? " + campeoesMundialFifa.get("Argentina"));

        //Verifica se existe a chave França
        System.out.println("A França foi campeã? " + campeoesMundialFifa.containsKey("França"));

        //Removendo
        campeoesMundialFifa.remove("França");
        System.out.println("E agora a França está no map? " + campeoesMundialFifa.containsKey("França"));

        //Retorna se existe alguma seleção hexa campeã
        System.out.println("Alguma seleção tem hexa?" + campeoesMundialFifa.containsValue(6));

        //tamanho do map
        System.out.println("O tamanho é: " + campeoesMundialFifa.size());
        
        //Existem dois meios de navegação
        for (Map.Entry<String, Integer> entry: campeoesMundialFifa.entrySet()
             ) {
            System.out.println(entry.getKey() + " -- " + entry.getValue());
        }
        
        //Esse é menos performático
        for (String key: campeoesMundialFifa.keySet()
             ) {
            System.out.println(key + " --> " + campeoesMundialFifa.get(key));
        }
    }
}
