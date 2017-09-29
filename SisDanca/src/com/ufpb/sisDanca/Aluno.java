package com.ufpb.sisDanca;

public class Aluno extends Pessoa{
	private int matrica;
	private int mensalidade;
	private boolean status; 
	private String dataDeEntrada;
	
	public Aluno(String nome, String cpf, String email) {
		super(nome, cpf, email);
	}
	public int getMatrica() {
		return matrica;
	}
	public void setMatrica(int matrica) {
		this.matrica = matrica;
	}
	public int getMensalidade() {
		return mensalidade;
	}
	public void setMensalidade(int mensalidade) {
		this.mensalidade = mensalidade;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public String getDataDeEntrada() {
		return dataDeEntrada;
	}
	public void setDataDeEntrada(String dataDeEntrada) {
		this.dataDeEntrada = dataDeEntrada;
	}
	
	

}
