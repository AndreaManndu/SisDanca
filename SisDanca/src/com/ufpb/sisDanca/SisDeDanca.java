package com.ufpb.sisDanca;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.ufpb.sisDanca.exception.AlunoInexistenteException;
import com.ufpb.sisDanca.exception.AlunoJaExisteException;
import com.ufpb.sisDanca.exception.DancaJaExisteException;
import com.ufpb.sisDanca.exception.DancaJaExistenteException;
import com.ufpb.sisDanca.exception.ProfessorInexistenteException;
import com.ufpb.sisDanca.exception.ProfessorJaExisteException;


public class SisDeDanca {
	private static List<Professor> professores;
	private static List<Aluno> alunos;
	private static List< Danca> dancas;
	

	public static List<Professor> getProfessores() {
		return professores;
	}

	public static void setProfessores(List<Professor> professores) {
		SisDeDanca.professores = professores;
	}

	public static List<Aluno> getAlunos() {
		return alunos;
	}

	public static void setAlunos(List<Aluno> alunos) {
		SisDeDanca.alunos = alunos;
	}

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

	public List<Aluno> pesquisaAlunosPorDanca(DancasDisponiveis dan) throws AlunoInexistenteException{
		
		List<Aluno> alunoPorDanca = new ArrayList();
		for(Aluno a: alunos){
			if(a.getTipoDanca()==dan){
				alunoPorDanca.add(a);
			}
		}
		
		return alunoPorDanca;
	}

	public Professor pesquisaProfessor(String cpf) throws ProfessorInexistenteException {
		for(Professor p: professores){
			if (p.getCpf().equals(cpf)){
				return p;
			}
			
			
		}
		throw new ProfessorInexistenteException ("Não foi encontrado nenhum professor com esse cpf, ela não está cadastrado");

	}
	
	public Aluno removerAluno(String cpf) throws AlunoInexistenteException{
		for(Aluno a: alunos){
			if(a.getCpf().equals(cpf)){
				alunos.remove(a);
				return a;
			}
			
		}
		throw new AlunoInexistenteException("O Aluno a ser removido não existe");
	}
	public Professor removerProfessor(String cpf) throws ProfessorInexistenteException{
		for(Professor p: professores){
			if(p.getCpf().equals(cpf)){
				professores.remove(p);
				return p;
			}
			
		}
		throw new ProfessorInexistenteException("O Professor a ser removido não existe");
	}
}
