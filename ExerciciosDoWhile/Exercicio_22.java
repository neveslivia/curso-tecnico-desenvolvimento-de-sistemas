package DoWhile;

public class ex_22 {
    /*Exiba os primeiros 10 números primos usando do while.
     */
    public static void main(String[] args) {
        int primo = 0;
        int nprimo = 0;
        int num = 2;
        int i = 2;
        do if (num % i == 0) {
            nprimo++;
            i++;
        } else {
            System.out.println(num);
            primo++;
        } while(primo <=10);

    }

}
