package com.ufpb.sisDanca.run;

import javax.swing.JOptionPane;

import com.ufpb.sisDanca.Professor;

public class Projeto {
	public static void main (String []args){
		
		
		String resp =  JOptionPane.showInputDialog("Bem vindo ao SisDança\n1.Cadasrar Professor\n2.Cadasrar Aluno\n3.Cadastrar Dança\n4.Sair");
		while (true){
			if (resp.equals("1")){
				String nome = JOptionPane.showInputDialog("Digite o nome:");
				String cpf = JOptionPane.showInputDialog("Digite o seu cpf:");
				String email = JOptionPane.showInputDialog("Digite o email:");
				String dataDeEntrada = JOptionPane.showInputDialog("Digite sua data de entrada na academia:");
			
				Professor professor = new Professor(nome, cpf, email, dataDeEntrada);
				JOptionPane.showMessageDialog(null, "cadastrado co sucesso");
			}
			else if (resp.equals("2")){
				String matricula = JOptionPane.showInputDialog("Digite a sua matrícula :");
				String cpf = JOptionPane.showInputDialog("Digite o seu cpf:");
				String email = JOptionPane.showInputDialog("Digite o email:");
				String dataDeEntrada = JOptionPane.showInputDialog("Digite sua data de entrada na academia:");
			
		
			}
			else if (resp.equals("3")){
				
			
			
			}
				
			else if(resp.equals("4")){
			break;
			}
	}
	
	}
}
