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
 * @author CRYSTAL PILLACA
 *
 */
@Entity
@NamedStoredProcedureQuery(name = "Producto.actualizacion", procedureName = "actualizacion", parameters = {
		  @StoredProcedureParameter(mode = ParameterMode.IN, name = "cod", type = String.class),
		  @StoredProcedureParameter(mode = ParameterMode.IN, name = "cantidad", type = Integer.class) })
@Table(name = "producto")
public class Producto {

	@Id
	@Column(name = "cod_pro")
	private String codigo;

	@Column(name = "nom_pro")
	private String nombre;

	@Column(name = "precio_venta")
	private double precio;

	@Column(name = "stock")
	private int stock;

	@ManyToOne
	@JoinColumn(name = "cod_mar")
	private Marca marca;

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

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public Marca getMarca() {
		return marca;
	}

	public void setMarca(Marca marca) {
		this.marca = marca;
	}
	
	

}
