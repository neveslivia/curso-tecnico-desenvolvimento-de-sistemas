package CondicoesString;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Locale;
import java.util.Scanner;

public class NomeA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Digite um nome: ");
        String nome = sc.nextLine();
        String letra = nome.substring(0,1);

        if(letra.equals("A")){
            System.out.println("O nome informado começa com a letra A!");

        }else{
            System.out.println("O nome não começa com a letra A!");
        }


    }
}
