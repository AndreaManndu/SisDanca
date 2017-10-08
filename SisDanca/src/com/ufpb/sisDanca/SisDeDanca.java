package com.ufpb.sisDanca;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.ufpb.sisDanca.exception.AlunoJaExisteException;
import com.ufpb.sisDanca.exception.DancaJaExisteException;
import com.ufpb.sisDanca.exception.DancaJaExistenteException;


public class SisDeDanca {
	private static List<Professor> professores;
	private static List<Aluno> alunos;
	private static List< Danca> dancas;
	

	public SisDeDanca() {
		this.professores = new ArrayList<Professor>();
		this.alunos = new ArrayList< Aluno>();
		this.dancas = new ArrayList <Danca>();

	}

	public void cadastrarAluno(Aluno aluno) throws AlunoJaExisteException {
			for(Aluno a:alunos){
				if(a.getNome().equals(aluno.getNome())){
					throw new AlunoJaExisteException("Aluno já existe");
				}
			}
			alunos.add(aluno);
	}

	public void cadastrarProfessor(Professor professor)throws ProfessorJaExisteException  {
		for(Professor a:professores){
			if(a.getNome().equals(professor.getNome())){
				throw new ProfessorJaExisteException(" O professor já existe");
			}
		}
		professores.add(professor);
	}

	public List<Aluno> pesquisaAlunoPorDanca(DancasDisponiveis dan) throws AlunoInexistenteException{
		
		List<Aluno> alunoPorDanca = new ArrayList();
		for(Aluno a: alunos){
			if(a.getTipoDanca()==dan){
				alunoPorDanca.add(a);
			}
		}
		
		return alunoPorDanca;
	}

	public Professor pesquisaProfessor(int cpf) throws ProfessorInexistenteException {
		Professor p = professores.get(cpf);

		if (p != null) {
			return p;

		} else {
			throw new ProfessorInexistenteException(" Não existe nenhum professor cadastrado com esse cf");
		}

	}
	
	public void removerAluno(String cpf){
		for(Aluno a: alunos){
			if(a.getCpf().equals(cpf)){
				alunos.remove(a);
			}
		}
	}
	public void removerProfessor(String cpf){
		for(Professor a: professores){
			if(a.getCpf().equals(cpf)){
				professores.remove(a);

			}
		}
	}
}
