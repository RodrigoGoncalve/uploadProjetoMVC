package br.com.rlsystem.tasks.services;

import org.springframework.stereotype.Service;

@Service
public class LoginService {
	
	public boolean validateLogin(String login, String senha) {
		if(login.equals("admin") && senha.equals("123")){
			return true;
		}else {
			return false;
		}
	}
}
