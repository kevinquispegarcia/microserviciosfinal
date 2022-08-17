package com.idat.efkevinquispe.Pizzeria.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.idat.efkevinquispe.Pizzeria.entity.Pizzeria;

@Repository
public interface PizzeriaRepository extends CrudRepository<Pizzeria, Integer> {

}
