package CondicionalTernaria;

import java.util.Scanner;

public class ex_30 {
    public static void main(String[] args) {
        /*Determine se um aluno foi aprovado ou reprovado com base em duas notas. A
média mínima para aprovação é 6.*/
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();
        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();
        scanner.close();

        double media = (nota1 + nota2) / 2;
        String resultado = (media >= 6) ? "Aprovado" : "Reprovado";
        System.out.println(resultado);
    }
}
