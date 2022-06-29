package com.example.demo.services;

import org.springframework.stereotype.Service;

import com.example.demo.models.Cep;

@Service
public class CepService {

	public Cep consultarCep (String cep) {
		return gerarDadosCep(cep);
	}

	private Cep gerarDadosCep(String cep) {
		
		if (cep.length()!=8) {
			return null;
		}
		
		if (cep.startsWith("0")) {
			return null;
		}
		Cep novoCep = new Cep();
		novoCep.setCep(cep);
		novoCep.setLogradouro("logradouro " + cep);
		novoCep.setBairro("bairro "+ cep);
		novoCep.setCidade("cidade " + cep);
		novoCep.setUf("uf " + cep);
		return novoCep;
	}
}
