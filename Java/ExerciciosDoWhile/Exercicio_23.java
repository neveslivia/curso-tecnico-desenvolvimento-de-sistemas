package DoWhile;

public class ex_23 {
    /*Exiba a sequência de números triangulares até o décimo termo usando do while.
     */
    public static void main(String[] args) {
        int i =1;
        int s = 1;
        int a;
        do {
            s = s + i;
            a = s -1;
            i++;
            System.out.println(a);
        }while(i<=10);

    }

}
