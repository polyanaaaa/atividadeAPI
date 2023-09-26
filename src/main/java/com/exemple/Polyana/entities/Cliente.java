package com.exemple.Polyana.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "Cliente")
public class Cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idcCliente;
	
	@Column(name = "ncliente")
	private String ncliente;
	
	@Column(name = "fone")
	private String fone;
	
	public Cliente() {
		
		
	}
	public Cliente( Long idcCliente, String ncliente, String fone) {
		this.idcCliente = idcCliente;
		this.ncliente = ncliente;
		this.fone = fone;
	}
	
	public Long getidcCliente() {
		
	return idcCliente;
	
	}
	
	public void setidcCliente(Long idcCliente) {
		this.idcCliente = idcCliente; 
	}
	
	public String getncliente () {
		return ncliente;
		
	}
	
	public void setncliente(String ncliente) {
		this.ncliente = ncliente;
	}
	
	public String getfone () {
		return fone;
	}
	
	public void setfone(String fone) {
		this.fone = fone;
	}
}


