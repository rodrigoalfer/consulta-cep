package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Cep;
import com.example.demo.services.CepService;

@RestController
@RequestMapping("/consultar")
public class CepController {
	
	@Autowired
	private CepService cepService;
	
	@GetMapping("/{cep}")
	public Cep consultarCep (String cep) {
	
		Cep cepConsulta = cepService.consultarCep(cep);
		if(cepConsulta!=null) {
			return cepConsulta;
		}
		return null;
	}
}
