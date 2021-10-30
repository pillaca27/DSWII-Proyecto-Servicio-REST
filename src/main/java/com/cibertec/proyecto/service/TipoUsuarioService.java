package com.cibertec.proyecto.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cibertec.proyecto.entity.TipoUsuario;
import com.cibertec.proyecto.repository.TipoUsuarioDAO;

@Service
public class TipoUsuarioService {
	
	@Autowired
	private TipoUsuarioDAO tipousuarioDAO;
	
	public List<TipoUsuario> listAll(){
		return tipousuarioDAO.findAll();
	}

}
