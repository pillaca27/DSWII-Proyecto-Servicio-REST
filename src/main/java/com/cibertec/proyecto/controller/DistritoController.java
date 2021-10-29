package com.cibertec.proyecto.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cibertec.proyecto.entity.Distrito;
import com.cibertec.proyecto.service.DistritoService;

@RestController
@RequestMapping("/distrito")
public class DistritoController {
	
	@Autowired
	private DistritoService distritoService;
	
	@GetMapping("/listar")
	public List<Distrito> listar(){
		return distritoService.listAll();
	}
	
}
