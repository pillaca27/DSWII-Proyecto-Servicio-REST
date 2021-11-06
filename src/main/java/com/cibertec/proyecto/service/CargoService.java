package com.cibertec.proyecto.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cibertec.proyecto.entity.Cargo;
import com.cibertec.proyecto.entity.Cliente;
import com.cibertec.proyecto.repository.CargoDao;

@Service
public class CargoService {
	
	@Autowired
	 private CargoDao cargoDAO;
	
	 public List<Cargo> listAll(){
		 return cargoDAO.findAll();
	 }
		public void registrar(Cargo bean) {
			cargoDAO.save(bean);
		}
		
		public void eliminar(String id) {
			cargoDAO.deleteById(id);
		}
		
		public Cargo buscarPorCodigo(String id) {
			 return cargoDAO.findById(id).orElse(null);

			
		}
		public List<Cargo> listNombreLike(String nombre){
			return cargoDAO.buscaCargoNombre(nombre+"%");
		}

}
