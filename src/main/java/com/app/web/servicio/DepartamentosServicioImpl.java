package com.app.web.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.web.entidad.Departamentos;
import com.app.web.repositorio.DepartamentosRepositorio;

@Service
public class DepartamentosServicioImpl implements DepartamentosServicio {

	@Autowired
	private DepartamentosRepositorio repositorio;
	
	@Override
	public List<Departamentos> listarDepartamentos() {
		return repositorio.findAll();
	}

	@Override
	public Departamentos guardarDepartamentos(Departamentos departamento) {
		return repositorio.save(departamento);
				
				
	}
	
}
