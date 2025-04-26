package com.lojacosmeticos.lojacosmeticos.Spring.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
@Getter
@Setter
@Entity
@Table(name = "produto")
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Column(name = "nome_produto", nullable = false)
    private String nomeProduto;

    @Column(name = "descricao_produto")
    private String descricao;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "fornecedor_id", nullable = false)
    private Fornecedor fornecedor;

    @Enumerated(EnumType.STRING)
    @Column(name = "categoria")
    private CategoriaProdutos categoriaProdutos;

    @NotNull
    @Column(name = "preco", nullable = false)
    private Double precoProduto;

    @OneToMany(mappedBy = "produto", cascade = CascadeType.ALL)
    private List<EntradaEstoque> entradaEstoque = new ArrayList<>();

    @OneToMany(mappedBy = "produto", cascade = CascadeType.ALL)
    private List<SaidaEstoque> saidaEstoque = new ArrayList<>();


    public Produto(Long id, String nomeProduto, String descricao, Fornecedor fornecedor, CategoriaProdutos categoriaProdutos, Double precoProduto, List<EntradaEstoque> entradaEstoque, List<SaidaEstoque> saidaEstoque) {
        this.id = id;
        this.nomeProduto = nomeProduto;
        this.descricao = descricao;
        this.fornecedor = fornecedor;
        this.categoriaProdutos = categoriaProdutos;
        this.precoProduto = precoProduto;
        this.entradaEstoque = entradaEstoque;
        this.saidaEstoque = saidaEstoque;
    }

    public Produto() {
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

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public CategoriaProdutos getCategoriaProdutos() {
        return categoriaProdutos;
    }

    public void setCategoriaProdutos(CategoriaProdutos categoriaProdutos) {
        this.categoriaProdutos = categoriaProdutos;
    }

    public Double getPrecoProduto() {
        return precoProduto;
    }

    public void setPrecoProduto(Double precoProduto) {
        this.precoProduto = precoProduto;
    }

    public List<EntradaEstoque> getEntradaEstoque() {
        return entradaEstoque;
    }

    public void setEntradaEstoque(List<EntradaEstoque> entradaEstoque) {
        this.entradaEstoque = entradaEstoque;
    }

    public List<SaidaEstoque> getSaidaEstoque() {
        return saidaEstoque;
    }

    public void setSaidaEstoque(List<SaidaEstoque> saidaEstoque) {
        this.saidaEstoque = saidaEstoque;
    }
    public int calcularEstoque(Produto produto) {
        int entradas = produto.getEntradaEstoque().stream().mapToInt(EntradaEstoque::getQuantidade).sum();
        int saidas = produto.getSaidaEstoque().stream().mapToInt(SaidaEstoque::getQuantidade).sum();
        return entradas - saidas;
    }

}







