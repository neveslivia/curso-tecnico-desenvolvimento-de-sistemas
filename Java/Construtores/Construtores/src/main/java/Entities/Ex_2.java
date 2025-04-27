package Entities;

public class Ex_2 {
   private String nome;
    private int idade;

    public String getNome() {
        return nome;
    }


    public int getIdade() {
        return idade;
    }


    public Ex_2(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
    public Ex_2() {
        this.idade = 0;
        this.nome = "Desconhecido";
    }

    @Override
    public String toString() {
        return "Nome: " + getNome() + "\n" +
                "Idade:" + getIdade() ;
    }
}
