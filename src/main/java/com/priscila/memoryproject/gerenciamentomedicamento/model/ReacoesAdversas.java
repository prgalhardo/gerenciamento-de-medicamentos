package com.priscila.memoryproject.gerenciamentomedicamento.model;

import jakarta.persistence.*;

/**
 * Entity: Reações Adversas.
 */

@Entity
public class ReacoesAdversas {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
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


}
