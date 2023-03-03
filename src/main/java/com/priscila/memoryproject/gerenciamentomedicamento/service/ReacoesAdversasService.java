package com.priscila.memoryproject.gerenciamentomedicamento.service;

import com.priscila.memoryproject.gerenciamentomedicamento.exception.ReacaoNaoEncontradaException;
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

/**
 * Método: Incluir
 */

public ReacoesAdversas cadastrar(ReacoesAdversas reacoesAdversas) {
  if (reacoesAdversasRepository.existsById(reacoesAdversas.getId())) {
    throw new ReacaoExistenteException("Reação adversa existente!");
  }
  return reacoesAdversasRepository.save(reacoesAdversas);
}

//public Serie save(Serie serie) {
//  if (serieRepository.existsByNome(serie.getNome())) {
//    throw new SerieExistenteException("Série Existente");
//  }
//  return serieRepository.save(serie);
//}

  /**
   * Método: Deletar.
   */
  public void deletar(Integer id) {
    if (reacoesAdversasRepository.existsById(id)) {
      reacoesAdversasRepository.deleteById(id);
    } else {
      throw new ReacaoNaoEncontradaException("Reação adversa não existe!");
    }
  }
