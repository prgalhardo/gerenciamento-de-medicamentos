package com.priscila.memoryproject.gerenciamentomedicamento.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.ArrayList;
import java.util.List;

/**
 * Entity: Medicamentos.
 */
@Entity
public class Medicamentos {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;
  @NotBlank(message = "Campo não pode estar vazio!")
  @Pattern(regexp = "([0-9].[0-9]{4}.[0-9]{4}.[0-9]{3}.[0-9]{0,1})")
  private String numeroRegistroAnvisa;
  @NotEmpty(message = "Campo não pode estar vazio!")
  private String nome;
  @NotEmpty(message = "Campo não pode estar vazio!")
  @DateTimeFormat
  private String dataValidade;
  @NotEmpty(message = "Campo não pode estar vazio!")
  @Pattern(regexp = "^\\([1-9]{2}\\)(?:[2-8]|9[1-9])[0-9]{3}\\-[0-9]{4}$")
  private String telefoneSac;
  @NotEmpty(message = "Campo não pode estar vazio!")
  @Pattern(regexp = "([0-9]{1,3},[0-9]{2})")
  private String preco;
  @NotEmpty(message = "Campo não pode estar vazio!")
  private String quantidadeComprimidos;
  private String fabricante;

  @OneToMany(mappedBy = "medicamentos", cascade = {CascadeType.ALL})
  private List<ReacoesAdversas> reacoesAdversas = new ArrayList<>();

  public Medicamentos() {}

  /**
   * Métodos.
   */

  public Integer getId() {
    return id;
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

  public List<ReacoesAdversas> getReacoesAdversas() {
    return reacoesAdversas;
  }

  public void setReacoesAdversas(List<ReacoesAdversas> reacoesAdversas) {
    this.reacoesAdversas = reacoesAdversas;
  }
}
