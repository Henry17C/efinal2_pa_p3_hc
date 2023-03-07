package com.example.demo.bodega.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.bodega.modelo.Inventario;
import com.example.demo.bodega.repo.IIventarioRepo;

@Service
public class InventarioServiceImpl  implements IInventarioService{

	
	@Autowired
	private IIventarioRepo iIventarioRepo;
	
	@Override
	public void ingresar(Inventario inventario) {
		// TODO Auto-generated method stub
		
		
		
		iIventarioRepo.ingresar(inventario);
		
	}
	
	
	

}
