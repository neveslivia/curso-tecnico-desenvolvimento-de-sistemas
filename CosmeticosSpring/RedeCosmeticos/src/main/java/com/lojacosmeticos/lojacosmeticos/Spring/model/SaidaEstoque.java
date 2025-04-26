package com.lojacosmeticos.lojacosmeticos.Spring.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
@Getter
@Setter
@Entity
@Table(name = "saida-estoque")
public class SaidaEstoque {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    @ManyToOne
    @JoinColumn(name = "produto_id", nullable = false)
    private Produto produto;
    @NotNull
    @OneToOne
    @JoinColumn(name = "estoque_id",nullable = false)
    private Estoque estoque;
    @NotNull
    @Column(name = "quantidade",nullable = false)
    private Integer quantidade;
    @NotNull
    @Column(name = "data_saida",nullable = false)
    private LocalDateTime dataSaida;
    @Enumerated(EnumType.STRING)
    @Column(name = "categoria",nullable = true)
    private CategoriaProdutos categoria;
    @NotNull
    @ManyToOne
    @JoinColumn(name = "fornecedor_id", nullable = false)
    private Fornecedor fornecedor;

    public SaidaEstoque(Long id, Produto produto, Estoque estoque, Integer quantidade, LocalDateTime dataSaida, CategoriaProdutos categoria, Fornecedor fornecedor) {
        this.id = id;
        this.produto = produto;
        this.estoque = estoque;
        this.quantidade = quantidade;
        this.dataSaida = dataSaida;
        this.categoria = categoria;
        this.fornecedor = fornecedor;
    }

    public SaidaEstoque() {
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

    public Estoque getEstoque() {
        return estoque;
    }

    public void setEstoque(Estoque estoque) {
        this.estoque = estoque;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public LocalDateTime getDataSaida() {
        return dataSaida;
    }

    public void setDataSaida(LocalDateTime dataSaida) {
        this.dataSaida = dataSaida;
    }

    public CategoriaProdutos getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaProdutos categoria) {
        this.categoria = categoria;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }
}
