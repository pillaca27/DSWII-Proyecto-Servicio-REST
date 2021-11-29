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
import com.cibertec.proyecto.entity.Usuario;
import com.cibertec.proyecto.service.UsuarioService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/usuario")
public class UsuarioController {
	
	@Autowired
	private UsuarioService usuarioService;
	
	@RequestMapping("/lista")
	public List<Usuario> listarUsuario(){
		return usuarioService.listaAll();
	}
	
	@PostMapping("/registrar")
	public void registrar(@RequestBody Usuario bean) {
		usuarioService.registrar(bean);
	}
	
	@DeleteMapping("/eliminar/{id}")
	public void eliminar(@PathVariable int id) {
		usuarioService.eliminar(id);
	}
	
	@RequestMapping("/lista/{nombre}")
	public Usuario listadoUserName(@PathVariable("nombre") String vlogin){
		return usuarioService.iniciaSesion(vlogin);
	}
	
	@GetMapping("/buscar/{codigo}")
	public ResponseEntity<Usuario> buscar(@PathVariable("codigo") int cod) throws Exception{
		Usuario bean= usuarioService.buscarPorCodigo(cod);
		if(bean==null)
			throw new Exception("CÃ³digo no existe..");
		
		
		return new ResponseEntity<>(bean,HttpStatus.OK);
	}
	
}
