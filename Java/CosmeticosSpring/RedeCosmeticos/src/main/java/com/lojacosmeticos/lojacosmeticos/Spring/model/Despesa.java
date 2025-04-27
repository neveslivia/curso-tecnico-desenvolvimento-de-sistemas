package com.lojacosmeticos.lojacosmeticos.Spring.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;


@Entity
@Table(name = "despesa")
public class Despesa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Column(name = "valor_despesa", nullable = false)
    private Double valor;

    @NotNull
    @Column(name = "data_pagamento", nullable = false)
    private Date dataPagamento;

    @Enumerated(EnumType.STRING)
    @Column(name = "status_pagamento", nullable = true)
    private StatusPagamento statusPagamento;

    @OneToOne
    @NotNull
    @JoinColumn(name = "pagamento_id", nullable = false)
    private Pagamento pagamentoId;

    @ManyToOne
    @JoinColumn(name = "fornecedor_id")
    private Fornecedor fornecedor;

    @ManyToOne
    @JoinColumn(name = "funcionario_id")
    private Funcionario funcionario;


    public Despesa(Long id, Double valor, Date dataPagamento, StatusPagamento statusPagamento, Pagamento pagamentoId, Fornecedor fornecedor, Funcionario funcionario) {
        this.id = id;
        this.valor = valor;
        this.dataPagamento = dataPagamento;
        this.statusPagamento = statusPagamento;
        this.pagamentoId = pagamentoId;
        this.fornecedor = fornecedor;
        this.funcionario = funcionario;
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

    public Date getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(Date dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    public StatusPagamento getStatusPagamento() {
        return statusPagamento;
    }

    public void setStatusPagamento(StatusPagamento statusPagamento) {
        this.statusPagamento = statusPagamento;
    }

    public Pagamento getPagamentoId() {
        return pagamentoId;
    }

    public void setPagamentoId(Pagamento pagamentoId) {
        this.pagamentoId = pagamentoId;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }
}
