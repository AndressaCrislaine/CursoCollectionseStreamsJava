package util.Map;

import java.util.HashMap;
import java.util.Map;

public class ExercicioFinalMap {

    public static void main(String[] args) {
        Map<String,String> capitais = new HashMap<>();
        capitais.put("RS","Rio Grande do Sul");
        capitais.put("SC","Santa Catarina");
        capitais.put("PR","Paraná");
        capitais.put("SP","São Paulo");
        capitais.put("RJ","Rio de Janeiro");
        capitais.put("MG","Minas Gerais");
        capitais.put("PE","Pernambuco");
        capitais.put("RN","Rio Grande do Norte");
        capitais.put("BA","Bahia");
        capitais.put("AC","Acre");
        capitais.put("AL","Alagoas");
        capitais.put("AP","Amapá");
        capitais.put("AM", "Amazonas");
        capitais.put("CE","Ceará");
        capitais.put("ES", "Espírito Santo");
        capitais.put("GO","Goiás");
        capitais.put("MA","Maranhão");
        capitais.put("MT","Mato Grosso");
        capitais.put("MS","Mato Grosso do Sul");
        capitais.put("PA","Pará");
        capitais.put("PB","Paraíba");
        capitais.put("PI","Piauí");
        capitais.put("RO","Rondônia");
        capitais.put("RR","Roraima");
        capitais.put("SE","Sergipe");
        capitais.put("TO","Tocantins");

        System.out.println(capitais);
        //Remover o estado de Minas Gerais
        System.out.println(capitais.remove("MG"));
        System.out.println(capitais);
        //Adicionar Distrito Federal
        capitais.put("DF","Distrito Federal");
        System.out.println(capitais);
        //Tamanho do mapa
        System.out.println("O tamanho do mapa é: " + capitais.size());
        //Remover o estado do Mato Grosso do Sul
        System.out.println("Removido Mato Grosso do Sul? " + capitais.remove("MS","Mato Grosso do Sul"));

        //Imprima os estados nome(sigla)
        for (Map.Entry<String, String> entry: capitais.entrySet()
        ) {
            System.out.println(entry.getValue() + "(" + entry.getKey() + ")");
        }
        //Verifica se o estado SC existe no map pela sigla
        System.out.println("Santa Catarina está no mapa? " + capitais.containsKey("SC"));

        //Verifica se o estado Maranhão existe no map pelo nome
        System.out.println("Maranhão está no mapa? " + capitais.containsValue("Maranhão"));

    }

}
