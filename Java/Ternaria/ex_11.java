package CondicionalTernaria;

import java.util.Scanner;

public class ex_11 {
    public static void main(String[] args) {
        /*Verifique se um caractere digitado é uma vogal (a, e, i, o, u). Se for, retorne &quot;Vogal&quot;,
caso contrário, retorne &quot;Consoante&quot;.*/
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um caractere: ");
        char letra = scanner.next().toLowerCase().charAt(0);

        String resultado = ("aeiou".indexOf(letra) != -1) ? "Vogal" : "Consoante";
        System.out.println(resultado);

        scanner.close();
    }
}
