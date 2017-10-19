import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.ufpb.sisDanca.Aluno;
import com.ufpb.sisDanca.DancasDisponiveis;
import com.ufpb.sisDanca.SisDeDanca;
import com.ufpb.sisDanca.exception.AlunoJaExisteException;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class InterCadAluno extends JFrame {

	private JPanel contentPane;
	private JTextField tfNome;
	private JTextField TFCPF;
	private JLabel lblEmail;
	private JTextField TFEmail;
	private JLabel lblTipoDeDana;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;
	private JButton btnNewButton_4;
	private JButton btnNewButton_5;
	private JButton btnNewButton_6;
	private static 	InterStudioDance telaCad = new InterStudioDance();
	private SisDeDanca sis;



	public InterCadAluno(SisDeDanca sis) {
		this.sis=sis;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 505, 354);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(10, 45, 46, 14);
		contentPane.add(lblNome);
		
		tfNome = new JTextField();
		tfNome.setBounds(58, 42, 125, 20);
		contentPane.add(tfNome);
		tfNome.setColumns(10);
		
		JLabel lblCpf = new JLabel("CPF");
		lblCpf.setBounds(10, 84, 46, 14);
		contentPane.add(lblCpf);
		
		TFCPF = new JTextField();
		TFCPF.setBounds(58, 81, 125, 20);
		contentPane.add(TFCPF);
		TFCPF.setColumns(10);
		
		lblEmail = new JLabel("Email");
		lblEmail.setBounds(10, 128, 46, 14);
		contentPane.add(lblEmail);
		
		TFEmail = new JTextField();
		TFEmail.setBounds(58, 125, 125, 20);
		contentPane.add(TFEmail);
		TFEmail.setColumns(10);
		
		lblTipoDeDana = new JLabel("Tipo de Dan\u00E7a");
		lblTipoDeDana.setBounds(302, 29, 86, 14);
		contentPane.add(lblTipoDeDana);
		
		btnNewButton = new JButton("Hip Hop");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				 cadAluno(tfNome.getText(),TFCPF.getText(),TFEmail.getText(),DancasDisponiveis.HIP_HOP);
				 apagaTexto();
				 
			}
		});
		btnNewButton.setBounds(221, 62, 113, 23);
		contentPane.add(btnNewButton);
		
		btnNewButton_1 = new JButton("Ballet");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cadAluno(tfNome.getText(),TFCPF.getText(),TFEmail.getText(),DancasDisponiveis.BALLET);
				 apagaTexto();
			}
		});
		btnNewButton_1.setBounds(344, 62, 105, 23);
		contentPane.add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("Dan\u00E7a do Ventre");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				cadAluno(tfNome.getText(),TFCPF.getText(),TFEmail.getText(),DancasDisponiveis.DANCA_DO_VENTRE);
				 apagaTexto();
			}
		});
		btnNewButton_2.setBounds(221, 104, 113, 23);
		contentPane.add(btnNewButton_2);
		
		btnNewButton_3 = new JButton("Jazz");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				cadAluno(tfNome.getText(),TFCPF.getText(),TFEmail.getText(),DancasDisponiveis.JAZZ);
				 apagaTexto();
			}
		});
		btnNewButton_3.setBounds(344, 104, 105, 23);
		contentPane.add(btnNewButton_3);
		
		btnNewButton_4 = new JButton("Tango");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				cadAluno(tfNome.getText(),TFCPF.getText(),TFEmail.getText(),DancasDisponiveis.TANGO);
				 apagaTexto();
			}
		});
		btnNewButton_4.setBounds(221, 150, 113, 23);
		contentPane.add(btnNewButton_4);
		
		btnNewButton_5 = new JButton("Contepor\u00E2nea");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				cadAluno(tfNome.getText(),TFCPF.getText(),TFEmail.getText(),DancasDisponiveis.CONTEPORANEA);
				 apagaTexto();
			}
		});
		btnNewButton_5.setBounds(345, 150, 104, 23);
		contentPane.add(btnNewButton_5);
		
		btnNewButton_6 = new JButton("Voltar Menu");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				telaCad.setVisible(true);
				dispose();
			}
		});
		btnNewButton_6.setBounds(299, 238, 104, 23);
		contentPane.add(btnNewButton_6);
	}
	
	public void cadAluno(String nome, String CPF, String email, DancasDisponiveis tipoDanca){
		Aluno a = new Aluno(nome,CPF,email,tipoDanca);
	
		try {
			sis.cadastrarAluno(a);
			JOptionPane.showMessageDialog(null, "Aluno cadastrado na dança "+tipoDanca.toString()+" com sucesso");
		} catch ( AlunoJaExisteException e) {
			e.printStackTrace();
		}
		
	}
	public void apagaTexto(){
		tfNome.setText("");
		TFCPF.setText("");
		TFEmail.setText("");
	}
}
