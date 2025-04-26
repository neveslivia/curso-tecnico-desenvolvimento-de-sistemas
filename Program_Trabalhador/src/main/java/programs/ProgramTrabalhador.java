package programs;

import entities.Departament;
import entities.HourContract;
import entities.Worker;
import entities.WorkerLevel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class ProgramTrabalhador {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Enter departament´s name: ");
        String departamentName = sc.nextLine();
        System.out.println("Enter worker data ");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Level: ");
        String workerLevel = sc.nextLine();
        System.out.print("Base salary: ");
        double baseSalary = sc.nextDouble();
        Worker worker = new Worker(name,WorkerLevel.valueOf(workerLevel),baseSalary,new Departament());
        System.out.println("How many contracts to this worker: ");
        int quantity = sc.nextInt();



        for (int i = 1; i <= quantity; i++){
            System.out.println("Enter contract #" + i+ " data");
            System.out.print("Date (DD/MM/YYYY): ");
            Date date = f.parse(sc.next());
            System.out.print("Value per hour: ");
            double valuePerHour = sc.nextDouble();
            System.out.print("Duration (hours): ");
            int hours = sc.nextInt();
            HourContract contract = new HourContract(date,valuePerHour,hours);
            worker.addContract(contract);

        }
        System.out.println();
        System.out.print("Enter month and year to calculate income (MM/YYYY): ");
        String monthAndYear = sc.next();
        int month = Integer.parseInt(monthAndYear.substring(0,2));
        int year = Integer.parseInt(monthAndYear.substring(3));
        System.out.println("Name: " + worker.getName());
        System.out.println("Departament: "+ worker.getDepartament().getName());
        System.out.println("Income for " + monthAndYear + ":" + String.format("%.2f", worker.income(year,month)));
        sc.close();





    }
}
