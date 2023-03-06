package com.priscila.memoryproject.gerenciamentomedicamento.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Classe: Reação Não Encontrada Exception.
 */

@SuppressWarnings("serial")
public class ReacaoNaoEncontradaException extends RuntimeException {
  public ReacaoNaoEncontradaException(String message) {
    super(message);
  }
}
