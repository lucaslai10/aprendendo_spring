package com.udemy.curso.aprendendo.repositories;

import com.udemy.curso.aprendendo.domain.Pagamento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PagamentoRepository extends JpaRepository<Pagamento, Integer> {
}
