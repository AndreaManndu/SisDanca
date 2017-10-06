package com.ufpb.sisDanca;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import com.ufpb.sisDanca.exception.AlunoJaExisteException;
import com.ufpb.sisDanca.exception.DancaJaExisteException;
import com.ufpb.sisDanca.exception.DancaJaExistenteException;


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
		Aluno a= alunos.get(aluno.getCpf());
		if(a == null){
			this.alunos.put(aluno.getCpf(), aluno);
			
		}else{
			
			throw new AlunoJaExisteException(" O Aluno já existe!");
		}
			
	}

	public void cadastrarProfessor(Professor professor)throws ProfessorJaExisteException  {
		Professor p= professores.get(professor.getCpf());
		if(p == null){
			this.professores.put(professor.getCpf(), professor);	
		}else{
			throw new ProfessorJaExisteException(" O professor já existe!");
			
		}
		
	}



	public Collection<Aluno> pesquisaAlunoPorDanca(DancasDisponiveis dan) throws AlunoInexistenteException{
		Collection<Aluno> alunoPorDanca= alunos.values();
		for (Aluno a:this.alunos.values()){
			if(a.getTipoDanca().equals(dan)){
				alunoPorDanca.add(a);
			}
			else{
				throw new AlunoInexistenteException("O aluno não está cadastrado nessa aula de dança");
			}
		}
		return alunoPorDanca;
		

	}

	public Professor pesquisaProfessor(String cpf) throws ProfessorInexistenteException {
		Professor p = professores.get(cpf);

		if (p != null) {
			return p;

		} else {
			throw new ProfessorInexistenteException(" Não existe nenhum professor cadastrado com esse cf");
		}

	}
	
	public void removerAluno(String cpf){
		for(Aluno a:this.alunos.values()){
			if(a.getCpf().equals(cpf)){
				alunos.remove(a);
					
			}
		}
	}
	public void removerProfessor(String cpf){
		for(Professor p:this.professores.values()){
			if(p.getCpf().equals(cpf)){
				professores.remove(p);

			}
		}
	}
}
