package com.ufpb.sisDanca;
import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import com.ufpb.sisDanca.exception.AlunoJaExisteException;
import com.ufpb.sisDanca.exception.ProfessorJaExisteException;

public class GerenciaDanTest {

	@Test
	public void test() {
		SisDeDanca sistema= new SisDeDanca();
		
		Professor p1= new Professor("Wnessa","123456778","wanessa@gmail");
		Aluno a1=new Aluno ("Ada","111111","Ada@gmail",DancasDisponiveis.DANCA_DO_VENTRE);
		Danca d1 = new Danca(DancasDisponiveis.BALLET, "19:00", 10);
		
		try {
			sistema.cadastrarProfessor(p1);
		} catch (ProfessorJaExisteException e) {
		fail();
		
			e.printStackTrace();
		}
		try {
			sistema.cadastrarAluno(a1);
		} catch (AlunoJaExisteException e) {
		fail();
		
			e.printStackTrace();
		}
		assertEquals(1,sistema.getAlunos().size());
		assertEquals(1,sistema.getProfessores().size());
		
	}
		
    }
  
 
