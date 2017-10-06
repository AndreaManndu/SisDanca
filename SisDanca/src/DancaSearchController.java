import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import com.ufpb.sisDanca.AlunoInexistenteException;
import com.ufpb.sisDanca.DancasDisponiveis;
import com.ufpb.sisDanca.SisDeDanca;

public class DancaSearchController implements ActionListener {
	SisDeDanca danceFacade;
	JFrame janelaPrincipal;
	
	public DancaSearchController (SisDeDanca dancaFacade, JFrame janelaPrincipal ){ //da outra classe
		this.danceFacade = dancaFacade; //vai receber da outra classe dancagui
		this.janelaPrincipal = janelaPrincipal;
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		DancasDisponiveis dancas = DancaGUI.leDancas(janelaPrincipal);
		try {
			danceFacade.pesquisaAlunoPorDanca(dancas);
		} catch (AlunoInexistenteException e) {
			e.printStackTrace();
		}

	}

}
