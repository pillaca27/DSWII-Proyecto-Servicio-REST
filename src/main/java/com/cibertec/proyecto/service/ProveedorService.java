package com.cibertec.proyecto.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cibertec.proyecto.entity.Marca;
import com.cibertec.proyecto.entity.Proveedor;
import com.cibertec.proyecto.repository.ProveedorDAO;

@Service
public class ProveedorService {
	@Autowired
	private ProveedorDAO lisProveedorDAO;
	
	public List<Proveedor> listAll(){
		 return lisProveedorDAO.findAll();
	 }
	public void registrar(Proveedor a) {
			lisProveedorDAO.save(a);
		}
	 
	 
	public void eliminar(String id) {
			lisProveedorDAO.deleteById(id);
	}
	
	public Proveedor buscarPorCodigo(String cod) {
		return lisProveedorDAO.findById(cod).orElse(null);
	}
	
}
