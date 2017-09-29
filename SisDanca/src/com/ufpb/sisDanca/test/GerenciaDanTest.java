package com.ufpb.sisDanca.test;
import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import com.ufpb.sisDanca.Aluno;
import com.ufpb.sisDanca.Danca;
import com.ufpb.sisDanca.Professor;
import com.ufpb.sisDanca.SisDeDanca;

public class GerenciaDanTest {

	@Test
	public void test() {
		SisDeDanca sistema= new SisDeDanca();
		Professor professor= new Professor("Wnessa","123456778","fhkvdfvhd","22/01/2017");
		Danca danca= new Danca("Ventre",  "08:00", professor, 10);
		
	}

}
