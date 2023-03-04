package com.priscila.memoryproject.gerenciamentomedicamento.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

/**
 * Entity: Reações Adversas.
 */

@Entity
public class ReacoesAdversas {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;
  private String descricao;

  @ManyToOne
  @JoinColumn (name = "medicamento_id")
  private Medicamentos medicamentos;


  public ReacoesAdversas(String descricao) {
    this.descricao = descricao;
  }

  /**
   * Constructor.
   */

  public ReacoesAdversas(Integer id, String descricao, Medicamentos medicamentos) {
    this.id = id;
    this.descricao = descricao;
    this.medicamentos = medicamentos;
  }

  public ReacoesAdversas() {}

  /**
   * Métodos.
   */

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getDescricao() {
    return descricao;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

}
