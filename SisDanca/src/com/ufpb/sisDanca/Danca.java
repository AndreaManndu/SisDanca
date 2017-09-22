import java.util.List;

public class Danca {
	
	 
	
	
	private String tipoDanca;
	private String horario;
	private String professor;
	private  List<Aluno> alunos;
	private int mensalidade ;
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
	public String getProfessor() {
		return professor;
	}
	public void setProfessor(String professor) {
		this.professor = professor;
	}
	public List<Aluno> getAlunos() {
		return alunos;
	}
	public void setAlunos(List<Aluno> alunos) {
		this.alunos = alunos;
	}
	public int getMensalidade() {
		return mensalidade;
	}
	public void setMensalidade(int mensalidade) {
		this.mensalidade = mensalidade;
		
	}
	

}
