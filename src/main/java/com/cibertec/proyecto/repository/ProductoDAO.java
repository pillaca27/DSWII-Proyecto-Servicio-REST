package com.cibertec.proyecto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cibertec.proyecto.entity.Producto;

public interface ProductoDAO extends JpaRepository<Producto, String>{

}
