package programs;

import entities.Produto;

import java.util.Locale;
import java.util.Scanner;

public class ProgramProduto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        Produto produto = new Produto();

        System.out.println("Digite o nome do produto: ");
        produto.setNome(sc.next());
        System.out.println("Digite o valor do produto: ");
        produto.setPreco(sc.nextDouble());
        System.out.println("Digite a quantidade disponível no estoque: ");
        produto.setEstoque(sc.nextInt());
        System.out.println("Digite a quantidade de produtos que quer adcionar no estoque: ");
        produto.adicao_estoque(sc.nextInt());
        System.out.println("Digite a quantidade de produtos que deseja remover do estoque: ");
        produto.remover_estoque(sc.nextInt());
        System.out.println(produto);

    }
}
