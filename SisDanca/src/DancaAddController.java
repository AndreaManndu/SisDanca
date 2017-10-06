import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import com.ufpb.sisDanca.Danca;
import com.ufpb.sisDanca.DancasDisponiveis;
import com.ufpb.sisDanca.Professor;
import com.ufpb.sisDanca.ProfessorJaExisteException;
import com.ufpb.sisDanca.SisDeDanca;


public class DancaAddController implements ActionListener {
	SisDeDanca danceFacade;
	JFrame janelaPrincipal;
	
	public DancaAddController (SisDeDanca dancaFacade, JFrame janelaPrincipal ){ //da outra classe
		this.danceFacade = dancaFacade; //vai receber da outra classe dancagui
		this.janelaPrincipal = janelaPrincipal;
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		String nome = JOptionPane.showInputDialog(janelaPrincipal, "Qual o seu nome: ");
		String cpf = JOptionPane.showInputDialog(janelaPrincipal, "Digite o seu cpf:");
		String email = JOptionPane.showInputDialog(janelaPrincipal, "Digite o email:");
		String dataDeEntrada = JOptionPane.showInputDialog(janelaPrincipal,"Digite sua data de entrada na academia:");
		
		Professor p1 = new Professor(nome,cpf,email,dataDeEntrada);
		try {
			danceFacade.cadastrarProfessor(p1);
		} catch (ProfessorJaExisteException e) {
			e.printStackTrace();
		}

	}
	

}
