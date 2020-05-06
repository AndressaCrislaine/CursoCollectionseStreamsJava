package Optional;

import java.util.Optional;

public class Exercicio {
    public static void main(String[] args) {

        //Crie um optional de um determinado tipo
        Optional<String> optionalString = Optional.of("Pode ou não ter alguma coisa aqui..");

        /**Crie com estado vazio, presente e null*/
        Optional<String> optionalVazio = Optional.empty();
        System.out.println("- Criado vazio");
        optionalVazio.ifPresentOrElse(System.out::println,() -> System.out.println("Optional vazio...NÃO PRESENTE!"));

        Optional<String> optionalNulo = Optional.ofNullable(null);
        System.out.println("- Criado nulo");
        optionalNulo.ifPresentOrElse(System.out::println,() -> System.out.println("Optional nulo...NÃO PRESENTE!"));

        Optional<String> optionalPresente = Optional.of("- Criado Presente!");
        //System.out.println("Criado presente");
        //optionalPresente.ifPresentOrElse(System.out::println,() -> System.out.println("Algo deu errado! NÃO PRESENTE!"));

        if (optionalPresente.isPresent()){
            String valor = optionalPresente.get();
            System.out.println(valor);
        }
        /**teste para lançar exception
        optionalPresente = Optional.empty();
         */

        optionalPresente.map((valor) -> valor.concat("*-*")).ifPresent(System.out::println);
        optionalPresente.orElseThrow(IllegalStateException::new);


    }
}
