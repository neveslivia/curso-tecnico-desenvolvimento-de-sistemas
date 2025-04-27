package Entities;

public class Ex_1 {
    private String marca;
    private int ano;

    public String getMarca() {
        return marca;
    }


    public int getAno() {
        return ano;
    }

    public Ex_1() {
        this.marca = "Fiat";
        this.ano = 2011;
    }


    @Override
    public String toString() {
        return "Marca " + getMarca() + "\n" +
                "Ano " +getAno();
    }
}
