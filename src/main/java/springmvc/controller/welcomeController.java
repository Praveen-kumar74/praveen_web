package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class welcomeController {

	
	@RequestMapping("/")

	public String greeting()
	{
		System.out.println("WelcomeController.greeting()");
		return "index";
	}
	
	
}
