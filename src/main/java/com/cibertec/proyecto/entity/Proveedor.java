package com.cibertec.proyecto.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "proveedor")
public class Proveedor {

	@Id
	@Column(name = "ruc")
	private String RUC;
	@Column(name = "nombre")
	private String NOMBRE;
	@Column(name = "nombre_contacto")
	private String Nombre_CONT;
	@Column(name = "telefono_contacto")
	private String Nombre_TEL;
	@Column(name = "direccion")
	private String Direccion;
	
	@ManyToOne
	@JoinColumn(name = "codDis")
	private Distrito distrito;

	public String getRUC() {
		return RUC;
	}

	public void setRUC(String rUC) {
		RUC = rUC;
	}

	public String getNOMBRE() {
		return NOMBRE;
	}

	public void setNOMBRE(String nOMBRE) {
		NOMBRE = nOMBRE;
	}

	public String getNombre_CONT() {
		return Nombre_CONT;
	}

	public void setNombre_CONT(String nombre_CONT) {
		Nombre_CONT = nombre_CONT;
	}

	public String getNombre_TEL() {
		return Nombre_TEL;
	}

	public void setNombre_TEL(String nombre_TEL) {
		Nombre_TEL = nombre_TEL;
	}

	public String getDireccion() {
		return Direccion;
	}

	public void setDireccion(String direccion) {
		Direccion = direccion;
	}

	public Distrito getDistrito() {
		return distrito;
	}

	public void setDistrito(Distrito distrito) {
		this.distrito = distrito;
	}
	
	
	
	
	
	
}
