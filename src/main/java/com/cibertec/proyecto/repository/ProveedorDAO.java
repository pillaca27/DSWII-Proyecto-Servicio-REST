package com.cibertec.proyecto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cibertec.proyecto.entity.Proveedor;

public interface ProveedorDAO extends JpaRepository<Proveedor, String> {

}
