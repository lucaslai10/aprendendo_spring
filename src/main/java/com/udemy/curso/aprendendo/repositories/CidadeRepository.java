package com.udemy.curso.aprendendo.repositories;

import com.udemy.curso.aprendendo.domain.Cidade;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CidadeRepository extends JpaRepository<Cidade, Integer> {


}
