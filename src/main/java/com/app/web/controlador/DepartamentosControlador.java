package com.app.web.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.app.web.servicio.DepartamentosServicio;

@Controller
public class DepartamentosControlador {
	@Autowired
	private DepartamentosServicio servicio;
	
	@GetMapping({"/departamentos","/"})
	public String listarDepartamentos(Model modelo) {
		modelo.addAttribute("departamentos", servicio.listarDepartamentos());
		return "departamentos"; //nos retorna al archivo estudiantes
	}
}
