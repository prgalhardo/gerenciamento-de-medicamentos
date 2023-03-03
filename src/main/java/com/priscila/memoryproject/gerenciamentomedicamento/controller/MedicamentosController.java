package com.priscila.memoryproject.gerenciamentomedicamento.controller;

import com.priscila.memoryproject.gerenciamentomedicamento.model.Medicamentos;
import com.priscila.memoryproject.gerenciamentomedicamento.service.MedicamentosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
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
  public Medicamentos cadastrar(@RequestBody Medicamentos medicamentos) {
    return medicamentosService.cadastrar(medicamentos);
  }
}

//@RestController
//@RequestMapping(value = "/reacoesadversas")
//public class ReacoesAdversasController {
//  @Autowired
//  private ReacoesAdversasService reacoesAdversasService;
//
//  /**
//   * Método: Incluir.
//   */
//
//  @PostMapping
//  public ReacoesAdversas cadastrar(@RequestBody ReacoesAdversas reacoesAdversas) {
//    return reacoesAdversasService.cadastrar(reacoesAdversas);
//  }
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
