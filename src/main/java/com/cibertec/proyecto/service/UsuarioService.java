package com.cibertec.proyecto.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.cibertec.proyecto.entity.Empleado;
import com.cibertec.proyecto.entity.Usuario;
import com.cibertec.proyecto.repository.UsuarioDAO;

@Service
public class UsuarioService {
	
	@Autowired
	private UsuarioDAO usuarioDAO;
	
	@Autowired
	private BCryptPasswordEncoder passwordEnconder;
	
	public List<Usuario> listaAll(){
		return usuarioDAO.findAll();
	}

	public void registrar(Usuario bean) {
		bean.setPassword(passwordEnconder.encode(bean.getPassword()));
		usuarioDAO.save(bean);
	}

	public void eliminar(String id) {
		usuarioDAO.deleteById(id);
	}
	
	public Usuario iniciaSesion(String vLogin) {
		return usuarioDAO.iniciarSesion(vLogin);
	}
	

	public Usuario buscarPorCodigo(String cod) {
		return usuarioDAO.findById(cod).orElse(null);
	}

}
