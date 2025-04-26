package entities;

public class PagamentoCartao extends Pagamento{

    @Override
    public void realizarPagamento(){
        System.out.println("Pagamento com o cartão aprovado!");
    }
}
