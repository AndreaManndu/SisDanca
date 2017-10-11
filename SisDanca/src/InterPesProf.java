import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.ufpb.sisDanca.Professor;
import com.ufpb.sisDanca.SisDeDanca;
import com.ufpb.sisDanca.exception.ProfessorInexistenteException;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.ObjectInputStream.GetField;
import java.awt.event.ActionEvent;

public class InterPesProf extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private static SisDeDanca sisP = new SisDeDanca();
	private static InterStudioDance voltar = new InterStudioDance();



	public InterPesProf() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CPF do professor:");
		lblNewLabel.setBounds(61, 20, 119, 17);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(175, 20, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel LBprofessor = new JLabel("");
		LBprofessor.setBounds(21, 150, 403, 67);
		contentPane.add(LBprofessor);
		
		JButton btnPesquisar = new JButton("Pesquisar");
		btnPesquisar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String cpfProf =textField.getText();
				
				try {
					Professor nomeProf = sisP.pesquisaProfessor(cpfProf);
					LBprofessor.setText(nomeProf.toString());
				} catch (ProfessorInexistenteException e1) {
					LBprofessor.setText(e1.getMessage());
					
				}
				
				textField.setText(""); // apaga a caixa de textfield pra poder fazer uma nova pesquisa
				
				
			}
			
		});
		btnPesquisar.setBounds(172, 89, 89, 31);
		contentPane.add(btnPesquisar);
		
		JButton btnVoltarAoMenu = new JButton("Voltar ao Menu Principal");
		btnVoltarAoMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				voltar.setVisible(true);
				dispose();
			}
		});
		btnVoltarAoMenu.setBounds(271, 117, 153, 23);
		contentPane.add(btnVoltarAoMenu);
		
		
	}
}
