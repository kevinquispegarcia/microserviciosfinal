package com.idat.efkevinquispe.pizzeria.cliente.dao;

public class Pizza {
	
	private Integer IdPizza;
	private String NombrePizza;
	private String Descripcion;
	public Integer getIdPizza() {
		return IdPizza;
	}
	public void setIdPizza(Integer idPizza) {
		IdPizza = idPizza;
	}
	public String getNombrePizza() {
		return NombrePizza;
	}
	public void setNombrePizza(String nombrePizza) {
		NombrePizza = nombrePizza;
	}
	public String getDescripcion() {
		return Descripcion;
	}
	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}
	

}
