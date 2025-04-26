package entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Worker {
    private String name;
    private WorkerLevel level;
    private double baseSalary;

    public Worker(String name, WorkerLevel level, double baseSalary, Departament departament) {
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.departament = departament;

    }


    private Departament departament;
    private List<HourContract> contracts = new ArrayList<>();


    public String getName() {
        return name;
    }


    public Departament getDepartament() {
        return departament;
    }


    public void addContract(HourContract contract){
        contracts.add(contract);


    }
    public double income (Integer year,Integer month){
        double sum = baseSalary;
        Calendar cal = Calendar.getInstance();
        for (HourContract c: contracts){
            cal.setTime(c.getDate());
            int c_year = cal.get(Calendar.YEAR);
            int c_month = 1 + cal.get(Calendar.MONTH);
            if (year == c_year && month == c_month){
                sum += c.totalValue();
            }
        }
        return  sum;
    }

}
