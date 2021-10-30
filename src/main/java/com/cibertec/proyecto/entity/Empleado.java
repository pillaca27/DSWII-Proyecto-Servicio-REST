package com.cibertec.proyecto.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @author ENZO GONZALES
 *
 */

@Entity
@Table(name = "empleado")
public class Empleado {
	
	@Id
	@Column(name = "codEmp")
	private String codEmp;
	@Column(name = "nombre")
	private String nombre;
	@Column(name = "dni")
	private String dni;
	@Column(name = "telefono")
	private String telefono;
	@Column(name = "direccion")
	private String direccion;
	@Column(name = "cod_Dis")
	private String codDis;

	@ManyToOne
	@JoinColumn(name = "cod_cargo")
	private Cargo cargo;

	public String getCodEmp() {
		return codEmp;
	}

	public void setCodEmp(String codEmp) {
		this.codEmp = codEmp;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getCodDis() {
		return codDis;
	}

	public void setCodDis(String codDis) {
		this.codDis = codDis;
	}

	public Cargo getCargo() {
		return cargo;
	}

	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}
	
	
}
