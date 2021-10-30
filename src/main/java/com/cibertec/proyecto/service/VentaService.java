package com.cibertec.proyecto.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cibertec.proyecto.entity.Venta;
import com.cibertec.proyecto.repository.VentaDAO;

@Service
public class VentaService {
	
	@Autowired
	private VentaDAO ventaDAO;
	
	public List<Venta> listadoVenta(){
		return ventaDAO.findAll();
	}

	public void registrar(Venta bean) {
		ventaDAO.save(bean);
	}

	public void eliminar(String id) {
		ventaDAO.deleteById(id);
	}

}
