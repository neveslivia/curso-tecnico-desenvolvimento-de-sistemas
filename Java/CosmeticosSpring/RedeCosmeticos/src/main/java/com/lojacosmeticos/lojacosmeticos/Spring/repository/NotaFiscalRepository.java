package com.lojacosmeticos.lojacosmeticos.Spring.repository;

import com.lojacosmeticos.lojacosmeticos.Spring.model.Agendamento;
import com.lojacosmeticos.lojacosmeticos.Spring.model.NotaFiscal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotaFiscalRepository extends JpaRepository<NotaFiscal,Long> {
    boolean existsByNumero(String numero);

}
