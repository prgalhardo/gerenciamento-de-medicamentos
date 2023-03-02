package com.priscila.memoryproject.gerenciamentomedicamento.service;

import com.priscila.memoryproject.gerenciamentomedicamento.repository.ReacoesAdversasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Classe: Reações Adversas.
 */
@Service
public class ReacoesAdversasService {
  @Autowired
  private ReacoesAdversasRepository reacoesAdversasRepository;
}
