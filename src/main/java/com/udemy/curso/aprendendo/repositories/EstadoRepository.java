package com.udemy.curso.aprendendo.repositories;

import com.udemy.curso.aprendendo.domain.Estado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstadoRepository extends JpaRepository<Estado, Integer> {
}
