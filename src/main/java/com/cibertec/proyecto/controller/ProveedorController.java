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

import com.cibertec.proyecto.service.ProveedorService;
import com.cibertec.proyecto.entity.Producto;
import com.cibertec.proyecto.entity.Proveedor;

@CrossOrigin(origins = {"*"})
@RestController
@RequestMapping("/proveedor")
public class ProveedorController {
	@Autowired
	private ProveedorService proveedorService;
	
	@GetMapping("/listar")
	public List<Proveedor> listar(){
		return proveedorService.listAll();
	}
	
	@PostMapping("/registrar")
	public void registrar(@RequestBody Proveedor a) {
		proveedorService.registrar(a);
	}
	
	
	
	@DeleteMapping("/eliminar/{id}")

	public void eliminar(@PathVariable String id) {
		proveedorService.eliminar(id);
	}
	
	@GetMapping("/buscar/{codigo}")
	public ResponseEntity<Proveedor> buscar(@PathVariable("codigo") String cod) throws Exception{
		Proveedor bean= proveedorService.buscarPorCodigo(cod);
		if(bean==null)
			throw new Exception("CÃ³digo no existe..");
		
		
		return new ResponseEntity<>(bean,HttpStatus.OK);
	}
	
	@GetMapping("/listar/{nombre}")
	public List<Proveedor> consultacargo(@PathVariable("nombre") String nombre){
		return proveedorService.listNombreLike(nombre);
		//return "empleado/consultaCargo";
	}
	
	
}
