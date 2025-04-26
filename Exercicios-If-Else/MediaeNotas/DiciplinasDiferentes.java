package MediaeNotas;

import java.util.Locale;
import java.util.Scanner;

public class DiciplinasDiferentes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Digite a 1° nota:");
        double nota1 = sc.nextDouble();
        System.out.println("Digite a 2° nota:");
        double nota2 = sc.nextDouble();

        if (nota1 > 7)  {
            System.out.println("O aluno foi aprovado na primeira matéria!" );

        } else if (nota2 > 7 ) {
            System.out.println("O aluno foi aprovado na segunda matéria!" );
            
        }else if (nota1 > 7 && nota2 > 7){
            System.out.println("O aluno foi aprovado nas duas matérias!");
        }else{
            System.out.println("O aluno foi reprovado!");
        }
        sc.close();

    }
}
