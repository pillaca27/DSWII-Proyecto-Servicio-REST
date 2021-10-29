package com.cibertec.proyecto.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

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

	
	@JsonIgnore
	@OneToMany(mappedBy = "distrito")
	private List<Cliente> listaDistritos;

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

	public List<Cliente> getListaDistritos() {
		return listaDistritos;
	}

	public void setListaDistritos(List<Cliente> listaDistritos) {
		this.listaDistritos = listaDistritos;
	}


	
	
}