package com.manhnam.lab4.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;

@Controller
public class HelloWorldController {


	@GetMapping("/processFormVersionThree")
	public String processFormVersionThree(@RequestParam("studentName")String theName, Model model) {

		theName = theName.toUpperCase();
		String result = "Hello my friend from v3!" + theName;
		model.addAttribute("message", result);
		return "helloworld";
	}
	@GetMapping("/processFormVersionTwo")
	public String letShoutDude(HttpServletRequest request, Model model) {
		String theName = request.getParameter("studentName");
		 theName = theName.toUpperCase();
		String result = "Yo!" + theName;
		model.addAttribute("message", result);
		return "helloworld";
	}

	@GetMapping ("/processForm")
	public String processForm() {
		return "helloworld";
	}
	@GetMapping ("/showForm")
	public String showForm() {
		return "helloworld-form";
	}
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
