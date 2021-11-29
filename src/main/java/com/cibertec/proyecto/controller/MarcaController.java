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

import com.cibertec.proyecto.entity.Marca;
import com.cibertec.proyecto.service.MarcaService;

@CrossOrigin(origins = {"*"})

@RestController
@RequestMapping("/marca")
public class MarcaController {

	@Autowired
	private MarcaService marcaService;
	
	@GetMapping("/listar")
	public List<Marca> listar(){
		return marcaService.listAll();
	}
	
	@PostMapping("/registrar")
	public void registrar(@RequestBody Marca bean) {
		String codigogenerado = marcaService.generarcodigo();
		bean.setCodigo(codigogenerado);
		marcaService.registrar(bean);
	}
	
	@DeleteMapping("/eliminar/{id}")
	public void eliminar(@PathVariable String id) {
		marcaService.eliminar(id);
	}
		
	
}
