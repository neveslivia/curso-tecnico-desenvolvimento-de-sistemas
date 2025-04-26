package entities;

public class Produto {
    private String nome;
    private double preco;
    private int estoque;

    public Produto() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public void verificaco(){
        if (preco < 0){
            System.out.println("O preço não é válido, pois é negativo!");
        }else{
            preco += preco;
        }
    }
    public void adicao_estoque(int adicao){
        estoque += adicao;
    }
    public void remover_estoque(int subtrair){
        if (subtrair < estoque){
            estoque -= subtrair;
        }else{
            System.out.println("Você não produtos suficientes para remover do estoque!");
        }
    }

    @Override
    public String toString() {
        return "Produto : " + getNome() + "\n"+
                "Preço: " + getPreco() + "\n"+
                "Quantidade disponível no estoque: " + getEstoque();
    }
}
