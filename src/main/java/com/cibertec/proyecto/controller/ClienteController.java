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

import com.cibertec.proyecto.entity.Cliente;
import com.cibertec.proyecto.entity.Empleado;
import com.cibertec.proyecto.entity.Producto;
import com.cibertec.proyecto.service.ClienteService;

@CrossOrigin(origins = {"*"})
@RestController
@RequestMapping("/cliente")
public class ClienteController {
	@Autowired
	private ClienteService clienteService;
	
	@GetMapping("/listar")
	public List<Cliente> listar(){
		return clienteService.listAll();
	}
	//http://localhost:8091/cliente/consulta/e
	@GetMapping("/consulta/{nombre}")
	public List<Cliente> consulta(@PathVariable("nombre") String nombre){
		return clienteService.listarClientes(nombre);
	}

	@PostMapping("/registrar")
	public void registrar(@RequestBody Cliente bean) {
		clienteService.registrar(bean);
	}
	@DeleteMapping("/eliminar/{id}")
	public void eliminar(@PathVariable String id) {
		clienteService.eliminar(id);
	}
	
	@GetMapping("/consultaCliente/{codDis}")
	public List<Cliente> consultaPorDistrito(@PathVariable("codDis") String cod){
		return clienteService.buscarClientesPorDistrito(cod);
	}
	
	@GetMapping("/buscar/{codigo}")
	public ResponseEntity<Cliente> buscar(@PathVariable("codigo") String cod) throws Exception{
		Cliente bean= clienteService.buscarPorCodigo(cod);
		if(bean==null)
			throw new Exception("CÃ³digo no existe..");
		
		
		return new ResponseEntity<>(bean,HttpStatus.OK);
	}
	
	@GetMapping("/listar/{nombre}")
	public List<Cliente> consultacargo(@PathVariable("nombre") String nombre){
		return clienteService.listNombreLike(nombre);
		//return "empleado/consultaCargo";
	}
}
