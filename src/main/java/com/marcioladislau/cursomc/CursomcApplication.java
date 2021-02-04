package com.marcioladislau.cursomc;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.marcioladislau.cursomc.categories.CategoriaRepository;
import com.marcioladislau.cursomc.domain.Categoria;

@SpringBootApplication
public class CursomcApplication implements CommandLineRunner {
	
	@Autowired
	private CategoriaRepository categoriaRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(CursomcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Categoria cat1 = new Categoria(null,"Industrial");
		Categoria cat2 = new Categoria(null,"Químico");
		categoriaRepository.saveAll(Arrays.asList(cat1,cat2));
		
		
	}

}
