package com.cibertec.proyecto.entity;

import java.io.Serializable;

import javax.persistence.Embeddable;


@Embeddable
public class VentaDetallePK implements Serializable{
	private static final long serialVersionUID = 1L;

	private String cod_notaped;
	private String cod_pro;
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cod_notaped == null) ? 0 : cod_notaped.hashCode());
		result = prime * result + ((cod_pro == null) ? 0 : cod_pro.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		VentaDetallePK other = (VentaDetallePK) obj;
		if (cod_notaped == null) {
			if (other.cod_notaped != null)
				return false;
		} else if (!cod_notaped.equals(other.cod_notaped))
			return false;
		if (cod_pro == null) {
			if (other.cod_pro != null)
				return false;
		} else if (!cod_pro.equals(other.cod_pro))
			return false;
		return true;
	}
	
	
	
	
}
