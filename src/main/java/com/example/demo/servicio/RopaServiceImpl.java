package com.example.demo.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.demo.modelo.Ropa;
import com.example.demo.repository.RopaRepository;

@Service
public class RopaServiceImpl implements RopaService {

	@Autowired
	private RopaRepository repository;
	
	@Override
	public List<Ropa> listar() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

}
