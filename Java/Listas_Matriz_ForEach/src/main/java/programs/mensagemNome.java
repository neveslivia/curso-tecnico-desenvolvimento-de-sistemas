package programs;

import java.util.ArrayList;
import java.util.List;

public class mensagemNome {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Jaqueline");
        list.add("Yara");
        list.add("Cleber");
        list.add("Caio");
        list.add("Valter");

        for(String nome : list){
            System.out.println("Olá " + nome);

        }
    }
}
