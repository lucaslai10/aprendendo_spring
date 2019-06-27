package com.udemy.curso.aprendendo.repositories;

import com.udemy.curso.aprendendo.domain.ItemPedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemPedidoRepository extends JpaRepository<ItemPedido, Integer> {
}
