package com.priscila.memoryproject.gerenciamentomedicamento.controller;

import com.priscila.memoryproject.gerenciamentomedicamento.model.ReacoesAdversas;
import com.priscila.memoryproject.gerenciamentomedicamento.service.ReacoesAdversasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

/**
 * Classe: Reações Adversas Controller.
 */

@RestController
@RequestMapping(value = "/reacoesadversas")
public class ReacoesAdversasController {
  @Autowired
  private ReacoesAdversasService reacoesAdversasService;

  /**
   * Método: Incluir.
   */

  @PostMapping
  public ReacoesAdversas cadastrar(@RequestBody ReacoesAdversas reacoesAdversas) {
    return reacoesAdversasService.cadastrar(reacoesAdversas);
  }

  /**
   * Método: Atualizar.
   */

  @PutMapping
  @Transactional
  public ReacoesAdversas atualizar(@RequestBody ReacoesAdversas reacoesAdversas, @PathVariable("id") Integer id) {
    return reacoesAdversasService.atualizar(reacoesAdversas, id);
  }

  /**
   * Método: Deletar.
   */

  @DeleteMapping(value = "/{id}")
  public void apagar(@PathVariable("id") Integer id) {
    reacoesAdversasService.apagar(id);
  }
}


//
//  @DeleteMapping(value = "/{id}")
//  public void delete(@PathVariable("id") Integer id) {
//    minhasSeriesService.delete(id);
//  }
