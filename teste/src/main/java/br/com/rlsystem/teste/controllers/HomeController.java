package br.com.rlsystem.teste.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class HomeController {
	
	@RequestMapping("/listar")
	public String listar() {
		return "RL System!";
	}

}
