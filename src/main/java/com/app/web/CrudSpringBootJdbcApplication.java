package com.app.web;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.app.web.entidad.Departamentos;
import com.app.web.repositorio.DepartamentosRepositorio;

@SpringBootApplication
public class CrudSpringBootJdbcApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(CrudSpringBootJdbcApplication.class, args);
	}

	
	@Autowired
	private DepartamentosRepositorio repositorio;
	
	@Override
	public void run(String... args) throws Exception {
		Departamentos departamento1 = new Departamentos("Departamento1", "937352876", "12345");
		repositorio.save(departamento1);
		
		Departamentos departamento2= new Departamentos("Departamento2","999999","982984");
		repositorio.save(departamento2);
	}


}
