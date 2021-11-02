package com.cibertec.proyecto.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cibertec.proyecto.entity.Empleado;
import com.cibertec.proyecto.repository.EmpleadoDao;

@Service
public class EmpleadoService{
	
	@Autowired
	 private EmpleadoDao empleadoDAO;
	
	 public List<Empleado> listAll(){
		 return empleadoDAO.findAll();
	 }

	public void registrar(Empleado bean) {
		empleadoDAO.save(bean);
		
	}

	public void eliminar(String id) {
		empleadoDAO.deleteById(id);
		
	}
	
	public List<Empleado> buscarEmpleadosPorCargo(String codCargo){
		return empleadoDAO.findEmpleadoByCargo(codCargo);
	}


}
