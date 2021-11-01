package com.cibertec.proyecto.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @author ARTURO CHEA
 *
 */
@Entity
@Table(name="usuario")
public class Usuario {
	@Id
	@Column(name = "cod_usuario")
	private int codUsuario;
	
	@Column(name = "usuario")
	private String usuario;
	
	@Column (name = "contrasena")
	private String password;
	
	@ManyToOne
	@JoinColumn(name = "id_tipo")
	private TipoUsuario tipo;

	public int getCodUsuario() {
		return codUsuario;
	}

	public void setCodUsuario(int codUsuario) {
		this.codUsuario = codUsuario;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public TipoUsuario getTipo() {
		return tipo;
	}

	public void setTipo(TipoUsuario tipo) {
		this.tipo = tipo;
	}

	
	
	

}
