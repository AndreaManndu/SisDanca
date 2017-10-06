package com.ufpb.sisDanca.run;

import java.util.Collection;

import javax.swing.JOptionPane;

import com.ufpb.sisDanca.Aluno;
import com.ufpb.sisDanca.AlunoInexistenteException;
import com.ufpb.sisDanca.Danca;
import com.ufpb.sisDanca.DancasDisponiveis;
import com.ufpb.sisDanca.Professor;
import com.ufpb.sisDanca.ProfessorInexistenteException;
import com.ufpb.sisDanca.ProfessorJaExisteException;
import com.ufpb.sisDanca.SisDeDanca;
import com.ufpb.sisDanca.exception.AlunoJaExisteException;

public class Projeto {
	public static void main (String []args){
		
		SisDeDanca d = new SisDeDanca();
		String resp =  JOptionPane.showInputDialog("Bem vindo ao Studio SisDança\n1.Cadasrar Professor\n2.Cadasrar Aluno\n3.Pesquisa Aluno Por Dança\n4.pesquisaProfessor\n5.Remover Aluno\n6.Remover Professor\n7.Sair");
		while (true){
			if (resp.equals("1")){
				String nome = JOptionPane.showInputDialog("Digite o nome:");
				String cpf = JOptionPane.showInputDialog("Digite o seu cpf:");
				String email = JOptionPane.showInputDialog("Digite o email:");
				String dataDeEntrada = JOptionPane.showInputDialog("Digite sua data de entrada na academia:");
			
				Professor professor = new Professor(nome, cpf, email, dataDeEntrada);
				try {
					d.cadastrarProfessor(professor);
				} catch (ProfessorJaExisteException e) {
					e.printStackTrace();
					JOptionPane.showMessageDialog(null, "cadastrado co sucesso");
				}
			
				
			}
			else if (resp.equals("2")){
				String nome = JOptionPane.showInputDialog("Digite seu nome:");
				String cpf = JOptionPane.showInputDialog("Digite o seu cpf:");
				String email = JOptionPane.showInputDialog("Digite o email:");
				DancasDisponiveis dancas = DancasDisponiveis.PADRAO;
				while (dancas ==DancasDisponiveis.PADRAO){
					int tipoDeDanca = Integer.parseInt(JOptionPane.showInputDialog("Qual é o tipo da dança? \n1.HIP_HOP.\n2.DANCA_DO_VENTRE.\n3.TANGO.\n4.SALSA.\n5.BALLET.\n6.JAZZ\n7.CONTEPORANEA.\n8.Outro"));
					switch (tipoDeDanca){
					case 1:
						dancas = DancasDisponiveis.HIP_HOP;
						break;
					case 2:
						dancas = DancasDisponiveis.DANCA_DO_VENTRE;
						break;
					case 3:
						dancas = DancasDisponiveis.TANGO;
						break;
					case 4:
						dancas = DancasDisponiveis.SALSA;
						break;
					case 5:
						dancas = DancasDisponiveis.BALLET;
						break;
					case 6:
						dancas = DancasDisponiveis.JAZZ;
						break;
					case 7:
						dancas = DancasDisponiveis.CONTEPORANEA;
						break;
					}
				
				}
				String dataDeEntrada = JOptionPane.showInputDialog("Digite sua data de entrada na academia:");
				
				Aluno a= new Aluno(nome,cpf,email,dancas,dataDeEntrada);
				try {
					d.cadastrarAluno(a);
				} catch (AlunoJaExisteException e) {
					e.printStackTrace();
				}
				
			}
			else if (resp.equals("3")){ // pesquisar aluno por danca
				DancasDisponiveis dancas = DancasDisponiveis.PADRAO;
				while (dancas ==DancasDisponiveis.PADRAO){
					int tipoDeDanca = Integer.parseInt(JOptionPane.showInputDialog("Qual é o tipo da dança? \n1.HIP_HOP.\n2.DANCA_DO_VENTRE.\n3.TANGO.\n4.SALSA.\n5.BALLET.\n6.JAZZ\n7.CONTEPORANEA.\n8.Outro"));
					switch (tipoDeDanca){
					case 1:
						dancas = DancasDisponiveis.HIP_HOP;
						try {
							d.pesquisaAlunoPorDanca(dancas);
						} catch (AlunoInexistenteException e) {
							System.out.println(dancas);
						}
						break;
					case 2:
						dancas = DancasDisponiveis.DANCA_DO_VENTRE;
						try {
							d.pesquisaAlunoPorDanca(dancas);
						} catch (AlunoInexistenteException e) {
							System.out.println(dancas);
						}
						break;
					case 3:
						dancas = DancasDisponiveis.TANGO;
						try {
							d.pesquisaAlunoPorDanca(dancas);
						} catch (AlunoInexistenteException e) {
							System.out.println(dancas);
						}
						break;
					case 4:
						dancas = DancasDisponiveis.SALSA;
						try {
							d.pesquisaAlunoPorDanca(dancas);
						} catch (AlunoInexistenteException e) {
							System.out.println(dancas);
						}
						break;
					case 5:
						dancas = DancasDisponiveis.BALLET;
						try {
							d.pesquisaAlunoPorDanca(dancas);
						} catch (AlunoInexistenteException e) {
							System.out.println(dancas);
						}
						break;
					case 6:
						dancas = DancasDisponiveis.JAZZ;
						try {
							d.pesquisaAlunoPorDanca(dancas);
						} catch (AlunoInexistenteException e) {
							System.out.println(dancas);
						}
						break;
					case 7:
						dancas = DancasDisponiveis.CONTEPORANEA;
						try {
							d.pesquisaAlunoPorDanca(dancas);
						} catch (AlunoInexistenteException e) {
							System.out.println(dancas);
						}
						break;
					}
				
				}
				 
				
				
				
				
			
			
			}
			else if (resp.equals("4")){ // pesquisa professor
				String cpf = JOptionPane.showInputDialog("Digite o seu cpf:");
				try {
					d.pesquisaProfessor(cpf);
				} catch (ProfessorInexistenteException e) {
					e.printStackTrace();
				}
				
				
				
				
			}
			else if (resp.equals("5")){
				String cpf = JOptionPane.showInputDialog("Digite o seu cpf:");
				d.removerAluno(cpf);		
			
							
			}
			else if (resp.equals("6")){
				String cpf = JOptionPane.showInputDialog("Digite o seu cpf:");
				d.removerProfessor(cpf);
					
				
			}
				
				
			else if(resp.equals("7")){
			break;
			}
	}
	
	}
}
