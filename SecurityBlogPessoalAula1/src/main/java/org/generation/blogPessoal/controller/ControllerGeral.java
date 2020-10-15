package org.generation.blogPessoal.controller;

import org.generation.blogPessoal.model.Tema;
import org.generation.blogPessoal.repository.TemaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ControllerGeral {
	//injeção da interface de acesso ao banco (jpa)
	@Autowired
	private TemaRepository repository;
	
	// abrir pagina login 
	@GetMapping("/")
	public String index() {
		return "index";
	}
	//um get de outro jeito :)
	@RequestMapping(value="/cadastrarTema",method=RequestMethod.GET)
	public String form() {
		return "formTema";
	}
	//um post na table tema, redirecionando para o endpoint /cadastrarTema
	@PostMapping(value="/cadastrarTema")
	public String form(Tema tema) {
		repository.save(tema);
		return "redirect:/cadastrarTema";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
