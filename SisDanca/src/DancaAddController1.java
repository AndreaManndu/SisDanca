import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import com.ufpb.sisDanca.Aluno;
import com.ufpb.sisDanca.DancasDisponiveis;
import com.ufpb.sisDanca.SisDeDanca;
import com.ufpb.sisDanca.exception.AlunoJaExisteException;

public class DancaAddController1 implements ActionListener {
	SisDeDanca danceFacade;
	JFrame janelaPrincipal;
	
	public DancaAddController1 (SisDeDanca dancaFacade, JFrame janelaPrincipal ){ //da outra classe
		this.danceFacade = dancaFacade; //vai receber da outra classe dancagui
		this.janelaPrincipal = janelaPrincipal;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String nome = JOptionPane.showInputDialog("Digite seu nome:");
		String cpf = JOptionPane.showInputDialog("Digite o seu cpf:");
		String email = JOptionPane.showInputDialog("Digite o email:");
		DancasDisponiveis dancas = DancaGUI.leDancas(janelaPrincipal);
		String dataDeEntrada = JOptionPane.showInputDialog("Digite sua data de entrada na academia:");
		
		Aluno a= new Aluno(nome,cpf,email,dancas,dataDeEntrada);
		try {
			danceFacade.cadastrarAluno(a);
		} catch (AlunoJaExisteException e1) {
			e1.printStackTrace();
		}
	}

}
