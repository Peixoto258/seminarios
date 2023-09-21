package com.azure.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AzureModel {
	private String nome;
	private String sobreNome;
	private String cidadeNascimento;
}
