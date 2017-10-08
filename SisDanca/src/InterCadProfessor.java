import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import com.ufpb.sisDanca.Professor;
import com.ufpb.sisDanca.ProfessorJaExisteException;
import com.ufpb.sisDanca.SisDeDanca;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class InterCadProfessor extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldNome;
	private JTextField textFieldCPF;
	private JTextField textFieldEmail;

	public InterCadProfessor() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nome");
		lblNewLabel.setBounds(10, 21, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("CPF");
		lblNewLabel_1.setBounds(10, 69, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Email");
		lblNewLabel_2.setBounds(10, 118, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		textFieldNome = new JTextField();
		textFieldNome.setBounds(72, 18, 86, 20);
		contentPane.add(textFieldNome);
		textFieldNome.setColumns(10);
		
		textFieldCPF = new JTextField();
		textFieldCPF.setBounds(66, 66, 92, 20);
		contentPane.add(textFieldCPF);
		textFieldCPF.setColumns(10);
		
		textFieldEmail = new JTextField();
		textFieldEmail.setBounds(66, 115, 92, 20);
		contentPane.add(textFieldEmail);
		textFieldEmail.setColumns(10);
		
		JButton btnCadastrar = new JButton("CADASTRAR");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Professor prof = new Professor(textFieldNome.getText(),textFieldCPF.getText(),textFieldEmail.getText());
				SisDeDanca sis = new SisDeDanca();
				try {
					sis.cadastrarProfessor(prof);
				} catch (ProfessorJaExisteException e1) {
				e1.printStackTrace();
				}
				
			}
		});
		btnCadastrar.setBounds(48, 187, 110, 23);
		contentPane.add(btnCadastrar);
	}
}
