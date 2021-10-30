package com.cibertec.proyecto.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * @author ARTURO CHEA
 *
 */

@Entity
@Table(name="tipo_usuario")
public class TipoUsuario {
	@Id
	@Column(name="id_tipo")
	private String codigo;
	@Column(name="nombre")
	private String nombre;
	
	@JsonIgnore
	@OneToMany(mappedBy = "tipo")
	private List<Usuario> listaUsuario;

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

	public List<Usuario> getListaUsuario() {
		return listaUsuario;
	}

	public void setListaUsuario(List<Usuario> listaUsuario) {
		this.listaUsuario = listaUsuario;
	}
	
	

}
