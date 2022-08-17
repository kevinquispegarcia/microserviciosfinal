package com.idat.efkevinquispe.pizzeria.cliente.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.idat.efkevinquispe.pizzeria.cliente.entity.Cliente;

@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Integer>{


}
