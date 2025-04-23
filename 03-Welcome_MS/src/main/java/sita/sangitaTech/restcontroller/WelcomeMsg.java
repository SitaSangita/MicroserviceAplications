package sita.sangitaTech.restcontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeMsg {
	@GetMapping("/welcome")
	public String getWelcomeMsg(String name) {
		name="sita";
		String msg="Welcome To Microservice Wolrd";
		return msg+" "+name;
	}

}
