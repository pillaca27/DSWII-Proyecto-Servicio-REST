package com.cibertec.proyecto.entity;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "DETALLE_VENTA")
public class VentaDetalle {
@EmbeddedId
private VentaDetallePK	ventaDetallePK;
@Column(name = "cantidad_pro")
private int cantidad;
@Column(name = "subtotal")
private double subtotal;

@ManyToOne
@JoinColumn(name = "cod_notaped", nullable = false, insertable = false, updatable = false)
private Venta venta;

@ManyToOne
@JoinColumn(name = "cod_pro", nullable = false, insertable = false, updatable = false)
private Producto producto;

public VentaDetallePK getVentaDetallePK() {
	return ventaDetallePK;
}

public void setVentaDetallePK(VentaDetallePK ventaDetallePK) {
	this.ventaDetallePK = ventaDetallePK;
}

public int getCantidad() {
	return cantidad;
}

public void setCantidad(int cantidad) {
	this.cantidad = cantidad;
}

public double getSubtotal() {
	return subtotal;
}

public void setSubtotal(double subtotal) {
	this.subtotal = subtotal;
}

public Venta getVenta() {
	return venta;
}

public void setVenta(Venta venta) {
	this.venta = venta;
}

public Producto getProducto() {
	return producto;
}

public void setProducto(Producto producto) {
	this.producto = producto;
}






}
