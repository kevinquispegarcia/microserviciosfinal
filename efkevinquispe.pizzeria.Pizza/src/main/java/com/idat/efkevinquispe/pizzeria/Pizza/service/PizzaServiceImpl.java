package com.idat.efkevinquispe.pizzeria.Pizza.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.idat.efkevinquispe.pizzeria.Pizza.dao.PizzaRepository;
import com.idat.efkevinquispe.pizzeria.Pizza.entity.Pizza;

@Service
public class PizzaServiceImpl implements PizzaService {
	
	@Autowired
	private PizzaRepository repository;

	@Override
	@Transactional(readOnly=true)
	public List<Pizza> listarPizza() {
		
		return (List<Pizza>) repository.findAll();
	}

	@Override
	@Transactional(readOnly=true)
	public Pizza pizzaPorId(Integer id) {
		return repository.findById(id).orElse(null);
	}
	
	@Override
	public void eliminarPizzaId(Integer id) {
		repository.deleteById(id);

	}

	@Override
	public void guardarPizza(Pizza pizza) {
		repository.save(pizza);

	}

}
