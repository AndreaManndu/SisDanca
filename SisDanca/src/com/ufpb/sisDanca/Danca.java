package com.ufpb.sisDanca;

public class Danca {
	
	private DancasDisponiveis dancas;
	private String horario;
	private int mensalidade;
	
	
	
	public Danca(DancasDisponiveis dancas, String horario, int mensalidade){
		this.dancas = dancas;
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
	
	public void setMensalidade(int mensalidade){
		this.mensalidade = mensalidade;
	}
	
	
	public void valorMensalidade(){
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

		else if ( dancas == DancasDisponiveis.TANGO){
			setMensalidade (70);
		}
		
	}
	
	public void Horario(){
		if (dancas == DancasDisponiveis.BALLET){
			setHorario("17:00");
		}
		else if ( dancas == DancasDisponiveis.CONTEPORANEA){
			setHorario("18:00");
		}
		else if ( dancas == DancasDisponiveis.DANCA_DO_VENTRE){
			setHorario("13:00");
		}
		else if ( dancas == DancasDisponiveis.HIP_HOP){
			setHorario("14:30");
		}
		else if ( dancas == DancasDisponiveis.JAZZ){
			setHorario("09:00");
		}

		else if ( dancas == DancasDisponiveis.TANGO){
			setHorario("15:00");
		}
		
	}
	
	@Override
	public String toString() {
	
		return "Danças disponiveis: "+this.dancas+"Horários disponíveis: "+this.horario+"Mensalidade; "+this.mensalidade;
	}
	 
	

}
