package programacao;

public class Maior100 {

    private  int numero;
    public   int numero1;
    private  int soma ;

    public Maior100( ){
        this.numero = 0;
        this.soma = 0;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getSoma() {
        return soma;
    }

    public void setSoma(int soma) {
        this.soma = soma;
    }

    public String Resultado (){
        soma = getNumero() + getNumero1();
        if (soma > 100){
            return String.format(" O valor imformado e maior que %d .. %n",soma);
        }else {
            return String.format(" O valor imformado não e maior que 100 .. %n");
        }

    }
}
