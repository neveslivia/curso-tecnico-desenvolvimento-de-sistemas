package programs;

import java.util.Random;

public class somacolunaMatriz4x4 {
    public static void main(String[] args) {

        int [][] matriz = new int [4][4];
        Random gerador = new Random();
        int somacoluna1 ;
        int somacoluna2 ;
        int somacoluna3 ;
        int somacoluna4 ;



        for (int i = 0; i< 4; i++){
            for (int j = 0; j< 4; j++){
                matriz[i][j] = gerador.nextInt(10);
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        somacoluna1 = (matriz[0][0])+ (matriz[1][0]) + (matriz[2][0]) + (matriz[3][0]);
        somacoluna2 = (matriz[0][1])+ (matriz[1][1]) + (matriz[2][1]) + (matriz[3][1]);
        somacoluna3 = (matriz[0][2])+ (matriz[1][2]) + (matriz[2][2]) + (matriz[3][2]);
        somacoluna4 = (matriz[0][3])+ (matriz[1][3]) + (matriz[2][3]) + (matriz[3][3]);

        System.out.println("A soma das coluna 1 da matriz é: "+ somacoluna1);
        System.out.println("A soma das coluna 2 da matriz é: "+ somacoluna2);
        System.out.println("A soma das coluna 3 da matriz é: "+ somacoluna3);
        System.out.println("A soma das coluna 4 da matriz é: "+ somacoluna4);


    }
}
