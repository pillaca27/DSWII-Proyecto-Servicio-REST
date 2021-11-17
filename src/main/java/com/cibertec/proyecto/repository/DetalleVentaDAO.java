package com.cibertec.proyecto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cibertec.proyecto.entity.VentaDetalle;

public interface DetalleVentaDAO extends JpaRepository<VentaDetalle, String>{

}
