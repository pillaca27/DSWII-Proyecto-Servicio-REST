package com.cibertec.proyecto.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cibertec.proyecto.entity.VentaDetalle;
import com.cibertec.proyecto.repository.DetalleVentaDAO;

@Service

public class DetalleVentaService {
	@Autowired
	private DetalleVentaDAO ventaDAO;
	
	public List<VentaDetalle> listadoVenta(){
		return ventaDAO.findAll();
	}

	public void registrar(VentaDetalle bean) {
		ventaDAO.save(bean);
	}

	public void eliminar(String id) {
		ventaDAO.deleteById(id);
	}
	
	
	
	
	
	
}
