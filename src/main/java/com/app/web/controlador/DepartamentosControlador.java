package com.app.web.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
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
	public String guardarEstudiantes(@ModelAttribute("departamento") Departamentos departamento) {
		servicio.guardarDepartamentos(departamento);
		return "redirect:/departamentos";
	}
	
	@GetMapping("/departamentos/editar/{iddpto}")
	public String mostrarFormularioEditar(@PathVariable Integer iddpto, Model modelo) {
		modelo.addAttribute("departamento", servicio.obtenerDepartamentoPorId(iddpto));
		return "editarDepartamentos";
	}
	
	@PostMapping("/departamentos/{iddpto}")
		public String actualizarDepartamentos(@PathVariable Integer iddpto, @ModelAttribute("departamento") Departamentos departamento, Model modelo ){
		Departamentos departamentoExistente = servicio.obtenerDepartamentoPorId(iddpto);
		departamentoExistente.setIddpto(iddpto);
		departamentoExistente.setNombre(departamento.getNombre());
		departamentoExistente.setTelefono(departamento.getTelefono());
		departamentoExistente.setFax(departamento.getFax());
		
		servicio.actualizarDepartamento(departamentoExistente);
		
		return "redirect:/departamentos";
		}
	
	@GetMapping("/departamentos/{iddpto}")
		public String eliminarDepartamento(@PathVariable Integer iddpto) {
			servicio.eliminarDepartamento(iddpto);
			return "redirect:/departamentos";
		}
	}

