package Program;

import entities.Pagamento;
import entities.PagamentoCartao;
import entities.PagamentoDinheiro;

public class ProgramPagamento {
    public static void main(String[] args) {
        Pagamento [] pagamento= {new PagamentoCartao(), new PagamentoDinheiro()};
        for (Pagamento pagamentos: pagamento){
            pagamentos.realizarPagamento();
        }
    }
}
