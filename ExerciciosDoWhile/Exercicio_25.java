package DoWhile;

public class ex_25 {
    /*Exiba um triângulo de números com base 5 usando do while.
     */
    public static void main(String[] args) {

        int base = 5, linha = 1;

           do {
               int num = 1, coluna = 1;
               do {
                   System.out.print(num + " ");
                   num++;
                   coluna++;
               } while (coluna <= linha);

               System.out.println();
               linha++;
                } while (linha <= base);
            }

        }


