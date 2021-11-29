package com.cibertec.proyecto.entity;


import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.OneToMany;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureParameter;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@NamedStoredProcedureQuery(name = "Venta.getVentaPerEmployee", procedureName = "getVentaPerEmployee", parameters = {
		  @StoredProcedureParameter(mode = ParameterMode.IN, name = "cod", type = String.class) })
@NamedStoredProcedureQuery(name = "Marca.sp_Generar_Venta", procedureName = "sp_Generar_Venta", parameters = {
		  @StoredProcedureParameter(mode = ParameterMode.OUT, name = "p_codigo", type = String.class) })
@Table(name = "Venta")
public class Venta {

	@Id
	@Column(name = "cod_notaped")
	private String codigo;
	
	@Column(name = "fecha_ped")
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date fecha_ped;
	
	@Column(name = "monto")
	private double monto;
	
	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "dni")
	private Cliente cliente;
	
	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "cod_emp")
	private Empleado empleado;
	
	@JsonBackReference
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "venta")
    private List<VentaDetalle> detallesVenta;
 
	
	public List<VentaDetalle> getDetallesVenta() {
		return detallesVenta;
	}

	public void setDetallesVenta(List<VentaDetalle> detallesVenta) {
		this.detallesVenta = detallesVenta;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
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

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Empleado getEmpleado() {
		return empleado;
	}

	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}
	
	
}
