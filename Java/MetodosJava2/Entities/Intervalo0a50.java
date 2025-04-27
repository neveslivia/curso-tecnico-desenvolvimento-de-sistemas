package entities;

public class Intervalo0a50 {
    public int num;

    public Intervalo0a50(int num){
        this.num = num;
    }
    public boolean numero() {
        return num >= 0 && num <= 50;
    }

    @Override
    public String toString() {
        return ((numero())? "O número está dentro o intervalo!" : "O número está fora do intervalo!");
    }
}
