package sita.sangitaTech.config;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="03-Zipkin-MS")
public interface WelcomeAPIController {
	@GetMapping("/welcome")
	public String invokeWelcomeMsg();

}
