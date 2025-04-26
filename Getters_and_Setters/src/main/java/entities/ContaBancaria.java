package entities;

public class ContaBancaria {
    private String titular;
    private double saldo;

    public ContaBancaria() {
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }


    public void setSaldo(double saldo) {

        this.saldo = saldo;
    }

    public void deposito(double valor) {

        saldo += valor;

    }

    public void saque(double valor) {
        if (valor > saldo) {
            System.out.println("Você não tem saldo para fazer esse saque!");
        } else {
            saldo -= valor;
        }



    }

    @Override
    public String toString() {
        return "Titular: " + getTitular()+ "\n" +
                String.format("Saldo:%.2f ", saldo);
    }
}