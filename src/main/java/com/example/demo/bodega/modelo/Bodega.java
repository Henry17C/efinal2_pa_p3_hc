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
@Table(name = "bodega")
public class Bodega {
	

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_bod")
	@SequenceGenerator(name = "seq_bod", sequenceName = "seq_bod", allocationSize = 1)
	@Column(name = "bod_id")
	private Integer id;
	
	@Column(name = "bod_nombre")
	private String nombre;
	
	@Column(name = "bod_numero")
	private String numero;
	
	@Column(name = "bod_direccion")
	private String direccion;
	
	@Column(name = "bod_telefono")
	private String telefono;
	
	@OneToMany(mappedBy = "bodega")
	private List<Inventario> inventarios;
	
	
	

}
