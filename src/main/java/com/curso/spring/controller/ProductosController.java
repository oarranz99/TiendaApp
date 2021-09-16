package com.curso.spring.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.curso.spring.entidades.Producto;
import com.curso.spring.service.ProductoService;

@Controller
@RequestMapping("/productos")
public class ProductosController {
	
	@Autowired
	 ProductoService prodService;
	
		//Mapeo
	@GetMapping("/nuevo")
	public String nuevo(Model model){
		model.addAttribute("nuevoProducto", new Producto());
		return "crear-producto";
		
	}
	
	//Mapeo
	@PostMapping("/nuevo")
	public String ProcesarNuevo(
			@ModelAttribute ("nuevoProducto")
			@Valid Producto nuevoProducto,
			BindingResult bindingResult
			){
		if(bindingResult.hasErrors()) {
			return "crear-producto";
		}
		
		prodService.crearProducto(nuevoProducto);
		return "crear-producto";
		
	}
}
