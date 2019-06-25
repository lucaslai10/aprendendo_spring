package com.udemy.curso.aprendendo.services;

import com.udemy.curso.aprendendo.domain.Categoria;
import com.udemy.curso.aprendendo.repositories.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository repo;

    public Categoria buscar(Integer id){
        Categoria obj = repo.findOne(id);
        return obj;
    }
}
