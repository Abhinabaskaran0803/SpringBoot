package io.javabrains.springbootstarter.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController   //annotation
public class HelloController {
	
	@RequestMapping("/hello")    //annotation , maps get method by default
	//map other http method so specify it in annotation
	public String sayHi() {
		return "Hi";
	}
}

//run in localhost:8080/hello