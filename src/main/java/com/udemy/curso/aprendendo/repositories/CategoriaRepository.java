package com.udemy.curso.aprendendo.repositories;

import com.udemy.curso.aprendendo.domain.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {



}
