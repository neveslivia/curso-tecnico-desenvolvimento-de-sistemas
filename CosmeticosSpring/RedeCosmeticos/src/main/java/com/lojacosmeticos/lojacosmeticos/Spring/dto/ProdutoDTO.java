package com.lojacosmeticos.lojacosmeticos.Spring.dto;

public class ProdutoDTO {
    private Long id;
    private String nomeProduto;
    private String descricao;
    private Double precoProduto;
    private int quantidadeEstoque;

    public ProdutoDTO(Long id, String nomeProduto, String descricao, Double precoProduto, int quantidadeEstoque) {
        this.id = id;
        this.nomeProduto = nomeProduto;
        this.descricao = descricao;
        this.precoProduto = precoProduto;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public ProdutoDTO() {
    }

    public ProdutoDTO(Long id, String nomeProduto, String descricao, Double precoProduto) {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getPrecoProduto() {
        return precoProduto;
    }

    public void setPrecoProduto(Double precoProduto) {
        this.precoProduto = precoProduto;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }
}


