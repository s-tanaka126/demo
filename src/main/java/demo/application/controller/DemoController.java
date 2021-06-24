package demo.application.controller;

import javax.swing.Spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {
	
	@GetMapping("/")
	public String welcome() {
		
		return "/welcom";
		
	}
}
