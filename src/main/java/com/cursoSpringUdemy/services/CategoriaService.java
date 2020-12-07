package com.cursoSpringUdemy.services;


import com.cursoSpringUdemy.domain.Categoria;
import com.cursoSpringUdemy.repositories.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategoriaService {
    //operacao capaz de buscar uma categoria por codigo
    @Autowired
    private CategoriaRepository repo;
    public Categoria buscar(Integer id){
        Optional<Categoria> obj= repo.findById(id);
        return obj.orElse(null);


    }

}
