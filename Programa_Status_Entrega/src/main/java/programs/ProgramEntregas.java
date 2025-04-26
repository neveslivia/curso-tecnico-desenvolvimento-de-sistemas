package programs;

import entities.Order;
import entities.OrderStatusEntrega;
import entities.Products;

import java.time.LocalDateTime;
import java.util.Locale;
import java.util.Scanner;

public class ProgramEntregas {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Products product = new Products();

        System.out.println("Digite o nome do produto: ");
        product.setNome(sc.nextLine());
        System.out.println("Digite o valor do produto: ");
        product.setValor_produto(sc.nextDouble());
        System.out.println("Digite a quantidade de produtos comprados: ");
        product.setQuantidade(sc.nextInt());
        System.out.println("Digite o código de rastreio do pedido: ");
        Integer id = sc.nextInt();

        Order order = new Order(id, LocalDateTime.now(), OrderStatusEntrega.PAGAMENTO_PENDENTE);
        String continuar;

        do  {
            System.out.println("Deseja atualizar o status do pedido? (S/N)");
            continuar = sc.next().toUpperCase();

            if (continuar.equals("S")) {
                order.atualizacao();
            } else if (continuar.equals("N")) {
                break;}
        }while (continuar.equals("S"));

        System.out.println("Resumo do Pedido");
        System.out.println(product);
        System.out.println(order);

        sc.close();







    }
}
