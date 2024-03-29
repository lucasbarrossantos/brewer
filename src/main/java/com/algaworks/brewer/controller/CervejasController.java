package com.algaworks.brewer.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.algaworks.brewer.model.Cerveja;

@Controller
@RequestMapping("/cervejas")
public class CervejasController {

	@GetMapping("/novo")
	public String novo(Cerveja cerveja) {
		return "cerveja/cadastro-cerveja";
	}

	@PostMapping("/novo")
	public String salvar(@Valid Cerveja cerveja, BindingResult result, Model model, RedirectAttributes attributes) {

		if (result.hasErrors()) {
			model.addAttribute("mensagem", "Erro de validação");
			return novo(cerveja);
		}

		// Salvar no banco de dados
		attributes.addFlashAttribute("mensagem", "Cerveja salva com sucesso.");
		return "redirect:/cervejas/novo";
	}

}
