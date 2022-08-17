package com.idat.efkevinquispe.Pizzeria.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "pizzeria")
@Getter
@Setter
public class Pizzeria {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer IdPizzeria;
	private String Direccion;
	private String Sede;


}
