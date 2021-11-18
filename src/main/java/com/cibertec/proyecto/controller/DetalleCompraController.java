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

import com.cibertec.proyecto.entity.CompraDetalle;
import com.cibertec.proyecto.service.DetalleCompraService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/compradetalle")

public class DetalleCompraController {
	@Autowired
	private DetalleCompraService compraService;
	
	@GetMapping("/lista")
	public List<CompraDetalle> listado(){
		return compraService.listadoCompra();
	}
	
	@PostMapping("/registrar")
	public void registrar(@RequestBody CompraDetalle bean) {
		compraService.registrar(bean);
	}
	
	@DeleteMapping("/eliminar/{id}")
	public void eliminar(@PathVariable String id) {
		compraService.eliminar(id);
	}
}



