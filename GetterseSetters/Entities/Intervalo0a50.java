package entities;

public class Intervalo0a50 {
    private int num;

    public Intervalo0a50(int num){
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public boolean numero(){
        return num>= 0 && num <=50;
    }

    @Override
    public String toString() {
        return ((numero())? "O número está dentro do intervalo!" : "O número não está dentro do intervalo!");
    }


}
