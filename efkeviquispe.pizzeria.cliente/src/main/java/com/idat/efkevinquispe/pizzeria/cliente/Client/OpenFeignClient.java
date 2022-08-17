package com.idat.efkevinquispe.pizzeria.cliente.Client;
import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.idat.efkevinquispe.pizzeria.cliente.dao.Pizza;


@FeignClient(name="Microservicio-Pizza",url="localhost:8080")
public interface OpenFeignClient {
	
	@GetMapping("/pizza/all")
	public List<Pizza> ListarPizza();
	

}
