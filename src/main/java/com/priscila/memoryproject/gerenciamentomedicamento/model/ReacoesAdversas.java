package com.priscila.memoryproject.gerenciamentomedicamento.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/**
 * Entity: Reações Adversas.
 */

@Entity
public class ReacoesAdversas {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer id;
  private String descricao;
}
