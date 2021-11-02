package com.cibertec.proyecto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cibertec.proyecto.entity.Empleado;
import com.cibertec.proyecto.service.EmpleadoService;

@CrossOrigin(origins = {"*"})

@RestController
@RequestMapping("/empleado")
public class EmpleadoController {

	@Autowired
	private EmpleadoService empleadoService;

	@GetMapping("/listar")
	public List<Empleado> listar() {
		return empleadoService.listAll();
	}
	
	@PostMapping("/registrar")
	public void registrar(@RequestBody Empleado bean) {
		empleadoService.registrar(bean);
	}
	
	@DeleteMapping("/eliminar/{id}")
	public void eliminar(@PathVariable String id) {
		empleadoService.eliminar(id);
	}
	@GetMapping("/consultaEmpleado/{codCargo}")
	public List<Empleado> consulta(@PathVariable("codCargo") String nom){
		return empleadoService.buscarEmpleadosPorCargo(nom);
	}

}
