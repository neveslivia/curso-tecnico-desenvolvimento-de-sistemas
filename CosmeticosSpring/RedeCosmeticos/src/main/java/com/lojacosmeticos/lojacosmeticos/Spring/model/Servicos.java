package com.lojacosmeticos.lojacosmeticos.Spring.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "servico")
public class Servicos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome_servico", nullable = false)
    private String nomeServico;

    @Column(name = "preco_servico", nullable = false)
    private Double precoServico;

    @Column(name = "duracao_estimada", nullable = true)
    private String duracaoEstimada;

    public Servicos(Long id, String nomeServico, Double precoServico, String duracaoEstimada) {
        this.id = id;
        this.nomeServico = nomeServico;
        this.precoServico = precoServico;
        this.duracaoEstimada = duracaoEstimada;
    }

    public Servicos() {
    }

    public String getDuracaoEstimada() {
        return duracaoEstimada;
    }

    public void setDuracaoEstimada(String duracaoEstimada) {
        this.duracaoEstimada = duracaoEstimada;
    }

    public Double getPrecoServico() {
        return precoServico;
    }

    public void setPrecoServico(Double precoServico) {
        this.precoServico = precoServico;
    }

    public String getNomeServico() {
        return nomeServico;
    }

    public void setNomeServico(String nomeServico) {
        this.nomeServico = nomeServico;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}

