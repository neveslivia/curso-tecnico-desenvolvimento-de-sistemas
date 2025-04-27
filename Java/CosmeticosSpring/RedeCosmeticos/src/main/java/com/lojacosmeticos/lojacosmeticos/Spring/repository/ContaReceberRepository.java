package com.lojacosmeticos.lojacosmeticos.Spring.repository;

import com.lojacosmeticos.lojacosmeticos.Spring.model.Agendamento;
import com.lojacosmeticos.lojacosmeticos.Spring.model.ContaReceber;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContaReceberRepository extends JpaRepository<ContaReceber,Long> {
}
