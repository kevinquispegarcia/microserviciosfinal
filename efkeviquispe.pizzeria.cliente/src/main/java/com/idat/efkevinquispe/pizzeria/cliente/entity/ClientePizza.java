package com.idat.efkevinquispe.pizzeria.cliente.entity;

import javax.persistence.Entity;
import javax.persistence.Table;




import javax.persistence.EmbeddedId;


@Entity
@Table(name = "Cliente_Pizza")
public class ClientePizza {
	
	@EmbeddedId
	private ClientePizzaFK fk =new ClientePizzaFK();

	public ClientePizzaFK getFk() {
		return fk;
	}

	public void setFk(ClientePizzaFK fk) {
		this.fk = fk;
	}

	
}
