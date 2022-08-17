package com.idat.efkevinquispe.pizzeria.cliente.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.idat.efkevinquispe.pizzeria.cliente.entity.ClientePizza;

@Repository
public interface ClientePizzaRepository extends CrudRepository<ClientePizza, Integer>{

}
