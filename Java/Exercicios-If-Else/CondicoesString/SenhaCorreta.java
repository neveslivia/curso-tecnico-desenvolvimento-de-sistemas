package CondicoesString;

import java.util.Locale;
import java.util.Scanner;

public class SenhaCorreta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Digite uma senha de 4 números: ");
        int senhad = sc.nextInt();
        int senhac = 1234;
        if (senhad == senhac){
            System.out.println("Senha correta!");
        }else{
            System.out.println("Senha incorreta!");
        }
        sc.close();
    }
}
