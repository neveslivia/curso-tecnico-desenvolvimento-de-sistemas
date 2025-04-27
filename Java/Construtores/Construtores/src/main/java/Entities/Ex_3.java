package Entities;

public class Ex_3 {
    private String titular;
    private double saldo;
    private String tipoConta;

    public String getTitular() {
        return titular;
    }


    public double getSaldo() {
        return saldo;
    }


    public String getTipoConta() {
        return tipoConta;
    }


    public Ex_3(String titular, double saldo, String tipoConta) {
        this.titular = titular;
        this.saldo = saldo;
        this.tipoConta = tipoConta;
    }

    public Ex_3(String titular) {
        this.titular = titular;
        this.saldo = 0.0;
        this.tipoConta = "Corrente";
    }

    @Override
    public String toString() {
        return "Titular : " + getTitular() + "\n" +
                "Saldo: " +getSaldo()+ "\n"+
                "Tipo de Conta: " +getTipoConta();
    }
}
