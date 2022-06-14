package com.chainsys.application.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class Service {
	@RequestMapping("projectB/welcome")
public String welcomePage() {
	return "<h1>welcome Karthikeyan</h1>";
}
	@RequestMapping("/home")
	public String homePage() {
		String html="<div>What is the best definition of mathematics?\r\n"
				+ "Mathematics is the science and study of quality, structure, space, and change. Mathematicians seek out patterns, formulate new conjectures, and establish truth by rigorous deduction from appropriately chosen axioms and definitions.</div>";
		return html;
	}
	@RequestMapping("/getdata")
	public String getData(@RequestParam(value="city",defaultValue="Cuddalore")String city) {
		return "<h1>welcome to "+city+"</h1>";
	}
}