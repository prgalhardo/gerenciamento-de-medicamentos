package com.priscila.memoryproject.gerenciamentomedicamento.controller;

import com.priscila.memoryproject.gerenciamentomedicamento.model.Medicamentos;
import com.priscila.memoryproject.gerenciamentomedicamento.model.ReacoesAdversas;
import com.priscila.memoryproject.gerenciamentomedicamento.service.MedicamentosService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Classe: Medicamentos Controller.
 */

@RestController
@RequestMapping(value = "/medicamentos")
public class MedicamentosController {
  @Autowired
  private MedicamentosService medicamentosService;

  /**
   * Método: Listar.
   */

  @GetMapping
  public List<Medicamentos> listar() {
    return medicamentosService.listar();
  }

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

  @PutMapping(path = "{id}")
  public Medicamentos atualizar(@RequestBody @Valid Medicamentos medicamentos, @PathVariable("id") Integer id) {
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
