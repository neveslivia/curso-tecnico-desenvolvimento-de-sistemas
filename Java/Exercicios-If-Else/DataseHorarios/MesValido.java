package DataseHorarios;

import java.util.Scanner;

public class MesValido {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o mês (1 a 12): ");
        int mes = sc.nextInt();

        if (mes >= 1 && mes <= 12) {
            System.out.println("Mês válido.");
        } else {
            System.out.println("Mês inválido.");
        }
        sc.close();
    }
}
