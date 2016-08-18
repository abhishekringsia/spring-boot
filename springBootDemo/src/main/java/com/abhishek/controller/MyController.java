package com.abhishek.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.abhishek.service.PersonService;

@Controller
public class MyController {
	
	@Autowired
	PersonService personService;

	@ResponseBody
	@RequestMapping("/hello")
	public String helloMessge(){
		personService.addPerson("raju");
		return "this is my Controller";
	}
	
	@RequestMapping("/helloHtml")
	public String helloHtml(Model model){
		model.addAttribute("name", "Rahul");
		return "view";
	}
}
