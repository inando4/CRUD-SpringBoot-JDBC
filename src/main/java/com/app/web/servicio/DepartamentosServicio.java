package com.app.web.servicio;
import java.util.List;

import com.app.web.entidad.*;

public interface DepartamentosServicio {
	public List<Departamentos> listarDepartamentos();
	
	public Departamentos guardarDepartamentos(Departamentos departamento);
	
}
