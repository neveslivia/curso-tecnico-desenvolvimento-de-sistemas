package CondicionalTernaria;

import java.util.Scanner;

public class ex_28 {
    public static void main(String[] args) {
        /*Verifique se um número está dentro do intervalo de 20 a 30 ou se está fora desse
intervalo.*/
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();
        scanner.close();

        String resultado = (numero >= 20 && numero <= 30) ? "Dentro do intervalo" : "Fora do intervalo";
        System.out.println(resultado);
    }
}
