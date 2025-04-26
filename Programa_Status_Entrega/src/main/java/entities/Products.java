package entities;

public class Products {
    private String nome;
    private int quantidade;
    private  double valor_produto;


    public Products(){

    }
    public Products(String nome,int quantidade,double valor_produto){
        this.nome= nome;
        this.quantidade = quantidade;
        this.valor_produto = valor_produto;
    }
    public double valortotal(){
        return  valor_produto * quantidade;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getValor_produto(double v) {
        return valor_produto;
    }

    public String setNome(String nome) {
        return this.nome = nome;
    }

    public Integer setQuantidade(int quantidade) {
        return this.quantidade = quantidade;
    }

    public Double setValor_produto(double valor_produto) {
       return this.valor_produto = (double) valor_produto;
    }

    @Override
    public String toString() {
         return String.format("Nome do produto:%s\nQuantidade: %d\nValor total do pedido:%.2f",
                getNome(), getQuantidade(), valortotal());

    }


}
