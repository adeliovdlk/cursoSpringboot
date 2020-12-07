package com.cursoSpringUdemy.repositories;

import com.cursoSpringUdemy.domain.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.criteria.CriteriaBuilder;

//categoria Repository e o objeto da camada de acesso a dados

@RestController
public interface CategoriaRepository extends JpaRepository<Categoria ,Integer> {


}


