package com.cursoSpringUdemy;

import com.cursoSpringUdemy.domain.Categoria;
import com.cursoSpringUdemy.domain.Produto;
import com.cursoSpringUdemy.repositories.CategoriaRepository;
import com.cursoSpringUdemy.repositories.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class SpringbootApplication implements CommandLineRunner {
	@Autowired
	private CategoriaRepository categoriaRepository;
	@Autowired
	private ProdutoRepository produtoRepository;


	public static void main(String[] args) {
		SpringApplication.run(SpringbootApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Categoria cat1 = new Categoria(null, "informatica");
		Categoria cat2 = new Categoria( null, "Escritorio");
		//instanciando os produtos
		Produto p1= new Produto(null,"Computador",2000.00);
		Produto p2= new Produto(null,"Impressora",800.00);
		Produto p3= new Produto(null,"Mouse",80.00);
		//associacoes
		cat1.getProdutos().addAll(Arrays.asList(p1,p2,p3)); //produtos associados com cat1
		cat2.getProdutos().addAll(Arrays.asList(p2));       //produtos associados com cat2
//associacoes
		p1.getCategorias().addAll(Arrays.asList(cat1));
		p2.getCategorias().addAll(Arrays.asList(cat1, cat2));
		p3.getCategorias().addAll(Arrays.asList(cat1));



		categoriaRepository.saveAll(Arrays.asList(cat1,cat2));
		produtoRepository.saveAll(Arrays.asList(p1,p2,p3));
	}
}
