package com.cibertec.proyecto.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cibertec.proyecto.entity.VentaDetalle;

public interface DetalleVentaDAO extends JpaRepository<VentaDetalle, String>{
	
	@Query("select v from VentaDetalle v where v.venta.codigo=?1")
	public List<VentaDetalle> findcodigobyventa(String cod_notaped);

}
