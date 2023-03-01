package com.priscila.memoryproject.gerenciamentomedicamento.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/**
 * Entity: Medicamentos.
 */
@Entity
public class Medicamentos {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer id;
  private String numeroRegistroAnvisa;

}
