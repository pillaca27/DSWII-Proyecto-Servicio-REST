package com.cibertec.proyecto.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;

import com.cibertec.proyecto.entity.Empleado;
import com.cibertec.proyecto.entity.Venta;

public interface VentaDAO extends JpaRepository<Venta, String>{

	@Query("select v from Venta v where dni=?1")
	public List<Venta> callPerDni(String cod);
	
	
}
