package com.udemy.curso.aprendendo.repositories;

import com.udemy.curso.aprendendo.domain.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
}
