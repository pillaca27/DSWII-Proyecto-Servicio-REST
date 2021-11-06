package com.cibertec.proyecto.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cibertec.proyecto.entity.Distrito;
import com.cibertec.proyecto.repository.DistritoDAO;

@Service
public class DistritoService {
	 @Autowired
	 private DistritoDAO distritoDAO;
	
	 public List<Distrito> listAll(){
		 return distritoDAO.findAll();
	 }
	 
	 
}
