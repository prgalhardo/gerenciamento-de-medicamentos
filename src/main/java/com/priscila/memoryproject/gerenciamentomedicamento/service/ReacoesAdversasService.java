package com.priscila.memoryproject.gerenciamentomedicamento.service;

import com.priscila.memoryproject.gerenciamentomedicamento.model.ReacoesAdversas;
import com.priscila.memoryproject.gerenciamentomedicamento.repository.ReacoesAdversasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * Classe: Reações Adversas.
 */
@Service
public class ReacoesAdversasService {
  @Autowired
  private ReacoesAdversasRepository reacoesAdversasRepository;

  public List<ReacoesAdversas> findAll() {
    return reacoesAdversasRepository.findAll();
  }

  /**
   * Método: Deletar.
   */
  public void deletar(Integer id) {
    if (reacoesAdversasRepository.existsById(id)) {
      reacoesAdversasRepository.deleteById(id);
    } else {
      throw new ReacaoNaoEncontradaException("Reação adversa não existe");
    }
  }
}
