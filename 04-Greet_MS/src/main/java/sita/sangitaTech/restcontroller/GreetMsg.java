package sita.sangitaTech.restcontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetMsg {
	@GetMapping("/greet")
	public String greetMsg(String name) {
		name="Sita";
		String msg="Good Evening Microservice developer.....!!"+name;
		return msg;
	}

}
