package com.idat.efkevinquispe.pizzeria.Pizza.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.idat.efkevinquispe.pizzeria.Pizza.entity.Pizza;

@Repository
public interface PizzaRepository extends CrudRepository<Pizza, Integer>{


}
