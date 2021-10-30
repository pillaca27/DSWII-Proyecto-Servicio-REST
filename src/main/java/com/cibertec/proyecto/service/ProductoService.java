package com.cibertec.proyecto.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cibertec.proyecto.entity.Producto;
import com.cibertec.proyecto.repository.ProductoDAO;

@Service
public class ProductoService {

	@Autowired
	private ProductoDAO productoDAO;
	
	public List<Producto> listAll(){
		return productoDAO.findAll();
	}

	public void registrar(Producto bean) {
		productoDAO.save(bean);
    }

	public void eliminar(String id) {
		productoDAO.deleteById(id);
	}
}