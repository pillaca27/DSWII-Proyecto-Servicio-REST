package com.cibertec.proyecto.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cibertec.proyecto.entity.Cargo;

public interface CargoDao extends JpaRepository<Cargo, String>{

	@Query("select c from Cargo c where c.nombre like ?1") 
	public List<Cargo> buscaCargoNombre(String nombre);

}
