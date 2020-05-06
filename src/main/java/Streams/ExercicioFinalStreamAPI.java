package Streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ExercicioFinalStreamAPI {
    public static void main(String[] args) {

        //Cria a coleção de estudantes
        List<Estudante> estudantes = new ArrayList<>();
        estudantes.add(new Estudante("Ana",15));
        estudantes.add(new Estudante("Carlos", 18));
        estudantes.add(new Estudante("Flávio", 30));
        estudantes.add(new Estudante("Maria", 50));
        estudantes.add(new Estudante("Beatriz", 25));
        estudantes.add(new Estudante("Zelandia",53));
        estudantes.add(new Estudante("Érika",19));
        estudantes.add(new Estudante("Reinaldo",31));
        estudantes.add(new Estudante("Andressa", 29));
        estudantes.add(new Estudante("Cauã", 15));
        estudantes.add(new Estudante("Bernardo", 14));

        //Transforme cada estudante em uma string c/ os atributos do objeto
        System.out.println("Os estudantes são: " +  estudantes.stream()
                .map(estudante -> estudante.getNome().concat(" com ").concat(String.valueOf(estudante.getIdade())).concat(" anos"))
                .collect(Collectors.toList()));

        //Conte a quantidade de estudantes que tem na coleção
        System.out.println("Quantos estudantes tem? " + estudantes.stream().count());

        //Filtre estudantes com idade igual ou maior a 18 anos
        System.out.println("Os estudantes maiores de idade são: " + estudantes.stream()
                .filter(estudante -> (estudante.getIdade() >= 18))
                .map(estudante -> estudante.getNome().concat(" - ").concat(String.valueOf(estudante.getIdade())).concat(" anos"))
                .collect((Collectors.toList())));

        //Exibe cada elemento no console
        System.out.println("Exibe cada estudante no console: " );
        estudantes.stream().forEach(estudante -> System.out.println(estudante.getNome()));

        //Retorne estudantes que possuem a letra b
        System.out.println(estudantes.stream()
                .map(estudante -> estudante.getNome().concat(" - ").concat(String.valueOf(estudante.getIdade())).concat(" anos"))
                .peek(System.out::println).filter((estudante) -> estudante.contains("B"))
                .collect(Collectors.toList()));

        //Algum estudante tem a letra d no nome
        System.out.println("Tem algum estudante com a letra d no nome? "
                + estudantes.stream().anyMatch(estudante -> estudante.getNome().toLowerCase().contains("d")));

        //Retorne o estudante mais velho
        Estudante estudanteMaisVelho = estudantes.stream().max(Comparator.comparingInt(Estudante::getIdade)).get();
        System.out.println("Estudante mais velho: " + estudanteMaisVelho.getNome());

        //Retorne o estudante mais novo
        Estudante estudanteMaisNovo = estudantes.stream().min(Comparator.comparingInt(Estudante::getIdade)).get();
        System.out.println("Estudante mais novo: " + estudanteMaisNovo.getNome());
    }
}
