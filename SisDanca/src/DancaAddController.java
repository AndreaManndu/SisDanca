import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import com.ufpb.sisDanca.DancasDisponiveis;
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
		DancasDisponiveis dancas = DancaGUI.leDancas(janelaPrincipal);
		String horario = JOptionPane.showInputDialog("Qual horario da dança?");
		
		String 

	}
	

}
