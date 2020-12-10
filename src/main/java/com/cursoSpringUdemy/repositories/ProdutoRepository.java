package com.cursoSpringUdemy.repositories;

import com.cursoSpringUdemy.domain.Categoria;
import com.cursoSpringUdemy.domain.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto,Long> {


}
