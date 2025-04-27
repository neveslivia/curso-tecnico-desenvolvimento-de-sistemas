package DataseHorarios;

import java.util.Scanner;

public class HorarioValido {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite as horas: ");
        int horas = sc.nextInt();
        System.out.println("Digite os minutos: ");
        int minutos = sc.nextInt();

        if (horas >= 0 && horas < 24 && minutos >= 0 && minutos < 60) {
            System.out.println("Horário válido.");
        } else {
            System.out.println("Horário inválido.");
        }
        sc.close();
    }
}
