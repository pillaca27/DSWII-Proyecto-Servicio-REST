package com.cibertec.proyecto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cibertec.proyecto.entity.TipoUsuario;
import com.cibertec.proyecto.service.TipoUsuarioService;

@RestController
@RequestMapping("/tipousuario")
public class TipoUsuarioController {

	@Autowired
	private TipoUsuarioService tipousuarioService;
	
	@GetMapping("/lista")
	public List<TipoUsuario> listar(){
		return tipousuarioService.listAll();
	}
}
