package com.priscila.memoryproject.gerenciamentomedicamento.service;

import com.priscila.memoryproject.gerenciamentomedicamento.exception.MedicamentoExistenteException;
import com.priscila.memoryproject.gerenciamentomedicamento.exception.MedicamentoNaoEncontradoException;
import com.priscila.memoryproject.gerenciamentomedicamento.exception.ReacaoNaoEncontradaException;
import com.priscila.memoryproject.gerenciamentomedicamento.model.Medicamentos;
import com.priscila.memoryproject.gerenciamentomedicamento.model.ReacoesAdversas;
import com.priscila.memoryproject.gerenciamentomedicamento.repository.MedicamentosRepository;
import com.priscila.memoryproject.gerenciamentomedicamento.repository.ReacoesAdversasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MedicamentosService {
  @Autowired
  private MedicamentosRepository medicamentosRepository;
  @Autowired
  private ReacoesAdversasRepository reacoesAdversasRepository;

  /**
   * Método: Listar.
   */

  public List<Medicamentos> listar() {
    return medicamentosRepository.findAll();
  }

  /**
   * Método: Incluir.
   */
  public Medicamentos cadastrar(Medicamentos medicamentos) {
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
      if (medicamentos.getReacoesAdversas() != null) {
        obj.setReacoesAdversas(medicamentos.getReacoesAdversas());
      }
      return medicamentosRepository.save(obj);
    }
    return null;
  }

  /**
   * Método: Deletar.
   */

  public void apagar(Integer id) {
    if (medicamentosRepository.existsById(id)) {
      medicamentosRepository.deleteById(id);
    } else {
      throw new MedicamentoNaoEncontradoException("Medicamento não existe!");
    }
  }
}
