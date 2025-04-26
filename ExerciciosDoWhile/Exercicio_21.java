package DoWhile;

public class ex_21 {
    /*Exiba os primeiros 10 números perfeitos usando do while.

     */
    public static void main(String[] args) {
        int quantidade = 10, encontrados = 0, numero = 2;

        do {
            int soma = 1, i = 2;
            do {
                if (numero % i == 0) soma += i;
                i++;
            } while (i <= numero / 2);

            if (soma == numero) {
                System.out.println(numero);
                encontrados++;
            }
            numero++;
        } while (encontrados < quantidade);
    }
}
