package CondicoesString;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;

public class SimNao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Digite Sim ou Não: ");
        String sn = sc.next();

        if(Objects.equals(sn, "Sim")){
            System.out.println("A palavra digitada foi Sim!");
        } else if(Objects.equals(sn, "Não")){
            System.out.println("A palavra digitada foi Não!");
        }
        sc.close();
    }
}
