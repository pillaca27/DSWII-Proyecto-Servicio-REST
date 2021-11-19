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

import com.cibertec.proyecto.entity.Empleado;
import com.cibertec.proyecto.entity.Producto;
import com.cibertec.proyecto.service.ProductoService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/producto")
public class ProductoController {

	@Autowired
	private ProductoService productoService;
	
	@RequestMapping("/listar")
	public List<Producto> listarProductos(){
		return productoService.listAll();
	}
	
	@PostMapping("/registrar")
	public void registrar(@RequestBody Producto bean) {
		productoService.registrar(bean);
	}
	
	@PostMapping("/actualizastock/{cod}/{cantidad}")
	public void actualizastock(@PathVariable String cod, @PathVariable Integer cantidad) {
		productoService.actualizastock(cod, cantidad);
	}
	
	@PostMapping("/actualizastockCompra/{cod}/{cantidad}")
	public void actualizastockCompra(@PathVariable String cod, @PathVariable Integer cantidad) {
		productoService.actualizastockCompra(cod, cantidad);
	}
	
	@DeleteMapping("/eliminar/{id}")
	public void eliminar(@PathVariable String id) {
		productoService.eliminar(id);
	}
	

	@GetMapping("/buscar/{codigo}")
	public ResponseEntity<Producto> buscar(@PathVariable("codigo") String cod) throws Exception{
		Producto bean= productoService.buscarPorCodigo(cod);
		if(bean==null)
			throw new Exception("CÃ³digo no existe..");
		
		
		return new ResponseEntity<>(bean,HttpStatus.OK);
	}
	
}
