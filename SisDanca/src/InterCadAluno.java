import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class InterCadAluno extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JLabel lblEmail;
	private JTextField textField_2;
	private JLabel lblTipoDeDana;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;
	private JButton btnNewButton_4;
	private JButton btnNewButton_5;
	private JButton btnNewButton_6;

	public InterCadAluno() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 505, 354);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(28, 45, 46, 14);
		contentPane.add(lblNome);
		
		textField = new JTextField();
		textField.setBounds(110, 42, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblCpf = new JLabel("CPF");
		lblCpf.setBounds(28, 84, 46, 14);
		contentPane.add(lblCpf);
		
		textField_1 = new JTextField();
		textField_1.setBounds(110, 81, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		lblEmail = new JLabel("Email");
		lblEmail.setBounds(28, 128, 46, 14);
		contentPane.add(lblEmail);
		
		textField_2 = new JTextField();
		textField_2.setBounds(110, 125, 86, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		lblTipoDeDana = new JLabel("Tipo de Dan\u00E7a");
		lblTipoDeDana.setBounds(302, 29, 86, 14);
		contentPane.add(lblTipoDeDana);
		
		btnNewButton = new JButton("New button");
		btnNewButton.setBounds(230, 62, 89, 23);
		contentPane.add(btnNewButton);
		
		btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setBounds(360, 62, 89, 23);
		contentPane.add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("New button");
		btnNewButton_2.setBounds(230, 104, 89, 23);
		contentPane.add(btnNewButton_2);
		
		btnNewButton_3 = new JButton("New button");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton_3.setBounds(360, 104, 89, 23);
		contentPane.add(btnNewButton_3);
		
		btnNewButton_4 = new JButton("New button");
		btnNewButton_4.setBounds(230, 150, 89, 23);
		contentPane.add(btnNewButton_4);
		
		btnNewButton_5 = new JButton("New button");
		btnNewButton_5.setBounds(360, 150, 89, 23);
		contentPane.add(btnNewButton_5);
		
		btnNewButton_6 = new JButton("Voltar Menu");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				InterfaceStudioDance telaCad = new InterfaceStudioDance();
				telaCad.setVisible(true);
				dispose();
			}
		});
		btnNewButton_6.setBounds(299, 238, 104, 23);
		contentPane.add(btnNewButton_6);
	}
}
