package com.cibertec.proyecto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

}
