package com.cibertec.proyecto.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cibertec.proyecto.entity.Cliente;

public interface ClienteDAO extends JpaRepository<Cliente, String>{
	
	
	@Query("select p from Cliente p where p.nombre like ?1") 
	public List<Cliente> findByClienteLike(String nombre);

	@Query("select c from Cliente c where c.distrito.codigo=?1")
	public List<Cliente> findClienteByDistrito(String codDis);

}
