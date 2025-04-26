package DoWhile;

public class ex_7 {
    /*Exiba os números pares de 1 a 20 usando do while.
     */
    public static void main(String[] args) {
        int num = 1;
        do {
            if (num % 2 ==0){
                System.out.println(num);
            }
            num++;

        }while (num <=20);
    }
}
