package aplication.Student;

import entities.Student;

import java.util.Locale;
import java.util.Scanner;




public class ProgramStudent {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Student student= new Student();
        System.out.println("Digite as três notas: ");
        student.setNota1(sc.nextDouble());
        student.setNota2(sc.nextDouble());
        student.setNota3(sc.nextDouble());
        System.out.println(student);







    }
}
