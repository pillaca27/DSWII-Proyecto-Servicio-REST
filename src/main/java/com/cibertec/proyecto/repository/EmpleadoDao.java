package com.cibertec.proyecto.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;

import com.cibertec.proyecto.entity.Empleado;

public interface EmpleadoDao extends JpaRepository<Empleado, String>{

	@Query("select e from Empleado e where e.cargo.codCargo=?1")
	public List<Empleado> findEmpleadoByCargo(String codCargo);

	@Procedure(procedureName = "sp_Generar_Empleado")
	public String callGenerarCodigo();

	
}
