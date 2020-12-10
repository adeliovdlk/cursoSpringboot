package com.cursoSpringUdemy.repositories;

import com.cursoSpringUdemy.domain.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//categoria Repository e o objeto da camada de acesso a dados


@Repository
public interface CategoriaRepository extends JpaRepository<Categoria ,Long> {


}


