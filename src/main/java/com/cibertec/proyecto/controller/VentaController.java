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

import com.cibertec.proyecto.entity.Producto;
import com.cibertec.proyecto.entity.Venta;
import com.cibertec.proyecto.service.VentaService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/venta")
public class VentaController {
	
	@Autowired
	private VentaService ventaService;
	
	@GetMapping("/lista")
	public List<Venta> listado(){
		return ventaService.listadoVenta();
	}
	
	@PostMapping("/registrar")
	public void registrar(@RequestBody Venta bean) {
		ventaService.registrar(bean);
	}
	
	@DeleteMapping("/eliminar/{id}")
	public void eliminar(@PathVariable String id) {
		ventaService.eliminar(id);
	}
	
	@GetMapping("/buscar/{codigo}")
	public ResponseEntity<Venta> buscar(@PathVariable("codigo") String cod) throws Exception{
		Venta bean= ventaService.buscarPorCodigo(cod);
		if(bean==null)
			throw new Exception("CÃ³digo no existe..");
		
		
		return new ResponseEntity<>(bean,HttpStatus.OK);
	}

	@GetMapping("/buscaremp/{cod}")
	public List<Venta> search(@PathVariable("cod") String cod)throws Exception{
		if (ventaService.listaPerDni(cod)==null)

	throw new Exception("Codigo no existe..");
		return ventaService.listaPerDni(cod);


	}
}
