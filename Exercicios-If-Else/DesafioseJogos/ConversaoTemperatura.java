package DesafioseJogos;

import java.util.Scanner;

public class ConversaoTemperatura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a temperatura em Celsius: ");
        double celsius = sc.nextDouble();
        System.out.println("Escolha a conversão: 1 - Fahrenheit, 2 - Kelvin");
        int escolha = sc.nextInt();

        if (escolha == 1) {
            double fahrenheit = (celsius * 9/5) + 32;
            System.out.println("Temperatura em Fahrenheit: " + fahrenheit);
        } else if (escolha == 2) {
            double kelvin = celsius + 273.15;
            System.out.println("Temperatura em Kelvin: " + kelvin);
        } else {
            System.out.println("Opção inválida.");
        }
        sc.close();
    }
}
