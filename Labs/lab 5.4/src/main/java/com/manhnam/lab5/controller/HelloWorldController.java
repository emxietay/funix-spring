package com.manhnam.lab5.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

@Controller
public class HelloWorldController {
	@GetMapping ("/")
	public String showPage(Model theModel) {
		theModel.addAttribute("theDate", new Date());
		return "main-menu";
	}
}
