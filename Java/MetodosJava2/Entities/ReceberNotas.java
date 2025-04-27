package entities;

public class ReceberNotas {
    public double a;
    public double b;
    public double c;


    public ReceberNotas(double a, double b, double c){
        this.a += a;
        this.b += b;
        this.c += c;
    }
    public  double med() {
        double soma;
        double medi;
        soma = a + b + c;
        medi = soma / 3;
        return medi;
    }

    @Override
    public String toString() {
        return String.format("A média das notas é %.2f" ,med());
    }
}
