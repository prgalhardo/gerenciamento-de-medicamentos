package com.priscila.memoryproject.gerenciamentomedicamento.repository;

import com.priscila.memoryproject.gerenciamentomedicamento.model.Medicamentos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MedicamentosRepository extends JpaRepository<Medicamentos, Integer> {
  @Override
  boolean existsById(Integer integer);
}
