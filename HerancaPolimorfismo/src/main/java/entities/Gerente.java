package entities;

public class Gerente extends  Funcionario{

    private double salariogerente;
    private double bonus;

    public Gerente(String nome, double salarioBase, double bonus) {
        super(nome,salarioBase);
        this.bonus = bonus;

    }
    @Override
    public double calcularSalario(){
        return salariogerente += salarioBase + bonus;

    }
    public String toString() {
        return "Nome: " + nome + " , "+
                "Salário: " + calcularSalario();
    }


}
