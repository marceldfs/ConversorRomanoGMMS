package mz.co.cedsif.conversorromanos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ConversorController {
	@RequestMapping("/")
	public String index() {
		return "index";
	}
	
	@RequestMapping("conversor")
	public String converter() {
		return "conversor";
	}
}
