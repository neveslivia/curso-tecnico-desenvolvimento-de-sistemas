package programs;

import java.util.Random;

public class somaMatriz4x4 {
    public static void main(String[] args) {
        int [][] matriz = new  int [4][4];
        Random gerador = new Random();
        int soma = 0;
        for (int i = 0; i < 3; i++){
            for (int j =0; j< 3; j++){
                matriz[i][j] = gerador.nextInt(20);
                soma = soma + matriz[i][j];
            }
        }
        System.out.println("Matrix 4x4: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + " ");


            }
            System.out.println();
        }
        System.out.println("A soma dos elemetos da matriz 4x4 é:"+ soma);



    }

}
