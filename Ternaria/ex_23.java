package CondicionalTernaria;

import java.util.Scanner;

public class ex_23 {
    public static void main(String[] args) {
        /*Determine se uma senha fornecida pelo usuário é válida. A senha válida deve ter
pelo menos 8 caracteres.*/
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma palavra: ");
        String palavra = scanner.next();

        System.out.println(palavra.length() > 5 ? "Sim" : "Não");
        scanner.close();
    }
}
