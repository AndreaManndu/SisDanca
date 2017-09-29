package com.ufpb.sisDanca;

public class Professor extends Pessoa  {
	private String dataDeEntada;
	
	
	
	public Professor(String nome, String cpf, String email, String dataDeEntada) {
		super(nome, cpf, email);
		this.dataDeEntada = dataDeEntada;
	}

	public String getDataDeEntada() {
		return dataDeEntada;
	}

	public void setDataDeEntada(String dataDeEntada) {
		this.dataDeEntada = dataDeEntada;
	}
}