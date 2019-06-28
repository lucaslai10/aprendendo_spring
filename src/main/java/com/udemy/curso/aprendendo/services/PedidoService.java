package com.udemy.curso.aprendendo.services;

import com.udemy.curso.aprendendo.domain.Pedido;
import com.udemy.curso.aprendendo.repositories.PedidoRepository;
import com.udemy.curso.aprendendo.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PedidoService {

    @Autowired
    private PedidoRepository pedidoRepository;

    public Pedido buscar(Integer id) {
        Pedido obj = pedidoRepository.findOne(id);
        if(obj == null) {
            throw new ObjectNotFoundException("Objeto não encontrado! Id: " + id +
                    ", Tipo: " + Pedido.class.getName());
        }
        return obj;
    }

}
