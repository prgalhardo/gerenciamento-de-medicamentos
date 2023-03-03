package com.priscila.memoryproject.gerenciamentomedicamento.controller;

import com.priscila.memoryproject.gerenciamentomedicamento.model.Medicamentos;
import com.priscila.memoryproject.gerenciamentomedicamento.service.MedicamentosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

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
  public Medicamentos cadastrar(@RequestBody Medicamentos medicamentos) {
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
}

//
//  /**
//   * Método: Atualizar.
//   */
//
//  @PutMapping
//  @Transactional
//  public ReacoesAdversas atualizar(@RequestBody ReacoesAdversas reacoesAdversas, @PathVariable("id") Integer id) {
//    return reacoesAdversasService.atualizar(reacoesAdversas, id);
//  }
//
//  /**
//   * Método: Deletar.
//   */
//
//  @DeleteMapping(value = "/{id}")
//  public void apagar(@PathVariable("id") Integer id) {
//    reacoesAdversasService.apagar(id);
//  }
//}
