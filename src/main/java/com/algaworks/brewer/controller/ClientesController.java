package com.algaworks.brewer.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.algaworks.brewer.model.Cliente;

@Controller
@RequestMapping("/clientes")
public class ClientesController {

	@GetMapping("/novo")
	private String novo(Cliente cliente) {
		return "cliente/cadastro-cliente";
	}

	@PostMapping("/novo")
	private String salvar(@Valid Cliente cliente, BindingResult result, Model model, RedirectAttributes attributes) {
		
		if(result.hasErrors()) {
			model.addAttribute("mensagem", "Erro de validação");
			return novo(cliente);
		}
		
		attributes.addFlashAttribute("mensagem", "Cerveja salva com sucesso.");
		return "redirect:/clientes/novo";
	}

}
