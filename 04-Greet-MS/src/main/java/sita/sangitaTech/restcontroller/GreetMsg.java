package sita.sangitaTech.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import sita.sangitaTech.config.WelcomeAPIController;

@RestController
public class GreetMsg {
	@Autowired
	private WelcomeAPIController apiController;
	@GetMapping("/greet")
	public String greetMsg() {
		String welcomeMsg = apiController.invokeWelcomeMsg();
		
		String msg=welcomeMsg+" Good Evening Microservice developer.....!!";
		return msg;
	}

}
