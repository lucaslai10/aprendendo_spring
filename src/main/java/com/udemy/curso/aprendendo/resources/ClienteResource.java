package com.udemy.curso.aprendendo.resources;

import com.udemy.curso.aprendendo.domain.Cliente;
import com.udemy.curso.aprendendo.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/clientes")
public class ClienteResource {

    @Autowired
    private ClienteService clienteService;

    @GetMapping(path = "/{id}")
    public ResponseEntity<?> find(@PathVariable Integer id) {
        Cliente obj = clienteService.buscar(id);
        return ResponseEntity.ok().body(obj);
    }

}
