package entities;

public class OperacoesMatematicas {
    private int a;
    private int b;


    public OperacoesMatematicas(int a, int b){
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }
    public boolean sum(){
        int s = a +b;
        return s > 100;
    }

    @Override
    public String toString() {
        return ((sum())? "A soma dos números é maior que 100!": "A soma dos números é menor do que 100!");
    }
}
