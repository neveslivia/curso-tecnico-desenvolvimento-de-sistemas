package aplication.Employee;

import entities.Employee;

import java.util.Locale;
import java.util.Scanner;

public class ProgramEmployee {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Employee employee = new Employee();


        Scanner sc = new Scanner(System.in);
        System.out.println("Name: ");
        employee.setName(sc.next());
        System.out.println("Gross Salary: ");
        employee.setGrosssalary(sc.nextDouble());
        System.out.println("Tax: ");
        employee.setTax(sc.nextDouble());
        System.out.println(employee);
        System.out.println("Which percentage to increase salary? ");
        employee.setPercentage(sc.nextDouble());
        System.out.printf("Update data: %s , $ %.2f", employee.getName(),employee.IncreaseSalary() );



    }
}
