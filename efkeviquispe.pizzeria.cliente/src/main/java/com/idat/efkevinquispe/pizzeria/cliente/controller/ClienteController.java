package com.idat.efkevinquispe.pizzeria.cliente.controller;

import java.util.List;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.idat.efkevinquispe.pizzeria.cliente.entity.Cliente;
import com.idat.efkevinquispe.pizzeria.cliente.service.*;

import org.springframework.web.bind.annotation.ResponseBody;

@RestController
@RequestMapping("/cliente")
public class ClienteController {
	
	private ClienteService service;
	
	@GetMapping("/all")
	public @ResponseBody List<Cliente> listarClientes(){
		return service.listarCliente();
	}	
	

	@GetMapping("/{id}")
	public @ResponseBody  Cliente ObtenerClienteId(@PathVariable Integer id) {
		return service.clientePorId(id);
		
	}
	@DeleteMapping("/{id}")
	public void EliminarCliente(@PathVariable Integer id) {
		 service.eliminarClienteId(id);
		
	}
	@PostMapping("/")
	public void GuardarCliente(@RequestBody Cliente cliente) {
		service.guardarCliente(cliente);
	}
	
	@PostMapping("/asignar")
	public @ResponseBody void asignarClientePizza() {
		service.asignarClientePizza();
	}
	
}
