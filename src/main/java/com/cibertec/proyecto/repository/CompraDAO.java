package com.cibertec.proyecto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cibertec.proyecto.entity.Compra;


public interface CompraDAO extends JpaRepository<Compra, String> {

}
