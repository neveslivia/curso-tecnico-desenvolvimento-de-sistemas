package entities;

public class ReceberNotas {
    private double a;
    private double b;
    private double c;


    public ReceberNotas(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public ReceberNotas(){

    }

    public double getA() {
        return a;
    }
    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }
    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }
    public void setC(double c) {
        this.c = c;
    }

    public double med(){
        double soma;
        double media;
        soma = a + b + c;
        media = soma/3;
        return media;
    }

    @Override
    public String toString() {
        return String.format("A média das notas é %.2f",med());
    }
}
