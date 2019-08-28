package com.algaworks.brewer.model;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import com.algaworks.brewer.model.enumerations.TipoPessoa;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class Cliente {

	@NotBlank
	private String nome;
	private String telefone;
	@NotBlank
	private String documentoReceiraFederal;
	@Email
	private String email;
	private String numero;
	private String logradouro;
	@NotBlank
	private String cep;
	private String complemento;
	private String estado;
	private String cidade;
	private TipoPessoa tipo;
	
}
