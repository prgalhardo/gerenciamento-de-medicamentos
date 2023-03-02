package com.priscila.memoryproject.gerenciamentomedicamento.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Entity: Medicamentos.
 */
@Entity
@Table(name = "medicamentos")
public class Medicamentos {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer id;
  private String numeroRegistroAnvisa;
  private String nome;
  private String dataValidade;
  private String telefoneSac;
  private String preco;
  private String quantidadeComprimidos;
  private String fabricante;

  @OneToMany(mappedBy = "medicamentos")
  private List<ReacoesAdversas> reacoesadversas = new ArrayList<>();

}
