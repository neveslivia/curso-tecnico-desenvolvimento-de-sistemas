package programs;

import java.util.Random;

public class maiorElementoMatrix3x3 {
    public static void main(String[] args) {
        int [][] matriz = new int [4][4];
        Random gerador = new Random();
        int maior = matriz[0][0];
        for (int i = 0; i< 4; i++){
            for (int j = 0; j< 4; j++){
                matriz[i][j] = gerador.nextInt(20);
                System.out.print(matriz[i][j] + " ");
                if (matriz[i][j] > maior){
                    maior= matriz[i][j];
                }
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("O maior valor da matriz é:  "+ maior );
    }
}
