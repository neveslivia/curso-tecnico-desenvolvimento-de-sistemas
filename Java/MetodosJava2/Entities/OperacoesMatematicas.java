package entities;

public class OperacoesMatematicas {
    public int a;
    public int b;

    public OperacoesMatematicas(int a, int b){
        this.a = a;
        this.b = b;
    }
    public boolean sum(){
        int s = a + b;
        return s > 100;
    }

    @Override
    public String toString() {
        return ((sum())? "A soma dos números é maior do que 100!": "A soma dos números é menor do que 100!");
    }
}
