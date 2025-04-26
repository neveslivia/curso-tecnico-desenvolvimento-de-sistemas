package DoWhile;

import java.util.Scanner;

public class ex_20 {
    /*Solicite a senha do usuário e continue pedindo até que ele digite a correta.
     */
    public static void main(String[] args) {
        int senha = 54321;
        Scanner sc = new Scanner(System.in);
        int senhad;
        do {
            System.out.println("Digite a senha: ");
            senhad = sc.nextInt();


        }while (senhad != senha);
        System.out.println("Senha correta!");
    }
}
