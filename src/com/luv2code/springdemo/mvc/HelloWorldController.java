package com.luv2code.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {

	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}
	
	@RequestMapping("/processForm")
	public String proccedForm() {
		return "helloworld";
	}
	
	
	@RequestMapping("processFormVersionTwo")
	public String letsShoutDude(HttpServletRequest request,Model model) {
		String theName=request.getParameter("studentName");
		model.addAttribute("message","Yo! " + theName.toUpperCase());
		return "helloworld";
	}
}
