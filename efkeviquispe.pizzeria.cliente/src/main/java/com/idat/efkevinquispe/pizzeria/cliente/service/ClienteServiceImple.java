package com.idat.efkevinquispe.pizzeria.cliente.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.idat.efkevinquispe.pizzeria.cliente.Client.OpenFeignClient;
import com.idat.efkevinquispe.pizzeria.cliente.dao.ClientePizzaRepository;
import com.idat.efkevinquispe.pizzeria.cliente.dao.ClienteRepository;
import com.idat.efkevinquispe.pizzeria.cliente.dao.Pizza;
import com.idat.efkevinquispe.pizzeria.cliente.entity.Cliente;
import com.idat.efkevinquispe.pizzeria.cliente.entity.ClientePizza;
import com.idat.efkevinquispe.pizzeria.cliente.entity.ClientePizzaFK;

import java.util.List;

@Service
public class ClienteServiceImple implements ClienteService {
	
	@Autowired
	private ClienteRepository repository;
	
	@Autowired
	private ClientePizzaRepository repositoryDetalle;
	
	@Autowired
	private OpenFeignClient feign;

	@Override
	@Transactional(readOnly=true)
	public List<Cliente> listarCliente() {
		
		return (List<Cliente>) repository.findAll();
	}

	@Override
	@Transactional(readOnly=true)
	public Cliente clientePorId(Integer id) {
		return repository.findById(id).orElse(null);
	}

	@Override
	public void eliminarClienteId(Integer id) {
		repository.deleteById(id);

	}

	@Override
	public void guardarCliente(Cliente cliente) {
		repository.save(cliente);

	}
	
	@Override
	public void asignarClientePizza() {
	
		List<Pizza> listado=feign.ListarPizza();
		ClientePizzaFK fk=null;
		
		for(Pizza pizza : listado) {
			 fk= new ClientePizzaFK();
			fk.setIdCliente(pizza.getIdPizza());
			fk.setIdPizza(1);
			
			ClientePizza detalle= new ClientePizza();
			detalle.setFk(fk);
			repositoryDetalle.save(detalle);
		}
		
	
		
		

	}
	
	


}
