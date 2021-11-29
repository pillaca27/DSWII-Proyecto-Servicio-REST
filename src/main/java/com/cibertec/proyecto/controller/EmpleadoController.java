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
		String codigogenerado = empleadoService.generarcodigo();
		bean.setCodEmp(codigogenerado);
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
	
	@GetMapping("/buscar/{codigo}")
	public ResponseEntity<Empleado> buscar(@PathVariable("codigo") String cod) throws Exception{
		Empleado bean= empleadoService.buscarPorCodigo(cod);
		if(bean==null)
			throw new Exception("CÃ³digo no existe..");
		
		
		return new ResponseEntity<>(bean,HttpStatus.OK);
	}
	
	@GetMapping("/listar/{nombre}")
	public List<Empleado> consultacargo(@PathVariable("nombre") String nombre){
		return empleadoService.listNombreLike(nombre);
		//return "empleado/consultaCargo";
	}

}
