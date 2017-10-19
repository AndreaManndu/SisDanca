import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import com.ufpb.sisDanca.Professor;
import com.ufpb.sisDanca.SisDeDanca;
import com.ufpb.sisDanca.exception.ProfessorJaExisteException;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class InterCadProf extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldNome;
	private JTextField textFieldCPF;
	private JTextField textFieldEmail;
	private SisDeDanca sis;
	public InterCadProf(SisDeDanca sis) {
		this.sis=sis;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nome");
		lblNewLabel.setBounds(20, 42, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("CPF");
		lblNewLabel_1.setBounds(20, 102, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Email");
		lblNewLabel_2.setBounds(20, 165, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		textFieldNome = new JTextField();
		textFieldNome.setBounds(92, 39, 86, 20);
		contentPane.add(textFieldNome);
		textFieldNome.setColumns(10);
		
		textFieldCPF = new JTextField();
		textFieldCPF.setBounds(92, 99, 92, 20);
		contentPane.add(textFieldCPF);
		textFieldCPF.setColumns(10);
		
		textFieldEmail = new JTextField();
		textFieldEmail.setBounds(92, 162, 92, 20);
		contentPane.add(textFieldEmail);
		textFieldEmail.setColumns(10);
		
		JButton btnCadastrar = new JButton("CADASTRAR");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Professor prof = new Professor(textFieldNome.getText(),textFieldCPF.getText(),textFieldEmail.getText());
				
				try {
					sis.cadastrarProfessor(prof);
					JOptionPane.showMessageDialog(null, "Professor cadastrado com sucesso");
				} catch (ProfessorJaExisteException e1) {
				e1.printStackTrace();
				}
				textFieldNome.setText("");
				textFieldCPF.setText("");
				textFieldEmail.setText("");
				
			}
		});
		btnCadastrar.setBounds(253, 77, 110, 23);
		contentPane.add(btnCadastrar);
		
		JButton btnNewUtton = new JButton("Voltar menu");
		btnNewUtton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				InterStudioDance si = new InterStudioDance();
				si.setVisible(true);
				dispose();
				
			}
		});
		btnNewUtton.setBounds(253, 130, 110, 23);
		contentPane.add(btnNewUtton);
	}
}
