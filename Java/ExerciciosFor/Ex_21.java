package ExerciciosFor;

import java.util.Scanner;

public class Ex_21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();
        int soma = somaDosDigitos(Math.abs(numero));// Calcula a soma dos dígitos
        System.out.println("A soma dos dígitos de " + numero + " é: " + soma); // Exibe o resultado
        scanner.close();
    }
    public static int somaDosDigitos(int numero) {
        int soma = 0;
        while (numero > 0) {
            soma += numero % 10; // Pega o último dígito e soma
            numero /= 10; // Remove o último dígito
        }
        return soma;

    }
}
