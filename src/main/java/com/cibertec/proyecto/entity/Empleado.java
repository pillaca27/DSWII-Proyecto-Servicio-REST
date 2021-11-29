package com.cibertec.proyecto.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureParameter;
import javax.persistence.Table;

/**
 * @author ENZO GONZALES
 *
 */

@Entity
@NamedStoredProcedureQuery(name = "Empleado.sp_Generar_Empleado", procedureName = "sp_Generar_Empleado", parameters = {
		  @StoredProcedureParameter(mode = ParameterMode.OUT, name = "p_codigo", type = String.class) })
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
	
	@ManyToOne
	@JoinColumn(name = "codDis")
	private Distrito distrito;

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

	public Distrito getDistrito() {
		return distrito;
	}

	public void setDistrito(Distrito distrito) {
		this.distrito = distrito;
	}

	public Cargo getCargo() {
		return cargo;
	}

	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}
	
	
}
