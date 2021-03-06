package br.com.rlsystem.tasks.controllers;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import br.com.rlsystem.tasks.services.LoginService;

@Controller
@RequestMapping("/")
public class LoginController {
	
	@Autowired
	private LoginService loginService;
	
	@RequestMapping("/login")
	public String login() {
		return "login";
	}
	@RequestMapping(value="/login", method = RequestMethod.POST)
	public ModelAndView index(@RequestParam String login, @RequestParam String senha) {
		
		ModelAndView mv = new ModelAndView();
		
		if(loginService.validateLogin(login, senha)) {
			mv.setViewName("index");
			mv.addObject("login" +login);
		}else {
			mv.setViewName("login");
			mv.addObject("msg", "O login  "+login+ " não existe !");
		}
		return mv;
	}
	/*
	@RequestMapping("/login")
	public ModelAndView login() {
		LocalDateTime now = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		String data = formatter.format(now);
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("nome", "RL System");
		mv.addObject("data", data);
		mv.setViewName("login");
		
		return mv;
	}*/
	@RequestMapping(value="/")
	public String index() {
	
		return "index";
		
	}

}
