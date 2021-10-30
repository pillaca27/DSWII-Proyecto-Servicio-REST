package com.cibertec.proyecto.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cibertec.proyecto.entity.Compra;

import com.cibertec.proyecto.repository.CompraDAO;

@Service
public class CompraService {
	@Autowired
	 private CompraDAO lisCompraDAO;
	 public List<Compra> listAll(){
		 return lisCompraDAO.findAll();
	 }
	 public void registrar(Compra a) {
		 lisCompraDAO.save(a);
		}
	 
	 
	 public void eliminar(String id) {
		 lisCompraDAO.deleteById(id);
			}
			
}
