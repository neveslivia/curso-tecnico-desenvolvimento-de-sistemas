package programs;

import java.util.Random;

public class percorrerMatriz3x3 {
    public static void main(String[] args) {

        int [][] matriz = new  int [3][3];
        Random gerador = new Random();
        for (int i = 0; i < 3; i++){
            for (int j =0; j< 3; j++){
                matriz[i][j] = gerador.nextInt(10);
            }
        }
        System.out.println("Matrix 3x3: ");
        for (int i = 0; i < 3; i++){
            for (int j =0; j< 3; j++){
                System.out.print(matriz[i][j] +" ");



            }
            System.out.println();
        }
    }
}
