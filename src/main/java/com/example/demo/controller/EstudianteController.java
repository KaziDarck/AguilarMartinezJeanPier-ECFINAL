package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.modelo.Estudiante;
import com.example.demo.servicio.EstudianteService;

@Controller
@RequestMapping("/estudiante/v1")
public class EstudianteController {
	
	@Autowired
	private EstudianteService service;
	
	@GetMapping(path = "/listar")
	public @ResponseBody List<Estudiante> listar(){
		return service.listar();
	}

}
