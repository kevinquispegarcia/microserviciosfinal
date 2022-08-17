package com.idat.efkevinquispe.Pizzeria.service;

import java.util.List;

import com.idat.efkevinquispe.Pizzeria.entity.Pizzeria;

public interface PizzeriaService {
	
	List<Pizzeria> listarPizzeria();
	Pizzeria pizzeriaPorId(Integer id);
	void eliminarPizzeriaId(Integer id);
	void guardarPizzeria(Pizzeria pizzeria);
}
