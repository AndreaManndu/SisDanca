package com.ufpb.sisDanca;

public class Danca {
	
	private String tipoDanca;
	private String horario;
	private Professor professor;
	private int mensalidade ;
	
	public Danca(String tipoDanca, String horario, Professor professor, int mensalidade){
		this.tipoDanca=tipoDanca;
		this.horario=horario;
		this.professor=professor;
		this.mensalidade=mensalidade;
	}
	
	public String getTipoDanca() {
		return tipoDanca;
	}
	public void setTipoDanca(String tipoDanca) {
		this.tipoDanca = tipoDanca;
	}
	public String getHorario() {
		return horario;
	}
	public void setHorario(String horario) {
		this.horario = horario;
	}
	public Professor getProfessor() {
		return professor;
	}
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	public int getMensalidade() {
		return mensalidade;
	}
	public void setMensalidade(int mensalidade) {
		this.mensalidade = mensalidade;	
	
		
	}
	@Override
	public String toString() {
	
		return this.tipoDanca;
	}
	 
	

}
