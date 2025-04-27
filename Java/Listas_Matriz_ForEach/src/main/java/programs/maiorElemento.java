package programs;

public class maiorElemento {
    public static void main(String[] args) {
        int [][] matriz = {{1,2,3},{4,5,6},{7,8,9}};
        int maior = matriz[0][0];
        for (int i = 0; i<matriz.length; i++){
            for (int j = 0; j<matriz.length;j++){
                if (matriz[i][j] > maior){
                    maior = matriz[i][j];
                }
            }
        }
        System.out.println("O maior elemento é: "+maior);


    }
}
