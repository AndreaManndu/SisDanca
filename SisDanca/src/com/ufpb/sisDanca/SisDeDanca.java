package com.ufpb.sisDanca;

import java.util.HashMap;
import java.util.Map;

import com.ufpb.sisDanca.exception.AlunoJaExisteException;
import com.ufpb.sisDanca.exception.DancaJaExisteException;
import com.ufpb.sisDanca.exception.ProfessorJaExistenteException;

public class SisDeDanca {
	private Map<String, Professor> professores;
	private Map<String, Aluno> alunos;
	private Map<String, Danca> dancas;
	

	public SisDeDanca() {
		this.professores = new HashMap<String, Professor>();

		this.alunos = new HashMap<String, Aluno>();
		this.dancas = new HashMap<String, Danca>();

	}

	public void cadastrarAluno(Aluno aluno) throws AlunoJaExisteException {
		Aluno a= alunos.get(aluno.getEmail());
		if(a == null){
			this.alunos.put(aluno.getEmail(), aluno);
			
		}else{
			
			throw new AlunoJaExisteException(" O Aluno já existe!");
		}
			
	}

	public void cadastrarProfessor(Professor professor)throws ProfessorJaExistenteException  {
		Professor p= professores.get(professor.getCpf());
		if(p == null){
			this.professores.put(professor.getCpf(), professor);	
		}else{
			throw new ProfessorJaExistenteException(" O professor já existe!");
			
		}
		
	}

	public void cadastrarDanca(Danca danca) throws DancaJaExisteException {
		Danca d= dancas.get(danca.getTipoDanca());
		if( d == null){
			this.dancas.put(danca.toString(), danca);
	
		}else{
			throw new DancaJaExisteException(" O professor já existe!");	
		}
		
	}

	public Aluno pesquisaAlunoPorDanca(String cpf) throws AlunoJaExisteException {
		
		Aluno a = alunos.get(cpf);

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
