package com.ufpb.sisDanca;

public class Aluno extends Pessoa{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private DancasDisponiveis tipoDanca;

	public Aluno(String nome, String cpf, String email, DancasDisponiveis tipoDanca) {
		super(nome, cpf, email);
		this.tipoDanca = tipoDanca;	
	}


	public DancasDisponiveis getTipoDanca() {
		return tipoDanca;
	}

	public void setTipoDanca(DancasDisponiveis tipoDanca) {
		this.tipoDanca = tipoDanca;
	}
}
