package DoWhile;

public class ex_6 {
    /*Calcule a soma dos números de 1 a 50 usando do while.
     */
    public static void main(String[] args) {
        int num = 1;
        int soma = 0;
        do {
            soma += num;
            num ++;

        }while(num <=50);
        System.out.println("A soma dos números de 1 a 50 é " + soma);
    }

}
