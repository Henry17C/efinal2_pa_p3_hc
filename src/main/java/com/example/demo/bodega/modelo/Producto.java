package com.example.demo.bodega.modelo;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "producto")
public class Producto{

	
	@Id
	@Column(name = "prod_codigoBarrasMaestro")
	private String codigoBarrasMaestro;
	
	@Column(name = "prod_nombre")
	private String nombre;

	
	@Column(name = "prod_categoria")
	private String categoria;
	
	
	@OneToMany(mappedBy = "producto")
	private List <Inventario> inventario;
	
	
}
