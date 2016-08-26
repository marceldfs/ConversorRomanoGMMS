package mz.co.cedsif.conversorromanos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ConversorController {
	
	@RequestMapping("/")
	public String index() {
		return "index";
	}
	
	@RequestMapping("conversor")
	public String conversor() {
		return "conversor";
	}
	
	@ResponseBody
	@RequestMapping("conversorNumero")
	public String converter(String numero,Model model) {
		model.addAttribute("numero", "1");
		return "1";
	}
}
