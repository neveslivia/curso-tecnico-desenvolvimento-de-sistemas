package programacao;

public class Soma {
    private double parcela;
    private double salario;
    private double porcento;


    public Soma(){
        this.parcela = 0;
        this.salario = 0;

    }

    public double getPorcento() {
        return porcento;
    }

    public double getParcela() {
        return parcela;
    }

    public double getSalario() {
        return salario;
    }

    public void setParcela(double parcela) {
        this.parcela = parcela;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String Resultado (){

         porcento = (salario * 10) / 100;
         if ( parcela <= porcento) {
             return String.format("Compra autorizada %nValor parcela : %.2f%n10%% Salario = %.2f",parcela, porcento);

         }else {
             return String.format("Compra negada %n Parcela incompatival... ");
         }

    }
}
