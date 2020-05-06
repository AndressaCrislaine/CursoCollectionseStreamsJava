package Optional;

import java.util.Optional;

public class ExemploOptional {
    public static void main(String[] args) {

        /** Se temos certeza que existe um valor na variavel usamos of*/
        Optional<String> optionalString = Optional.of("Valor presente.....");

        System.out.println("Valor opcional que está presente");
        /**Forma mais completa
         *optionalString.ifPresentOrElse((valor) -> System.out.println(valor), -> System.out.println("Não está presente"));*/
        optionalString.ifPresentOrElse(System.out::println,() -> System.out.println("Não está presente"));

        /*ofNullable e empty são muito parecidos
        * Se a variavel pode ser nula usamos ofNullable*/
        Optional<String> optionalNull = Optional.ofNullable(null);
        System.out.println("Valor opcional que não está presente");
        optionalNull.ifPresentOrElse(System.out::println,() -> System.out.println("null = Não está presente"));

        /**Se queremos construir sem nenhum valor empty*/
        Optional<String> emptyOptional = Optional.empty();
        System.out.println("Valor opcional que não está presente");
        emptyOptional.ifPresentOrElse(System.out::println,() -> System.out.println("empty = Não está presente"));

        /**Se queremos lançar a exceção */
        Optional<String> optionalNullErro = Optional.of(null);
        System.out.println("Valor opcional que lança NullPointerException");
        optionalNullErro.ifPresentOrElse(System.out::println,() -> System.out.println("erro = Não está presente"));

    }
}
