package com.cibertec.proyecto.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * @author CRYSTAL PILLACA
 *
 */

@Entity
@Table(name = "marca")
public class Marca {

	@Id
	@Column(name = "cod_mar")
	private String codigo;
	@Column(name = "nom_mar")
	private String nombre;

	@JsonIgnore
	@OneToMany(mappedBy = "marca")
	private List<Producto> listaProducto;

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

	public List<Producto> getListaProducto() {
		return listaProducto;
	}

	public void setListaProducto(List<Producto> listaProducto) {
		this.listaProducto = listaProducto;
	}

}
