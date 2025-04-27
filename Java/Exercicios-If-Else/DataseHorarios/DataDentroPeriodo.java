package DataseHorarios;

import java.util.Scanner;

public class DataDentroPeriodo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o ano: ");
        int ano = sc.nextInt();
        System.out.println("Digite o mês (1 a 12): ");
        int mes = sc.nextInt();
        System.out.println("Digite o dia: ");
        int dia = sc.nextInt();

        boolean periodoValido = (ano == 2023 && mes >= 6 && mes <= 8) || (ano == 2023 && mes == 9 && dia <= 15);

        if (periodoValido) {
            System.out.println("A data está dentro do período específico.");
        } else {
            System.out.println("A data não está dentro do período específico.");
        }
        sc.close();
    }
}
