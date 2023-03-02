package com.priscila.memoryproject.gerenciamentomedicamento.repository;

import com.priscila.memoryproject.gerenciamentomedicamento.model.ReacoesAdversas;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReacoesAdversasRepository extends JpaRepository<ReacoesAdversas, Integer> {
  @Override
  boolean existsById(Integer integer);
}
