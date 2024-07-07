package com.app.web.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.app.web.entidad.Departamentos;
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
	
	@GetMapping("/departamentos/nuevo")
	public String crearDepartamentoFormula(Model modelo) {
		Departamentos departamento = new Departamentos();
		modelo.addAttribute("departamento", departamento);
		return "crearDepartamento";
	}
	
	@PostMapping("/departamentos")
	public String guardarEstudiantes(@ModelAttribute("departamento") Departamentos departamento   ) {
		servicio.guardarDepartamentos(departamento);
		return "redirect:/departamentos";
	}
}
