package com.app.web.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.app.web.entidad.*;

@Repository
public interface DepartamentosRepositorio extends JpaRepository<Departamentos, Integer> {
	
}
