package com.pei.apinoticias.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pei.apinoticias.BancoDados.PessoaRepository;
import com.pei.apinoticias.models.Pessoa;
import com.pei.apinoticias.records.DadosPessoaDTO;

@RestController
@RequestMapping("/pessoa")
public class PessoaController {

	@Autowired
	private PessoaRepository repository;

	@PostMapping
	@Transactional(rollbackFor = Exception.class)
	public Pessoa cadastrar(@RequestBody DadosPessoaDTO dados) throws Exception {
		 return repository.save(new Pessoa(dados));

	};

}
