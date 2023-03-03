package com.priscila.memoryproject.gerenciamentomedicamento.exception;

/**
 * Classe: Reação Não Encontrada Exception.
 */

@SuppressWarnings("serial")
public class ReacaoNaoEncontradaException extends RuntimeException {
  public ReacaoNaoEncontradaException(String message) {
    super(message);
  }
}
