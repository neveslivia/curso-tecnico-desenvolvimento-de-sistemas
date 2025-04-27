package entities;

public class Desenvovedor extends Funcionario{
    private double salariodev;
    public Desenvovedor(String nome, double salarioBase) {
        super(nome, salarioBase);
    }
    @Override
    public double calcularSalario(){
        return salariodev += salarioBase + (salarioBase/100) *10;

    }
    public String toString() {
        return "Nome: " +nome + " , " +
                "Salário: " +calcularSalario();
    }
}
