package com.exemple.Polyana.servicies;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exemple.Polyana.entities.Cliente;
import com.exemple.Polyana.repositories.repository;

@Service
public class ClienteService {
	private final repository repository;
	
	
	@Autowired
	public ClienteService (repository repository) {
		this.repository = repository;
 }
 
	public Cliente savecliente(Cliente cliente) { 
		return repository.save(cliente);
	}
	
	public List <Cliente> getAllcliente(){
		return repository.findAll();
		
	}
	
	public Cliente GetclienteById(long Id) {
		return repository.findById(Id).orElse(null);
	}
	
	public void deleteCliente(Long id) {
		repository.deleteById(id);
	}
}