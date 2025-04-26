package com.lojacosmeticos.lojacosmeticos.Spring.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Table(name = "nota_fiscal")
public class NotaFiscal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Column(name = "numero_nf", nullable = false)
    private String numero;

    @NotNull
    @Column(name = "data_emissao", nullable = false)
    private Date dataEmissao;


    @ManyToOne
    @JoinColumn(name = "fornecedor_id")
    private Fornecedor fornecedor;

    @OneToOne
    @JoinColumn(name = "venda_id")
    private Vendas venda;

    @OneToOne
    @JoinColumn(name = "despesa_id")
    private Despesa despesa;

    @NotNull
    @OneToOne
    @JoinColumn(name = "pagamento_id", nullable = false)
    private Pagamento pagamento;

    @NotNull
    @Column(name = "valor_total", nullable = false)
    private Double valorTotal;

    @NotNull
    @Enumerated(EnumType.STRING)
    @Column(name = "status", nullable = false)
    private StatusNotaFiscal status;

    @NotNull
    @Enumerated(EnumType.STRING)
    @Column(name = "tipo", nullable = false)
    private TipoNotaFiscal tipo;

    public NotaFiscal(Long id, String numero, Date dataEmissao, Fornecedor fornecedor, Vendas venda, Despesa despesa, Pagamento pagamento, Double valorTotal, StatusNotaFiscal status, TipoNotaFiscal tipo) {
        this.id = id;
        this.numero = numero;
        this.dataEmissao = dataEmissao;
        this.fornecedor = fornecedor;
        this.venda = venda;
        this.despesa = despesa;
        this.pagamento = pagamento;
        this.valorTotal = valorTotal;
        this.status = status;
        this.tipo = tipo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Date getDataEmissao() {
        return dataEmissao;
    }

    public void setDataEmissao(Date dataEmissao) {
        this.dataEmissao = dataEmissao;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public Vendas getVenda() {
        return venda;
    }

    public void setVenda(Vendas venda) {
        this.venda = venda;
    }

    public Despesa getDespesa() {
        return despesa;
    }

    public void setDespesa(Despesa despesa) {
        this.despesa = despesa;
    }

    public Pagamento getPagamento() {
        return pagamento;
    }

    public void setPagamento(Pagamento pagamento) {
        this.pagamento = pagamento;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public StatusNotaFiscal getStatus() {
        return status;
    }

    public void setStatus(StatusNotaFiscal status) {
        this.status = status;
    }

    public TipoNotaFiscal getTipo() {
        return tipo;
    }

    public void setTipo(TipoNotaFiscal tipo) {
        this.tipo = tipo;
    }
}
