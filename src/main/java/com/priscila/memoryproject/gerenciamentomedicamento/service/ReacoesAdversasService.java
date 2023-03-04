package com.priscila.memoryproject.gerenciamentomedicamento.service;

import com.priscila.memoryproject.gerenciamentomedicamento.exception.ReacaoExistenteException;
import com.priscila.memoryproject.gerenciamentomedicamento.exception.ReacaoNaoEncontradaException;
import com.priscila.memoryproject.gerenciamentomedicamento.model.ReacoesAdversas;
import com.priscila.memoryproject.gerenciamentomedicamento.repository.ReacoesAdversasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Classe: Reações Adversas.
 */

@Service
public class ReacoesAdversasService {
  @Autowired
  private ReacoesAdversasRepository reacoesAdversasRepository;

  /**
   * Método: Listar.
   */

  public List<ReacoesAdversas> listar() {
    return reacoesAdversasRepository.findAll();
  }

  /**
   * Método: Incluir.
   */

  public ReacoesAdversas cadastrar(ReacoesAdversas reacoesAdversas) {
    if (reacoesAdversasRepository.existsById(reacoesAdversas.getId())) {
      throw new ReacaoExistenteException("Reação adversa existente!");
    }
    return reacoesAdversasRepository.save(reacoesAdversas);
  }

  /**
   * Método: Atualizar.
   */

  public ReacoesAdversas atualizar(ReacoesAdversas reacoesAdversas, Integer id) {
    Optional<ReacoesAdversas> reacoes = reacoesAdversasRepository.findById(id);
    if (reacoes.isPresent()) {
      ReacoesAdversas obj = reacoes.get();
      if (reacoesAdversas.getDescricao() != null) {
        obj.setDescricao(reacoesAdversas.getDescricao());
      }
      return reacoesAdversasRepository.save(reacoesAdversas);
    }
    return null;
  }

  /**
   * Método: Deletar.
   */

  public void apagar(Integer id) {
    if (reacoesAdversasRepository.existsById(id)) {
      reacoesAdversasRepository.deleteById(id);
    } else {
      throw new ReacaoNaoEncontradaException("Reação adversa não existe!");
    }
  }
}
