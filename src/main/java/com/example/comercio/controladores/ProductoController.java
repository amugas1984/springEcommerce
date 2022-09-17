package com.example.comercio.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
//le digo s spring que es un controlador
//y pongo la direccion asi lo encuentra mapping
@Controller
@RequestMapping("/productos")
public class ProductoController {

	@GetMapping("")
	public String show() {
		return "productos/show";
	}
}
