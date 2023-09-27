package com.manhnam.lab4.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Date;

@Controller
public class HelloController {
	@GetMapping ("/hello")
	public String sayHello(Model theModel) {
		theModel.addAttribute("theDate", new Date());
		return "helloworld";
	}
	@GetMapping ("/")
	public String showPage(Model theModel) {
		theModel.addAttribute("theDate", new Date());
		return "main-menu";
	}
}
