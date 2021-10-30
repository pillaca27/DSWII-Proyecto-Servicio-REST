package com.cibertec.proyecto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cibertec.proyecto.entity.Empleado;
import com.cibertec.proyecto.service.EmpleadoService;

@RestController
@RequestMapping("/empleado")
public class EmpleadoController {

	@Autowired
	private EmpleadoService empleadoService;

	@GetMapping("/listar")
	public List<Empleado> listar() {
		return empleadoService.listAll();
	}

}
