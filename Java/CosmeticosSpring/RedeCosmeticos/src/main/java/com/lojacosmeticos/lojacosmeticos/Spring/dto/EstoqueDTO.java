package com.lojacosmeticos.lojacosmeticos.Spring.dto;

public class EstoqueDTO {
    private Long id;
    private ProdutoDTO produto;
    private String categoriaProduto;
    private Integer quantidadeAtual;

    public EstoqueDTO(Long id, ProdutoDTO produto, String categoriaProduto, Integer quantidadeAtual) {
        this.id = id;
        this.produto = produto;
        this.categoriaProduto = categoriaProduto;
        this.quantidadeAtual = quantidadeAtual;
    }

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ProdutoDTO getProduto() {
        return produto;
    }

    public void setProduto(ProdutoDTO produto) {
        this.produto = produto;
    }

    public String getCategoriaProduto() {
        return categoriaProduto;
    }

    public void setCategoriaProduto(String categoriaProduto) {
        this.categoriaProduto = categoriaProduto;
    }

    public Integer getQuantidadeAtual() {
        return quantidadeAtual;
    }

    public void setQuantidadeAtual(Integer quantidadeAtual) {
        this.quantidadeAtual = quantidadeAtual;
    }
}
