package com.javainsider.microservices;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Hello {
	
	@RequestMapping("/hello/{name}")
	public String sayHello( Map model, @PathVariable String name){
			
		model.put("name", name);
		return "hello";
	}

}
