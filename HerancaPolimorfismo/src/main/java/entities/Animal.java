package entities;

public class Animal {
    protected String nome;

    public Animal() {
        super();
    }

    public Animal(String nome) {
        this.nome = nome;
    }

    public String fazerSom(){
       return "Som genérico de animal";



    }

    @Override
    public String toString() {
        return fazerSom();
    }
}
