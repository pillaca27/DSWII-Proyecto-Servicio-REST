package com.cibertec.proyecto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;

import com.cibertec.proyecto.entity.Producto;

public interface ProductoDAO extends JpaRepository<Producto, String>{
	
	@Procedure(procedureName = "actualizacion")
	public void callActualizacion(String cod, Integer cantidad);
	
	@Procedure(procedureName = "actualizacionCompra")
	public void callActualizacionCompra(String cod, Integer cantidad);

}
