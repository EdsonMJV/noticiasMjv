package br.com.mjv.noticias.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/noticias")
public class NoticiaController {

	@GetMapping
	public String noticia() {
		return "noticia";
	}
	
}
