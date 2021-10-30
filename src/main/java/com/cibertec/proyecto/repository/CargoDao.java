package com.cibertec.proyecto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cibertec.proyecto.entity.Cargo;

public interface CargoDao extends JpaRepository<Cargo, String>{

}
