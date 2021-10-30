package com.cibertec.proyecto.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cibertec.proyecto.entity.Cargo;
import com.cibertec.proyecto.repository.CargoDao;

@Service
public class CargoService {
	
	@Autowired
	 private CargoDao cargoDAO;
	
	 public List<Cargo> listAll(){
		 return cargoDAO.findAll();
	 }

}
