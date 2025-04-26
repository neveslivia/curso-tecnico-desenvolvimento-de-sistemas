package programs;

public class somaDiagonalSecundaria {
    public static void main(String[] args) {
        int [][] matriz = {{9,8,7},{6,5,4},{3,2,1}};
        int soma = 0;
            soma = soma + matriz[0][2];
            soma = soma + matriz[1][1];
            soma = soma + matriz[2][0];


        System.out.println("A soma da diagonal secundária da matriz é: " + soma);
    }
}
