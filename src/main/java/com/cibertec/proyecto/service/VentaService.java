package com.cibertec.proyecto.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cibertec.proyecto.entity.Producto;
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

	public Venta buscarPorCodigo(String cod) {
		return ventaDAO.findById(cod).orElse(null);
	}
	public List<Venta> listaPerDni(String cod){
		return ventaDAO.callPerDni(cod);
	}

	public String generarcodigo() {
		return ventaDAO.callGenerarCodigo();
	}
}
