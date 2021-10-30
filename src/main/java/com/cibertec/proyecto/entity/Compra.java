package com.cibertec.proyecto.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.ManyToAny;

@Entity
@Table(name = "COMPRA")
public class Compra {
	@Id
	@Column(name = "cod_bo")
	private String codBol;
	@Column(name = "tipo_compro")
	private String TipoCompra;

	
	@Column(name = "tipo_pago")
	private String Tipo_Pago;
	@Column(name = "fecha_emi")
	private Date F_Emision;
	@Column(name = "fecha_reparto")
	private Date F_Reparto;
	@Column(name = "vencimiento")
	private Date Vencim;
	@Column(name = "monto")
	private double mont;
	
	
	@ManyToOne
	@JoinColumn(name = "ruc")
	private Proveedor proveedor;
	
	@ManyToOne
	@JoinColumn(name = "cod_emp")
	private Empleado empleado;

	public String getCodBol() {
		return codBol;
	}

	public void setCodBol(String codBol) {
		this.codBol = codBol;
	}

	public String getTipoCompra() {
		return TipoCompra;
	}

	public void setTipoCompra(String tipoCompra) {
		TipoCompra = tipoCompra;
	}

	

	public String getTipo_Pago() {
		return Tipo_Pago;
	}

	public void setTipo_Pago(String tipo_Pago) {
		Tipo_Pago = tipo_Pago;
	}

	public Date getF_Emision() {
		return F_Emision;
	}

	public void setF_Emision(Date f_Emision) {
		F_Emision = f_Emision;
	}

	public Date getF_Reparto() {
		return F_Reparto;
	}

	public void setF_Reparto(Date f_Reparto) {
		F_Reparto = f_Reparto;
	}

	public Date getVencim() {
		return Vencim;
	}

	public void setVencim(Date vencim) {
		Vencim = vencim;
	}

	public double getMont() {
		return mont;
	}

	public void setMont(double mont) {
		this.mont = mont;
	}

	public Proveedor getProveedor() {
		return proveedor;
	}

	public void setProveedor(Proveedor proveedor) {
		this.proveedor = proveedor;
	}

	public Empleado getEmpleado() {
		return empleado;
	}

	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}

	
	
	
}
