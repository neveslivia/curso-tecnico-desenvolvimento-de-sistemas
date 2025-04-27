package MediaeNotas;

import java.util.Locale;
import java.util.Scanner;

public class MaiorNota {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Digite a 1° nota:");
        double nota1 = sc.nextDouble();
        System.out.println("Digite a 2° nota:");
        double nota2 = sc.nextDouble();
        System.out.println("Digite a 3° nota:");
        double nota3 = sc.nextDouble();

        if (nota1 > nota2 && nota1 > nota3){
            System.out.println("A maior nota é " + nota1);
        } else if (nota2> nota1 && nota2 > nota3) {
            System.out.println("A maior nota é " + nota2);
        }else{
            System.out.println("A maior nota é " + nota3);
        }
    }
}
