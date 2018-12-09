package com.gree.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class hellospringmvc {
	@RequestMapping("/hellospringmvc")
	public String helloworld(Model model) {
		model.addAttribute("massage", "springmvc´óÒ¯ÄãºÃ");
		return "hellospringmvc";
	}

}
