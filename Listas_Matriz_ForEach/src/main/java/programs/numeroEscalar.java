package programs;

import java.util.Scanner;

public class numeroEscalar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int [3][3];

        System.out.println("Digite um número escalar: ");
        int escalar = sc.nextInt();
        System.out.println("Digite 9 números para uma matriz 3x3: ");


        for (int i = 0; i< 3; i++){
            for (int j = 0; j< 3; j++){
                matriz[i][j]= sc.nextInt();

            }
            System.out.println();
        }
        System.out.println("Matriz multiplicada pelo número escalar: ");
        for (int i = 0; i< 3; i++){
            for (int j = 0; j< 3; j++){
                matriz[i][j] = matriz[i][j] * escalar;
                System.out.print(matriz[i][j] + " ");

            }
            System.out.println();
        }
        sc.close();
    }
}
