package com.cibertec.proyecto.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cibertec.proyecto.entity.Marca;
import com.cibertec.proyecto.repository.MarcaDAO;

@Service
public class MarcaService {

	@Autowired
	 private MarcaDAO marcaDAO;
	
	 public List<Marca> listAll(){
		 return marcaDAO.findAll();
	 }
}
