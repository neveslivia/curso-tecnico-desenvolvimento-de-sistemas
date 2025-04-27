package entities;


public class Cachorro extends Animal{
    public Cachorro(String nome) {
        super(nome);
    }

    @Override
    public String fazerSom(){
        return "O cachorro late!";

    }

    @Override
    public String toString() {
        return fazerSom();
    }
}
