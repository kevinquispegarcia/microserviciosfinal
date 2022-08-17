package com.idat.efkevinquispe.pizzeria.cliente.entity;


import javax.persistence.Embeddable;

import java.io.Serializable;

import javax.persistence.Column;



@Embeddable
public class ClientePizzaFK implements Serializable{
	

	private static final long serialVersionUID = -7533262946587962841L;

	@Column(name="IdCliente", nullable=false, unique=true)
	private Integer IdCliente;
	
	@Column(name="idCliente", nullable=false, unique=true)
	private Integer IdPizza;

	public Integer getIdCliente() {
		return IdCliente;
	}

	public void setIdCliente(Integer idCliente) {
		IdCliente = idCliente;
	}

	public Integer getIdPizza() {
		return IdPizza;
	}

	public void setIdPizza(Integer idPizza) {
		IdPizza = idPizza;
	}
	
	
}
