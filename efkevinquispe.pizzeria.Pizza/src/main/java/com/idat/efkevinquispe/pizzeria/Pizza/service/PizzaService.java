package com.idat.efkevinquispe.pizzeria.Pizza.service;

import java.util.List;

import com.idat.efkevinquispe.pizzeria.Pizza.entity.Pizza;

public interface PizzaService {
	
	List<Pizza> listarPizza();
	Pizza pizzaPorId(Integer id);
	void eliminarPizzaId(Integer id);
	void guardarPizza(Pizza pizza);

}
