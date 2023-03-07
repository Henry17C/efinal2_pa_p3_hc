package com.example.demo.bodega.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.bodega.modelo.Inventario;
import com.example.demo.bodega.service.IInventarioService;

@Controller
@RequestMapping("/accionInventario")//manejamos el recurso persona, se maneja el recurso el plural
public class InventarioController {
	
	@Autowired 
	IInventarioService iInventarioService;
	
	
	@PostMapping("/insertar")
	public String insertarInventario(Inventario inventario) {
		this.iInventarioService.ingresar(inventario);
		
		return "guardar";
	}
	
	
	
	

}
