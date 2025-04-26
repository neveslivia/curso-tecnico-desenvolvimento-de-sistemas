package programs;

import java.util.Random;

public class mediaMatriz4x4 {
    public static void main(String[] args) {
        int [][] matriz = new int [4][4];
        Random gerador = new Random();
        double soma = 0;
        double media;

        for (int i = 0; i< 4; i++){
            for (int j = 0; j< 4; j++){
                matriz[i][j] = gerador.nextInt(10);
                soma= soma+ matriz[i][j];
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        media= soma/16;
        System.out.printf("A média dos valores da matriz gerada aleatoriamente é: %.2f " , media);
    }
}
