import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import com.ufpb.sisDanca.ProfessorInexistenteException;
import com.ufpb.sisDanca.SisDeDanca;

public class DancaSearchController1 implements ActionListener {
	SisDeDanca danceFacade;
	JFrame janelaPrincipal;
	
	public DancaSearchController1 (SisDeDanca dancaFacade, JFrame janelaPrincipal ){ //da outra classe
		this.danceFacade = dancaFacade; //vai receber da outra classe dancagui
		this.janelaPrincipal = janelaPrincipal;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String cpf = JOptionPane.showInputDialog("Digite o seu cpf:");
		try {
			danceFacade.pesquisaProfessor(cpf);
		} catch (ProfessorInexistenteException e1) {
			e1.printStackTrace();
		}

	}

}
