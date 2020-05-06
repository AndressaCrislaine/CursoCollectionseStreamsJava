package util.Comparators;

public class Estudante implements Comparable<Estudante> {

    private final String nome;
    private final Integer idade;

    public Estudante(String nome, Integer idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }

    @Override
    public String toString(){
        return nome + "-" + idade;
    }
    /**Comparable eu uso dentro da classe que quero ordenar implementando esse método compareTo
     * Os algoritmos de ordenação costumam comparar um obj que é dado como atual com o próximo obj dentro de uma coleção
     * Em nosso caso, queremos comparar uma lista de estudantes
     * Como vamos retornar um inteiro, devemos retornar 3 tipos de valores:
     * 1 número positivo(1) que representa que o obj atual é maior que o passado por parâmetro
     * 1 número negativo(-1) que representa que o obj atual é menor que o passado por parâmetro
     * O número(0) para falar que os dois são iguais*/
    @Override
    public int compareTo(Estudante o){
        return this.getIdade() - o.getIdade();
    }
}
