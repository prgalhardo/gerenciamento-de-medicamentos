package com.priscila.memoryproject.gerenciamentomedicamento.service;

import com.priscila.memoryproject.gerenciamentomedicamento.model.Medicamentos;
import com.priscila.memoryproject.gerenciamentomedicamento.model.ReacoesAdversas;
import com.priscila.memoryproject.gerenciamentomedicamento.repository.MedicamentosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

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

  /**
   * Método: Atualizar.
   */

  public Medicamentos atualizar(Medicamentos medicamentos, Integer id) {
    Optional<Medicamentos> medicamentosOptional = medicamentosRepository.findById(id);
    if (medicamentosOptional.isPresent()) {
      Medicamentos obj = medicamentosOptional.get();
      if (medicamentos.getNumeroRegistroAnvisa() != null) {
        obj.setNumeroRegistroAnvisa(medicamentos.getNumeroRegistroAnvisa());
      }
      if (medicamentos.getNome() != null) {
        obj.setNome(medicamentos.getNome());
      }
      if (medicamentos.getDataValidade() != null) {
        obj.setDataValidade(medicamentos.getDataValidade());
      }
      if (medicamentos.getTelefoneSac() != null) {
        obj.setTelefoneSac(medicamentos.getTelefoneSac());
      }
      if (medicamentos.getTelefoneSac() != null) {
        obj.setTelefoneSac(medicamentos.getTelefoneSac());
      }
      if (medicamentos.getPreco() != null) {
        obj.setPreco(medicamentos.getPreco());
      }
      if (medicamentos.getQuantidadeComprimidos() != null) {
        obj.setQuantidadeComprimidos(medicamentos.getQuantidadeComprimidos());
      }
      if (medicamentos.getFabricante() != null) {
        obj.setFabricante(medicamentos.getFabricante());
      }
      return medicamentosRepository.save(medicamentos);
    }
    return null;
  }
}
