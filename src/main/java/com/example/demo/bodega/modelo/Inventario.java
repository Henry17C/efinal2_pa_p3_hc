package com.example.demo.bodega.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.criteria.CriteriaBuilder.In;

@Entity
@Table(name = "inventario")
public class Inventario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_inv")
	@SequenceGenerator(name = "seq_inv", sequenceName = "seq_inv", allocationSize = 1)
	@Column(name = "inv_id")
	private Integer id;
	
	
	@Column(name = "inv_numeroBodega")
	private String numeroBodega;
	
	@Column(name = "inv_cantidad")
	private Integer cantidad;
	
	
	@Column(name = "inv_codigoBarrasIndv")
	private String codigoBarrasIndv;
	
	@ManyToOne
	@JoinColumn(name = "id_inventario_bodega")
	private Bodega bodega;
	
	
	@ManyToOne
	@JoinColumn(name = "id_producto_inventario")
	private Producto producto;
	

}
