package com.app.web.servicio;
import java.util.List;

import com.app.web.entidad.*;

public interface DepartamentosServicio {
	public List<Departamentos> listarDepartamentos();
	
	public Departamentos guardarDepartamentos(Departamentos departamento);
	
	public Departamentos obtenerDepartamentoPorId(Integer iddpto);

	public Departamentos actualizarDepartamento(Departamentos departamento);
	
	public void eliminarDepartamento(Integer iddpto);
	
}
