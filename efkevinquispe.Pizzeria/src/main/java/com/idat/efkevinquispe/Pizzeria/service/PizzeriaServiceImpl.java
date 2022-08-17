package com.idat.efkevinquispe.Pizzeria.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.idat.efkevinquispe.Pizzeria.dao.PizzeriaRepository;
import com.idat.efkevinquispe.Pizzeria.entity.Pizzeria;

@Service
public class PizzeriaServiceImpl implements PizzeriaService {

	@Autowired
	private PizzeriaRepository repository;

	@Override
	@Transactional(readOnly=true)
	public List<Pizzeria> listarPizzeria() {
		
		return (List<Pizzeria>) repository.findAll();
	}

	@Override
	@Transactional(readOnly=true)
	public Pizzeria pizzeriaPorId(Integer id) {
		return repository.findById(id).orElse(null);
	}
	
	@Override
	public void eliminarPizzeriaId(Integer id) {
		repository.deleteById(id);

	}

	@Override
	public void guardarPizzeria(Pizzeria pizzeria) {
		repository.save(pizzeria);

	}

}
