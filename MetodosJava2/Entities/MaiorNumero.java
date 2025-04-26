package entities;

public class MaiorNumero {
    public int a;
    public int b;
    public int c;
    public MaiorNumero(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int max(){
        int maximo;
        if (a>b && a > c){
            maximo = a;
        } else if ( b >c) {
            maximo = b;

        }else{
            maximo = c;
        }
        return maximo;
    }

    @Override
    public String toString() {
        return "O maior número é " + max();
    }
}
