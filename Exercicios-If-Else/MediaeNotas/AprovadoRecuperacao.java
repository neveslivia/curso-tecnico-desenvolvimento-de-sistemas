package MediaeNotas;

import java.util.Locale;
import java.util.Scanner;

public class AprovadoRecuperacao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Digite a 1° nota: ");
        double nota1 = sc.nextDouble();
        System.out.println("Digite a 2° nota: ");
        double nota2 = sc.nextDouble();
        double soma = nota1 + nota2;
        double media = soma / 2;

        if (media>= 5 && media <7){
            System.out.println("O aluno está em recuperação!");
        } else if (media> 7) {
            System.out.println("O aluno foi aprovado!");
        }else{
            System.out.println("O aluno foi reprovado!");
        }

    }
}
