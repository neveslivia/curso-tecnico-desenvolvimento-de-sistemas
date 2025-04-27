package programs;

import entities.Pessoa;

import java.util.Scanner;

public class ProgramPessoa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pessoa pessoa = new Pessoa();
        System.out.println("Digite seu nome: ");
        pessoa.setNome(sc.next());
        System.out.println("Digite a sua idade: ");
        pessoa.setIdade(sc.nextInt());
        System.out.println(pessoa);
    }
}
