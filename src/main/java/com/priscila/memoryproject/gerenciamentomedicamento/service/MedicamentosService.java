package com.priscila.memoryproject.gerenciamentomedicamento.service;

import com.priscila.memoryproject.gerenciamentomedicamento.exception.ReacaoExistenteException;
import com.priscila.memoryproject.gerenciamentomedicamento.model.Medicamentos;
import com.priscila.memoryproject.gerenciamentomedicamento.repository.MedicamentosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MedicamentosService {
  @Autowired
  private MedicamentosRepository medicamentosRepository;

  /**
   * Método: Incluir.
   */
  public Medicamentos cadastrar(Medicamentos medicamentos) {
    if (medicamentosRepository.existsById(medicamentos.getId())) {
      throw new MedicamentoExistenteException("Medicamento existente!");
    }
    return medicamentosRepository.save(medicamentos);
  }
}
