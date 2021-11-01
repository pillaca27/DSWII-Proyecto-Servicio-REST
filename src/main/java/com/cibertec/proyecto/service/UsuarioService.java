package com.cibertec.proyecto.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cibertec.proyecto.entity.Usuario;
import com.cibertec.proyecto.repository.UsuarioDAO;

@Service
public class UsuarioService {
	
	@Autowired
	private UsuarioDAO usuarioDAO;
	
	public List<Usuario> listaAll(){
		return usuarioDAO.findAll();
	}

	public void registrar(Usuario bean) {
		usuarioDAO.save(bean);
	}

	public void eliminar(String id) {
		usuarioDAO.deleteById(id);
	}
	
	public Usuario iniciaSesion(String vLogin) {
		return usuarioDAO.iniciarSesion(vLogin);
	}
}
