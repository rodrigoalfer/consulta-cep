package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.example.demo.models.Cep;
import com.example.demo.services.CepService;

@RestController
@RequestMapping("/consultar")
public class CepController {
	
	@Autowired
	private CepService cepService;
	
	@GetMapping("/{cep}")
	public ResponseEntity<Cep> consultarCep (@PathVariable("cep") String cep) {
	
		Cep cepConsulta = cepService.consultarCep(cep);
		if(cepConsulta!=null) {
			return ResponseEntity.ok().body(cepConsulta);
		}
		throw new ResponseStatusException(HttpStatus.NOT_FOUND);
	}
}
