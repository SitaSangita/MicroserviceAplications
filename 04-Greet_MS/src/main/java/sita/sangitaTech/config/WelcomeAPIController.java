package sita.sangitaTech.config;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name="03-Zipkin_MS")
public interface WelcomeAPIController {
	
	public String invokeWelcomeMsg();

}
