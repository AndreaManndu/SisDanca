package com.ufpb.sisDanca.run;

import javax.swing.JOptionPane;

import com.ufpb.sisDanca.Professor;

public class Projeto {
	public static void main (String []args){
		
		
		String resp =  JOptionPane.showInputDialog("Bem vindo ao SisDan�a\n1.Cadasrar Professor\n2.Cadasrar Aluno\3.Cadatrar Danca");
		
		if (resp.equals("1")){
			String nome = JOptionPane.showInputDialog("Digite o nome:");
			String cpf = JOptionPane.showInputDialog("Digite o seu cpff:");
			String email = JOptionPane.showInputDialog("Digite o email:");
			String dataDeEntrada = JOptionPane.showInputDialog("Digite sua data de entrada:");
			
			Professor professor = new Professor(nome, cpf, email, dataDeEntrada);
			JOptionPane.showMessageDialog(null, "cadastrado co sucesso");
		}
		else if (resp.equals("2")){
		
		}
		else if (resp.equals("3")){
			
		}
				
		
	}
	

}
