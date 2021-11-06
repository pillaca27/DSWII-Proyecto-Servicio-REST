package com.cibertec.proyecto.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cibertec.proyecto.entity.Cargo;
import com.cibertec.proyecto.service.CargoService;
@CrossOrigin(origins = {"*"})

@RestController
@RequestMapping("/cargo")
public class CargoController {

		@Autowired
		private CargoService cargoService;

		@GetMapping("/listar")
		public List<Cargo> listar() {
			return cargoService.listAll();
		}
		
		@PostMapping("/registrar")
		public void registrar(@RequestBody Cargo bean) {
			cargoService.registrar(bean);
		}
		@DeleteMapping("/eliminar/{id}")
		public void eliminar(@PathVariable String id) {
			cargoService.eliminar(id);
		}
		
		@PutMapping("/actualizar")
		public void actualizar(@RequestBody Cargo car) throws Exception {
			Cargo bean;
			bean=cargoService.buscarPorCodigo(car.getCodCargo());
			if(bean==null)
				throw new Exception("CÃ³digo no existe..");
			else
				cargoService.registrar(car);
			
		}
		@GetMapping("/buscar/{codigo}")
		public void buscar(@PathVariable("codigo") String cod) throws Exception{
			Cargo bean=cargoService.buscarPorCodigo(cod);
			if(bean==null)
				throw new Exception("CÃ³digo no existe..");
			
			
		}
		
		@RequestMapping("/consultaCargo/{nombre}")
		public List<Cargo> consultacargo(@PathVariable("nombre") String nombre){
			return cargoService.listNombreLike(nombre);
			//return "empleado/consultaCargo";
		}
		
}
