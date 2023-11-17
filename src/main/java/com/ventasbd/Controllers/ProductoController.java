package com.ventasbd.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.ventasbd.Repository.IProductosRepository;

@Controller
public class ProductoController {

	@Autowired
	private IProductosRepository repoProd;
	@GetMapping ("/principal")
	public String Crudproducto(Model model)
	{
		model.addAttribute("lstProductos",repoProd.findAll());
		return "crudprincipal";
	}
}
