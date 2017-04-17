package com.mitrais.spring.boot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

	@RequestMapping("/")
	@ResponseBody
	public String hello() {
		return "<h2>Greetings from Spring Boot!</h2>";
	}

	@GetMapping("/hello")
	@ResponseBody
	public String getHello(@RequestParam(value = "message", defaultValue = "Hai Hai Hello") String message) {
		return "<h2>Your message = "+message+"</h2>";

	}
	
	@PostMapping("/hello")
	@ResponseBody
	public String postHello(@RequestBody String body) {
		return "Your message = "+body;

	}
	
	@PutMapping("/hello/{message}")
	@ResponseBody
	public String message(@PathVariable String message){
		return "Your message: "+message;
		
	}

}
