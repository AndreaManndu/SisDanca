package com.ufpb.sisDanca;

public class Danca {
	
	private DancasDisponiveis dancas;
	private String horario;
	private int mensalidade;
	
	
	
	public Danca(DancasDisponiveis dancas, String horario, int mensalidade){
		this.dancas = dancas;
		this.horario=horario;
		this.mensalidade=mensalidade;
	}
	
	public DancasDisponiveis getTipoDanca() {
		return dancas;
	}
	public void setTipoDanca(DancasDisponiveis dancas) {
		this.dancas = dancas;
	}
	public String getHorario() {
		return horario;
	}
	public void setHorario(String horario) {
		this.horario = horario;
	}

	public int getMensalidade() {
		return mensalidade;
	}
	private void setMensalidade(int mensalidade) {
		this.mensalidade = mensalidade;	
	}
	
	public void calculaMensalidade(){
		if (dancas == DancasDisponiveis.BALLET){
			setMensalidade(100);
		}
		else if ( dancas == DancasDisponiveis.CONTEPORANEA){
			setMensalidade (80);
		}
		else if ( dancas == DancasDisponiveis.DANCA_DO_VENTRE){
			setMensalidade (80);
		}
		else if ( dancas == DancasDisponiveis.HIP_HOP){
			setMensalidade (50);
		}
		else if ( dancas == DancasDisponiveis.JAZZ){
			setMensalidade (60);
		}
		else if ( dancas == DancasDisponiveis.SALSA){
			setMensalidade (70);
		}
		else if ( dancas == DancasDisponiveis.TANGO){
			setMensalidade (70);
		}
		
		
	}
	
	@Override
	public String toString() {
	
		return "Danças disponiveis: "+this.dancas+"Horários disponíveis: "+this.horario+"Mensalidade; "+this.mensalidade;
	}
	 
	

}
