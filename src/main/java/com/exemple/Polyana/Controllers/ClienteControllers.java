package com.exemple.Polyana.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exemple.Polyana.entities.Cliente;
import com.exemple.Polyana.servicies.ClienteService;

public class ClienteControllers {
	@RestController
	@RequestMapping("/cliente")
	public class ClienteController {
		
		private final ClienteService clienteService;
		
		
		@Autowired
		public ClienteController (ClienteService clienteService) {
			this.clienteService = clienteService;
		}
		
		@PostMapping
		public Cliente createCliente(@RequestBody Cliente cliente) {
			return clienteService.savecliente(cliente);

	}
		@GetMapping("/{idcCliente}")
		public Cliente getCliente(@PathVariable Long id) {
			return clienteService.GetclienteById(id);
		}

		@GetMapping
		public List<Cliente> getAllCliente(){
			return clienteService.getAllcliente();
		}
	 
		@DeleteMapping ("/{idcCliente}")
		public void deleteCliente(@PathVariable Long id) {
			clienteService.deleteCliente(id);
		}

}
	
}