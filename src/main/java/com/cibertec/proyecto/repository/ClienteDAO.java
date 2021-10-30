package com.cibertec.proyecto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cibertec.proyecto.entity.Cliente;

public interface ClienteDAO extends JpaRepository<Cliente, String>{

}
