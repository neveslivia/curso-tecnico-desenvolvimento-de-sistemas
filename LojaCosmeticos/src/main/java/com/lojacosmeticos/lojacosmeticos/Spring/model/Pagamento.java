package com.lojacosmeticos.lojacosmeticos.Spring.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;


@Entity
@Table(name = "pagamento")
public class Pagamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Column(name = "valor", nullable = false)
    private Double valor;

    @NotNull
    @Enumerated(EnumType.STRING)
    @Column(name = "forma_pagamento", nullable = false)
    private FormaPagamento formaPagamento;

    @NotNull
    @Enumerated(EnumType.STRING)
    @Column(name = "status_pagamento", nullable = false)
    private StatusPagamento statusPagamento;

    @OneToOne
    @JoinColumn(name = "venda_id")
    private Vendas vendas;

    @OneToOne
    @JoinColumn(name = "despesa_id")
    private Despesa despesa;

    @OneToOne
    @JoinColumn(name = "recebivel_id")
    private ContaReceber recebivel;

    public Pagamento(Long id, Double valor, FormaPagamento formaPagamento, StatusPagamento statusPagamento, Vendas vendas, Despesa despesa, ContaReceber recebivel) {
        this.id = id;
        this.valor = valor;
        this.formaPagamento = formaPagamento;
        this.statusPagamento = statusPagamento;
        this.vendas = vendas;
        this.despesa = despesa;
        this.recebivel = recebivel;
    }

    public Pagamento() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public FormaPagamento getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(FormaPagamento formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public StatusPagamento getStatusPagamento() {
        return statusPagamento;
    }

    public void setStatusPagamento(StatusPagamento statusPagamento) {
        this.statusPagamento = statusPagamento;
    }

    public Vendas getVendas() {
        return vendas;
    }

    public void setVendas(Vendas vendas) {
        this.vendas = vendas;
    }

    public Despesa getDespesa() {
        return despesa;
    }

    public void setDespesa(Despesa despesa) {
        this.despesa = despesa;
    }

    public ContaReceber getRecebivel() {
        return recebivel;
    }

    public void setRecebivel(ContaReceber recebivel) {
        this.recebivel = recebivel;
    }
}

