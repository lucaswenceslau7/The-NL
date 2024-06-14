package com.pei.apinoticias.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pei.apinoticias.BancoDados.PessoaRepository;
import com.pei.apinoticias.models.Pessoa;
import com.pei.apinoticias.service.IEmailService;

@RestController
@RequestMapping("/email")
public class EmailController {

	@Autowired
	private PessoaRepository repository;

	@Autowired
	private IEmailService emailService;

	@GetMapping
	@Transactional(rollbackFor = Exception.class)
	public ResponseEntity<String> dispararEmails() throws Exception {
		List<Pessoa> pessoaList;
		pessoaList = repository.findAll();
		emailService.disparar(pessoaList);
		return new ResponseEntity<>(HttpStatus.ACCEPTED);
	}
}
