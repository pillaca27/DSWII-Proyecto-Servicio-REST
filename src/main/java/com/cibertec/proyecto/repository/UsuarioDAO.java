package com.cibertec.proyecto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cibertec.proyecto.entity.Usuario;

public interface UsuarioDAO extends JpaRepository<Usuario, String>{
	
	@Query("select u from Usuario u where u.usuario=?1")
	public Usuario iniciarSesion(String usuario);

}
