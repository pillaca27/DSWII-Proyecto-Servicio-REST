package com.cibertec.proyecto.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author ANGELO CHOQUE
 *
 */

@Entity
@Table(name = "distrito")
public class Distrito {
	
	@Id
	@Column(name = "codDis")
	private String codigo;
	@Column(name = "nombre")
	private String nombre;

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	
	
}