package Entities;

public class Ex_4 {
    private String nome;
    private double preco;

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public Ex_4(String nome, double preco) {
        this.nome = nome;
        if (preco < 0){
            this.preco += 0.0;
        }else{
            this.preco = preco;
        }
    }

    @Override
    public String toString() {
        return "Nome: " + getNome() + "\n" + "Preço: " + getPreco();
    }
}
