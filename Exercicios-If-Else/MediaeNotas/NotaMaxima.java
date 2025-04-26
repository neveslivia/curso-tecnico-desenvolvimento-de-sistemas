package MediaeNotas;

import java.util.Locale;
import java.util.Scanner;

public class NotaMaxima {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Digite a nota:");
        double nota = sc.nextDouble();

        if (nota > 7 && nota < 10){
            System.out.println("O aluno foi aprovado!");
        } else if (nota >=10) {
            System.out.println("O aluno foi aprovado com nota máxima!");
        }else if (nota > 5 && nota < 7 ){
            System.out.println("O aluno foi está de recuperaçao!");
        }else {
            System.out.println("O aluno foi reprovado!");
        }

    }
}
