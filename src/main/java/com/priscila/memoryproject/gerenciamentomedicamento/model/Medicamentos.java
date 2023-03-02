package com.priscila.memoryproject.gerenciamentomedicamento.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
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

  public Medicamentos() {}

  /**
   * Métodos.
   */

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getNumeroRegistroAnvisa() {
    return numeroRegistroAnvisa;
  }

  public void setNumeroRegistroAnvisa(String numeroRegistroAnvisa) {
    this.numeroRegistroAnvisa = numeroRegistroAnvisa;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getDataValidade() {
    return dataValidade;
  }

  public void setDataValidade(String dataValidade) {
    this.dataValidade = dataValidade;
  }

  public String getTelefoneSac() {
    return telefoneSac;
  }

  public void setTelefoneSac(String telefoneSac) {
    this.telefoneSac = telefoneSac;
  }

  public String getPreco() {
    return preco;
  }

  public void setPreco(String preco) {
    this.preco = preco;
  }

  public String getQuantidadeComprimidos() {
    return quantidadeComprimidos;
  }

  public void setQuantidadeComprimidos(String quantidadeComprimidos) {
    this.quantidadeComprimidos = quantidadeComprimidos;
  }

  public String getFabricante() {
    return fabricante;
  }

  public void setFabricante(String fabricante) {
    this.fabricante = fabricante;
  }

  public List<ReacoesAdversas> getReacoesadversas() {
    return reacoesadversas;
  }

  public void setReacoesadversas(List<ReacoesAdversas> reacoesadversas) {
    this.reacoesadversas = reacoesadversas;
  }
}
