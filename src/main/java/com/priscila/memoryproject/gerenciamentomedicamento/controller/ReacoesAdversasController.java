package com.priscila.memoryproject.gerenciamentomedicamento.controller;

import com.priscila.memoryproject.gerenciamentomedicamento.model.ReacoesAdversas;
import com.priscila.memoryproject.gerenciamentomedicamento.service.ReacoesAdversasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Classe: Reações Adversas Controller.
 */

@RestController
@RequestMapping(value = "/reacoesadversas")
public class ReacoesAdversasController {
  @Autowired
  private ReacoesAdversasService reacoesAdversasService;

  /**
   * Método: Listar.
   */

  @GetMapping
  public List<ReacoesAdversas> listar() {
    return reacoesAdversasService.listar();
  }

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

  @PutMapping(path = "{id}")
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
