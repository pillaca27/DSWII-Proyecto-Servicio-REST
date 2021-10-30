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

import com.cibertec.proyecto.service.CompraService;

import com.cibertec.proyecto.entity.Compra;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/compra")
public class CompraController {
	@Autowired
	private CompraService compraService;
	
	@GetMapping("/listar")
	public List<Compra> listar(){
		return compraService.listAll();
	}
	
	@PostMapping("/registrar")
	public void registrar(@RequestBody Compra a) {
		compraService.registrar(a);
	}
	
	@DeleteMapping("/eliminar/{id}")

	public void eliminar(@PathVariable String id) {
		compraService.eliminar(id);
	}
	
}
