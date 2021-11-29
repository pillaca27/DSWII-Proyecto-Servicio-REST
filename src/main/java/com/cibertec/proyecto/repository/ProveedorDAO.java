package com.cibertec.proyecto.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cibertec.proyecto.entity.Proveedor;

public interface ProveedorDAO extends JpaRepository<Proveedor, String> {

	@Query("select p from Proveedor p where p.nombre like ?1") 
	List<Proveedor> buscaProveedorNombre(String string);

}
