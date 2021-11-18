package com.cibertec.proyecto.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cibertec.proyecto.entity.CompraDetalle;
import com.cibertec.proyecto.repository.DetalleCompraDAO;

@Service
public class DetalleCompraService {
	@Autowired
	private DetalleCompraDAO compraDAO;
	
	public List<CompraDetalle> listadoCompra(){
		return compraDAO.findAll();
	}

	public void registrar(CompraDetalle bean) {
		compraDAO.save(bean);
	}

	public void eliminar(String id) {
		compraDAO.deleteById(id);
	}
}
