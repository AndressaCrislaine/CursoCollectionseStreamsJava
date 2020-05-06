package Streams;

public class Estudante implements Comparable<util.Comparators.Estudante> {

    private String nome;
    private Integer idade;

    public Estudante(String nome, Integer idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    @Override
    public int compareTo(util.Comparators.Estudante o){
        return this.getIdade() - o.getIdade();
    }

}
