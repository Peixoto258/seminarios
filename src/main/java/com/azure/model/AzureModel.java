package com.azure.model;

public class AzureModel {
	private String nome;
	private String sobreNome;
	private String cidadeNascimento;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobreNome() {
		return sobreNome;
	}

	public void setSobreNome(String sobreNome) {
		this.sobreNome = sobreNome;
	}

	public String getCidadeNascimento() {
		return cidadeNascimento;
	}

	public void setCidadeNascimento(String cidadeNascimento) {
		this.cidadeNascimento = cidadeNascimento;
	}

	public AzureModel(String nome, String sobreNome, String cidadeNascimento) {
		super();
		this.nome = nome;
		this.sobreNome = sobreNome;
		this.cidadeNascimento = cidadeNascimento;
	}

	@Override
	public String toString() {
		return "AzureModel [nome=" + nome + ", sobreNome=" + sobreNome + ", cidadeNascimento=" + cidadeNascimento + "]";
	}

}
