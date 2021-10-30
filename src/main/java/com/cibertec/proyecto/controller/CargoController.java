package com.cibertec.proyecto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cibertec.proyecto.entity.Cargo;
import com.cibertec.proyecto.service.CargoService;

@RestController
@RequestMapping("/cargo")
public class CargoController {

		@Autowired
		private CargoService cargoService;

		@GetMapping("/listar")
		public List<Cargo> listar() {
			return cargoService.listAll();
		}

}
