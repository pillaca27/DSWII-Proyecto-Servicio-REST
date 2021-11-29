package com.cibertec.proyecto.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.OneToMany;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureParameter;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * @author ENZO GONZALES
 *
 */
@Entity
@NamedStoredProcedureQuery(name = "Cargo.sp_Generar_Cargo", procedureName = "sp_Generar_Cargo", parameters = {
		  @StoredProcedureParameter(mode = ParameterMode.OUT, name = "p_codigo", type = String.class) })
@Table(name = "cargo")
public class Cargo {

	@Id
	@Column(name = "cod_Cargo")
	private String codCargo;
	@Column(name = "nombre")
	private String nombre;
	
	@JsonIgnore
	@OneToMany(mappedBy = "cargo")
	private List<Empleado> listaEmpleado;

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
