package com.udemy.curso.aprendendo.repositories;

import com.udemy.curso.aprendendo.domain.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnderecoRepository extends JpaRepository<Endereco, Integer> {
}
