package com.lojacosmeticos.lojacosmeticos.Spring.service;

import com.lojacosmeticos.lojacosmeticos.Spring.exception.NotaFiscalBusinessException;
import com.lojacosmeticos.lojacosmeticos.Spring.exception.NotaFiscalNotFoundException;
import com.lojacosmeticos.lojacosmeticos.Spring.model.NotaFiscal;
import com.lojacosmeticos.lojacosmeticos.Spring.repository.NotaFiscalRepository;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class NotaFiscalService {
    private final NotaFiscalRepository notaFiscalRepository;

    public NotaFiscalService(NotaFiscalRepository notaFiscalRepository) {
        this.notaFiscalRepository = notaFiscalRepository;
    }

    public List<NotaFiscal> listarTodas() {
        return notaFiscalRepository.findAll();
    }

    public NotaFiscal buscarPorId(Long id) {
        return notaFiscalRepository.findById(id)
                .orElseThrow(() -> new NotaFiscalNotFoundException("Nota Fiscal com ID " + id + " não encontrada."));
    }

    public NotaFiscal salvar(NotaFiscal notaFiscal) {
        if (notaFiscalRepository.existsByNumero(notaFiscal.getNumero())) {
            throw new NotaFiscalBusinessException("Já existe uma Nota Fiscal com o número informado.");
        }
        if (notaFiscal.getDataEmissao().after(new Date())) {
            throw new NotaFiscalBusinessException("A data de emissão não pode ser futura.");
        }
        if (notaFiscal.getValorTotal() <= 0) {
            throw new NotaFiscalBusinessException("O valor total da Nota Fiscal deve ser maior que zero.");
        }
        return notaFiscalRepository.save(notaFiscal);
    }

    public NotaFiscal atualizar(Long id, NotaFiscal notaFiscalAtualizada) {
        NotaFiscal notaExistente = buscarPorId(id);
        if (!notaExistente.getNumero().equals(notaFiscalAtualizada.getNumero()) &&
                notaFiscalRepository.existsByNumero(notaFiscalAtualizada.getNumero())) {
            throw new NotaFiscalBusinessException("Já existe uma Nota Fiscal com o número informado.");
        }
        if (notaFiscalAtualizada.getDataEmissao().after(new Date())) {
            throw new NotaFiscalBusinessException("A data de emissão não pode ser futura.");
        }
        if (notaFiscalAtualizada.getValorTotal() <= 0) {
            throw new NotaFiscalBusinessException("O valor total da Nota Fiscal deve ser maior que zero.");
        }
        notaFiscalAtualizada.setId(id);
        return notaFiscalRepository.save(notaFiscalAtualizada);
    }

    public void deletar(Long id) {
        NotaFiscal notaFiscal = buscarPorId(id);
        if (!notaFiscal.getStatus().name().equalsIgnoreCase("CANCELADA")) {
            throw new NotaFiscalBusinessException("A nota fiscal só pode ser excluída se estiver com status CANCELADA.");
        }
        notaFiscalRepository.delete(notaFiscal);
    }
}
