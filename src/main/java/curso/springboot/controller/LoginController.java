package curso.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
	
	@RequestMapping("/login")
	public String login () throws Exception{
		return "login";
	}
	
	@RequestMapping("/")
	public String index () throws Exception{
		return "index";
	}

}
