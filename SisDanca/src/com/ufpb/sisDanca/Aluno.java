package com.ufpb.sisDanca;

public class Aluno extends Pessoa{
	private int matricula;
	private Danca tipoDanca;
	private boolean status; 
	private String dataDeEntrada;
	
	public Aluno(String nome, String cpf, String email, int matricula, Danca tipoDanca, boolean status, String dataDeEntrada) {
		
		super(nome, cpf, email);
	}
	public int getMatricula() {
		return matricula;
	}
	public void setMatrica(int matricula) {
		this.matricula = matricula;
	
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
