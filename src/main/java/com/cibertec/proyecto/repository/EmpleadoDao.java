package com.cibertec.proyecto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cibertec.proyecto.entity.Empleado;

public interface EmpleadoDao extends JpaRepository<Empleado, String>{

	
	
}
