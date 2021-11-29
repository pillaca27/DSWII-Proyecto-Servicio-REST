package com.cibertec.proyecto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;

import com.cibertec.proyecto.entity.Marca;

public interface MarcaDAO extends JpaRepository<Marca, String>{

	@Procedure(procedureName = "sp_Generar_Marca")
	String callGenerarCodigo();

}
