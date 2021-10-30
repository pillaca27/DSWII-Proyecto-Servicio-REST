package com.cibertec.proyecto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cibertec.proyecto.entity.Usuario;

public interface UsuarioDAO extends JpaRepository<Usuario, String>{

}
