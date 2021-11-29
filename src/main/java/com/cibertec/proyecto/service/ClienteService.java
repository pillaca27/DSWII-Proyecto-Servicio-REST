package com.cibertec.proyecto.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cibertec.proyecto.entity.Cliente;
import com.cibertec.proyecto.entity.Producto;
import com.cibertec.proyecto.repository.ClienteDAO;

@Service
public class ClienteService {
	@Autowired
	private ClienteDAO clienteDAO;
	
	public void registrar(Cliente bean) {
		clienteDAO.save(bean);
	}
	public List<Cliente> listAll(){
		return clienteDAO.findAll();
	}
	
	public List<Cliente> listarClientes(String nombre){
		return clienteDAO.findByClienteLike(nombre+"%");
	}
	
	public void eliminar(String id) {
	clienteDAO.deleteById(id);
	}
	
	public List<Cliente> buscarClientesPorDistrito(String codDis){
		return clienteDAO.findClienteByDistrito(codDis);
	}
	public Cliente buscarPorCodigo(String cod) {
		
		return clienteDAO.findById(cod).orElse(null);
	}
	public List<Cliente> listNombreLike(String nombre) {

		return clienteDAO.buscaClienteNombre(nombre+"%");
	}

}
