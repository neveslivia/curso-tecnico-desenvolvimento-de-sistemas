package CondicionalTernaria;

import java.util.Scanner;

public class ex_18 {
    public static void main(String[] args) {
        /*Determine se um triângulo é equilátero (três lados iguais), isósceles (dois lados
iguais) ou escaleno (todos diferentes) com base em três números.*/
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int num = scanner.nextInt();

        System.out.println((num % 4 == 0 && num % 6 == 0) ? "Sim" : "Não");
        scanner.close();
    }
}
