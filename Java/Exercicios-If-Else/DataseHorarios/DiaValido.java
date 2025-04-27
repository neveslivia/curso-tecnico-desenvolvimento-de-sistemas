package DataseHorarios;

import java.util.Scanner;

public class DiaValido {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o mês (1 a 12): ");
        int mes = sc.nextInt();
        System.out.println("Digite o dia: ");
        int dia = sc.nextInt();

        boolean valido = (dia > 0 && dia <= 31 && (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12)) ||
                (dia > 0 && dia <= 30 && (mes == 4 || mes == 6 || mes == 9 || mes == 11)) ||
                (dia > 0 && dia <= 28 && mes == 2);

        if (valido || (mes == 2 && dia == 29)) {
            System.out.println("Data válida.");
        } else {
            System.out.println("Data inválida.");
        }
        sc.close();
    }
}
