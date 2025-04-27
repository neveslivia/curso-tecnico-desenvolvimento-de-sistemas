package criacaodetelas.crudjava.entities;

public class Employee {
    private String name;
    private double grosssalary;
    private double tax;
    private double percentage;

    public Employee() {

    }
    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }

    public String getName() {
        return name;
    }

    public void setName(String namne) {
        this.name = namne;
    }

    public void setGrosssalary(double grosssalary) {
        this.grosssalary = grosssalary;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public double NetSalary(){
        return grosssalary - tax;
    }
    public  double IncreaseSalary(){
        return NetSalary() +((NetSalary()* percentage) /100);

    }

    @Override
    public String toString() {
        return "Employee: "+ name+ " \n" + "Tax "+ tax + "%" +"\n"+ "Desconted salary $ " + NetSalary();
    }

}
