package com.udemy.curso.aprendendo.services;

import com.udemy.curso.aprendendo.domain.Cliente;
import com.udemy.curso.aprendendo.repositories.ClienteRepository;
import com.udemy.curso.aprendendo.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService  {

    @Autowired
    private ClienteRepository clienteRepository;

    public Cliente find(Integer id) {
        Cliente obj = clienteRepository.findOne(id);
        if(obj == null) {
            throw new ObjectNotFoundException("Objeto não encontrado! Id: " + id
                    + ", Tipo: " + Cliente.class.getName());
        }
        return obj;
    }

}
