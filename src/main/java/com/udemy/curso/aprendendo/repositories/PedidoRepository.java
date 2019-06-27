package com.udemy.curso.aprendendo.repositories;

import com.udemy.curso.aprendendo.domain.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<Pedido, Integer> {
}
