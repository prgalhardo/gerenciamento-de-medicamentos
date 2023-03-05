package com.priscila.memoryproject.gerenciamentomedicamento.controller;

import com.priscila.memoryproject.gerenciamentomedicamento.model.Medicamentos;
import com.priscila.memoryproject.gerenciamentomedicamento.model.ReacoesAdversas;
import com.priscila.memoryproject.gerenciamentomedicamento.service.MedicamentosService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Classe: Medicamentos Controller.
 */

@RestController
@RequestMapping(value = "/medicamentos")
public class MedicamentosController {
  @Autowired
  private MedicamentosService medicamentosService;

/**
 * Método: Incluir.
 */

  @PostMapping
  public Medicamentos cadastrar(@RequestBody @Valid Medicamentos medicamentos) {
    return medicamentosService.cadastrar(medicamentos);
  }

  /**
   * Método: Atualizar.
   */

  @PutMapping
  @Transactional
  public Medicamentos atualizar(@RequestBody Medicamentos medicamentos, @PathVariable("id") Integer id) {
    return medicamentosService.atualizar(medicamentos, id);
  }

  /**
   * Método: Deletar.
   */

  @DeleteMapping(value = "/{id}")
  public void apagar(@PathVariable("id") Integer id) {
    medicamentosService.apagar(id);
  }
}
