package entities;

public class PagamentoDinheiro extends Pagamento{

    @Override
    public void realizarPagamento(){
        System.out.println("Pagamento com dinheiro recebido!");
    }
}
