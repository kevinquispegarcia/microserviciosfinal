package com.idat.efkevinquispe.Pizzeria.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.idat.efkevinquispe.Pizzeria.entity.Pizzeria;
import com.idat.efkevinquispe.Pizzeria.service.PizzeriaService;

@RestController
@RequestMapping("/pizza")
public class PizzeriaController {
	
private PizzeriaService service;
	
	@GetMapping("/all")
	public @ResponseBody List<Pizzeria> listarPizzeria(){
		return service.listarPizzeria();
	}	
	

	@GetMapping("/{id}")
	public @ResponseBody  Pizzeria ObtenerPizzeriaId(@PathVariable Integer id) {
		return service.pizzeriaPorId(id);
		
	}
	@DeleteMapping("/{id}")
	public void EliminarPizzeria(@PathVariable Integer id) {
		 service.eliminarPizzeriaId(id);
		
	}
	@PostMapping("/")
	public void GuardarPizzeria(@RequestBody Pizzeria pizzeria) {
		service.guardarPizzeria(pizzeria);
	}

}
