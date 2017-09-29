package com.ufpb.sisDanca;
import java.util.HashMap;
import java.util.Map;

import com.ufpb.sisDanca.exception.AlunoJaExisteException;
import com.ufpb.sisDanca.exception.ProfessorJaExistenteException;

public class SisDeDanca {
	private Map<String, Professor>  professores;
	private Map<String, Aluno>  alunos;
	private Map<String, Danca> dancas;
	
	public SisDeDanca(){
		this.professores= new HashMap<String,Professor>();
	
		this.alunos= new HashMap<String, Aluno>();
		this.dancas= new HashMap<String, Danca>();
		
	}
	public void cadastrarAluno(Aluno aluno){
		this.alunos.put(aluno.getEmail(), aluno);
	}
	public void cadastrarProfessor(Professor professor){
		this.professores.put(professor.getEmail(), professor);
	}
	public void cadastrarDanca(Danca danca){
		this.dancas.put(danca.getTipoDanca(), danca);
	}
	public Aluno pesquisaAlunoPorDanca(String nome) throws AlunoJaExisteException {
		Aluno a = alunos.get(nome.toString());

		if (a != null) {
			return a;

		} else {
			
		
			throw new AlunoJaExisteException(" O Aluno já exista!");
		}
				
		}
		public Professor pesquisaProfessor(String nome) throws ProfessorJaExistenteException {
			Professor p = professores.get(nome);

			if (p != null) {
				return p;

			} else {
				throw new ProfessorJaExistenteException(" O Aluno já exista!");
		
	}
 }
}


	
	
	
	
	
	
	
	


