package sita.sangitaTech.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetController {
	@GetMapping("/greet")
	public String getGreet() {
		String msg="Good Evening Microservice Developer";
		return msg;
	}

}
