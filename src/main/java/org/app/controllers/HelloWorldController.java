package org.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorldController {
	 
		private static final String template = "Hello, %s!";
		
		// inject via application.properties
		@org.springframework.beans.factory.annotation.Value("${welcome.message:test}")
		private String message = "Hello World";
		
	    @RequestMapping( name = "response", method=RequestMethod.GET)
	    public @ResponseBody String sayHello() {
	        return new String ( message );
	    }
	    
	    @RequestMapping("/")
	    public String welcomePage(Model model) {
	    	model.addAttribute("message", message);
	    	return "welcome";
	    }

}
