package com.lojacosmeticos.lojacosmeticos.Spring.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;


@Entity
@Table(name = "estoque")
public class Estoque {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @OneToOne
    @JoinColumn(name = "produto_id", nullable = false)
    @JsonIgnore

    private Produto produto;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "fornecedor_id", nullable = false)
    private Fornecedor fornecedor;

    @Enumerated(EnumType.STRING)
    @Column(name = "categoria_produto")
    private CategoriaProdutos categoriaProduto;

    @NotNull
    @Column(name = "quantidade_atual", nullable = false)
    private Integer quantidadeAtual;

    public Estoque(Long id, Produto produto, Fornecedor fornecedor, CategoriaProdutos categoriaProduto, Integer quantidadeAtual) {
        this.id = id;
        this.produto = produto;
        this.fornecedor = fornecedor;
        this.categoriaProduto = categoriaProduto;
        this.quantidadeAtual = quantidadeAtual;
    }

    public Estoque() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public CategoriaProdutos getCategoriaProduto() {
        return categoriaProduto;
    }

    public void setCategoriaProduto(CategoriaProdutos categoriaProduto) {
        this.categoriaProduto = categoriaProduto;
    }

    public Integer getQuantidadeAtual() {
        return quantidadeAtual;
    }

    public void setQuantidadeAtual(Integer quantidadeAtual) {
        this.quantidadeAtual = quantidadeAtual;
    }
}



