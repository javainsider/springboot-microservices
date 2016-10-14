package com.javainsider.microservices;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Hello {
	
	@RequestMapping("/hello")
	public @ResponseBody String sayHello(){
			
		return "Welcome to spring boot hello web.....";
	}

}
