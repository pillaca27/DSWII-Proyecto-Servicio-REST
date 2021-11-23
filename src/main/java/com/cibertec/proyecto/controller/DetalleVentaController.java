package com.cibertec.proyecto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cibertec.proyecto.entity.Venta;
import com.cibertec.proyecto.entity.VentaDetalle;
import com.cibertec.proyecto.service.DetalleVentaService;
import com.cibertec.proyecto.service.VentaService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/ventadetalle")

public class DetalleVentaController {
	@Autowired
	private DetalleVentaService detalleventaService;
	
	@GetMapping("/lista")
	public List<VentaDetalle> listado(){
		return detalleventaService.listadoVenta();
	}
	
	@PostMapping("/registrar")
	public void registrar(@RequestBody VentaDetalle bean) {
		detalleventaService.registrar(bean);
	}
	
	@DeleteMapping("/eliminar/{id}")
	public void eliminar(@PathVariable String id) {
		detalleventaService.eliminar(id);
	}
	
	@GetMapping("/buscar/{codigo}")
	public List<VentaDetalle> buscar(@PathVariable("codigo") String cod) throws Exception{
		return detalleventaService.buscarPorCodnotaped(cod);
	}
}
