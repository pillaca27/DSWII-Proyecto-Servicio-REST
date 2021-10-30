package com.cibertec.proyecto.entity;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Venta")
public class Venta {

	@Id
	@Column(name = "cod_notaped")
	private String codigo;
	
	@Column(name = "dni")
	private String dni;
	
	@ManyToOne
	@JoinColumn(name = "cod_emp")
	private Empleado empleado;
	
	@Column(name = "fecha_ped")
	private Date fecha_ped;
	
	@Column(name = "monto")
	private double monto;

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public Empleado getEmpleado() {
		return empleado;
	}

	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}

	public Date getFecha_ped() {
		return fecha_ped;
	}

	public void setFecha_ped(Date fecha_ped) {
		this.fecha_ped = fecha_ped;
	}

	public double getMonto() {
		return monto;
	}

	public void setMonto(double monto) {
		this.monto = monto;
	}
	
	
}
