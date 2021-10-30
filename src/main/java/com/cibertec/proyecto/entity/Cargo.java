package com.cibertec.proyecto.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author ENZO GONZALES
 *
 */
@Entity
@Table(name = "cargo")
public class Cargo {

	@Id
	@Column(name = "cod_Cargo")
	private String codCargo;
	@Column(name = "nombre")
	private String nombre;
	
//	@JsonIgnore
//	@OneToMany(mappedBy = "cargo")
//	private List<Empleado> listaEmpleado;

	public String getCodCargo() {
		return codCargo;
	}

	public void setCodCargo(String codCargo) {
		this.codCargo = codCargo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
	
}
