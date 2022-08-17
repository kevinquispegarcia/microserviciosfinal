package com.idat.efkevinquispe.pizzeria.cliente.service;

import java.util.List;

import com.idat.efkevinquispe.pizzeria.cliente.entity.Cliente;

public interface ClienteService {
	
	List<Cliente> listarCliente();
	Cliente clientePorId(Integer id);
	void eliminarClienteId(Integer id);
	void guardarCliente(Cliente cliente);
	void asignarClientePizza();
}
