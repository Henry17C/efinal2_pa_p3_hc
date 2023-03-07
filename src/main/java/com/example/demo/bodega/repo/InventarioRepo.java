package com.example.demo.bodega.repo;

import org.springframework.stereotype.Repository;

import com.example.demo.bodega.modelo.Inventario;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class InventarioRepo implements IIventarioRepo{
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void ingresar(Inventario inventario) {
		// TODO Auto-generated method stub
		
		entityManager.persist(inventario);
		
		
	}
	
	

}
