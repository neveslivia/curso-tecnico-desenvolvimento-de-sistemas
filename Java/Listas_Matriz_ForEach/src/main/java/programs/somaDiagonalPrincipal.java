package programs;

public class somaDiagonalPrincipal {
    public static void main(String[] args) {
        int [][] matriz = {{9,8,7},{6,5,4},{3,2,1}};
        int soma = 0;
        for (int i = 0 ; i<matriz.length;i++){
            for (int j = 0; j<matriz.length; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i< matriz.length; i++){
            soma = soma + matriz[i][i];
        }
        System.out.println("A soma da diagonal principal da matriz é: " + soma);

    }
}
