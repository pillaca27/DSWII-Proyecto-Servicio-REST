package com.cibertec.proyecto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cibertec.proyecto.entity.CompraDetalle;

public interface DetalleCompraDAO extends JpaRepository<CompraDetalle, String>{

}
