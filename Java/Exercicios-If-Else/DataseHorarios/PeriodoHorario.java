package DataseHorarios;

import java.util.Scanner;

public class PeriodoHorario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite as horas (0 a 23): ");
        int horas = sc.nextInt();

        if (horas >= 6 && horas < 12) {
            System.out.println("Manhã.");
        } else if (horas >= 12 && horas < 18) {
            System.out.println("Tarde.");
        } else {
            System.out.println("Noite.");
        }
        sc.close();
    }
}
