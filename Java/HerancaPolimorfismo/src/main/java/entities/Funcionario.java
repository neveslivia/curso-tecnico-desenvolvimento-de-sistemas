package entities;

public class Funcionario {
    protected String nome;
    protected double salarioBase;

    public Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }


    public  double calcularSalario(){
        return  salarioBase;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + " , " +
                "Salário: " + calcularSalario();
    }
}
