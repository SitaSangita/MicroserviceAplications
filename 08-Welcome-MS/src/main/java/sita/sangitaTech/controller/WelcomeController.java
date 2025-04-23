package sita.sangitaTech.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
	@GetMapping("/welcome")
	public String getWelcome() {
		String msg="Welcome to Microservice";
		return msg;
	}

}
