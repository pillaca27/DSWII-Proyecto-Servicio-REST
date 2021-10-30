package com.cibertec.proyecto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cibertec.proyecto.entity.TipoUsuario;

public interface TipoUsuarioDAO extends JpaRepository<TipoUsuario, String>{

}
