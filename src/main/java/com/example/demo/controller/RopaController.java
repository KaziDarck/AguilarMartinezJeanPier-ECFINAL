package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.modelo.Estudiante;
import com.example.demo.modelo.Ropa;
import com.example.demo.servicio.EstudianteService;
import com.example.demo.servicio.RopaService;

@Controller
@RequestMapping("/ropa/v1")
public class RopaController {
	
	@Autowired
	private RopaService service;
	
	@GetMapping(path = "/listar")
	public @ResponseBody List<Ropa> listar(){
		return service.listar();
	}

}
