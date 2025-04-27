package com.lojacosmeticos.lojacosmeticos.Spring.repository;

import com.lojacosmeticos.lojacosmeticos.Spring.model.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FuncionarioRepository extends JpaRepository<Funcionario,Long> {
    boolean existsByCpf(String cpf);

}
