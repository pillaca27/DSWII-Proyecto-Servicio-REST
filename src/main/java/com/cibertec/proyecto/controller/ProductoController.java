package com.cibertec.proyecto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cibertec.proyecto.entity.Producto;
import com.cibertec.proyecto.service.ProductoService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/producto")
public class ProductoController {

	@Autowired
	private ProductoService productoService;
	
	@RequestMapping("/lista")
	public List<Producto> listarProductos(){
		return productoService.listAll();
	}
}
