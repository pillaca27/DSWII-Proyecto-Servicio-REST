package com.cibertec.proyecto.entity;


import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "DETALLE_COMPRA")
public class CompraDetalle {

	@EmbeddedId
	private CompraDetallePK compraDetallePK;
	@Column(name = "precio_compra")
	private double precio;
	@Column(name = "cantidad")
	private int cantidad;
	@Column(name = "descuento")
	private double descuento;
	@Column(name = "subtotal")
	private double subtotal;	
	@ManyToOne
	@JoinColumn(name = "cod_bo", nullable = false, insertable = false, updatable = false)
	private Compra compra;

	@ManyToOne
	@JoinColumn(name = "cod_pro", nullable = false, insertable = false, updatable = false)
	private Producto producto;

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public double getDescuento() {
		return descuento;
	}

	public void setDescuento(double descuento) {
		this.descuento = descuento;
	}

	public double getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(double subtotal) {
		this.subtotal = subtotal;
	}

	public Compra getCompra() {
		return compra;
	}

	public void setCompra(Compra compra) {
		this.compra = compra;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public CompraDetallePK getCompraDetallePK() {
		return compraDetallePK;
	}

	public void setCompraDetallePK(CompraDetallePK compraDetallePK) {
		this.compraDetallePK = compraDetallePK;
	}
	
	
	
	
	
	
}
