import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;

public class InterfaceStudioDance extends JFrame {

	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfaceStudioDance frame = new InterfaceStudioDance();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public InterfaceStudioDance() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 681, 479);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Cadastrar Aluno");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				InterCadAluno telaCad = new InterCadAluno();
				telaCad.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setBounds(212, 0, 222, 59);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Cadastrar Professor");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				InterCadProfessor as = new InterCadProfessor();
				as.setVisible(true);
				
			}
		});
		
		btnNewButton_1.setBounds(212, 58, 222, 59);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Remover Professor");
		btnNewButton_2.setBounds(212, 254, 222, 59);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Pesquisar Aluno Por Dan\u00E7a");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_3.setBounds(212, 107, 222, 59);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Remover Aluno");
		btnNewButton_4.setBounds(212, 208, 222, 48);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("Pesquisar Professor");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton_5.setBounds(212, 161, 222, 48);
		contentPane.add(btnNewButton_5);
		
		JLabel lblSt = new JLabel("Sistema Studio Dance");
		lblSt.setFont(new Font("Tempus Sans ITC", Font.BOLD, 14));
		lblSt.setForeground(new Color(0, 0, 0));
		lblSt.setBounds(21, 0, 202, 31);
		contentPane.add(lblSt);
		
		ImageIcon img = new ImageIcon("C:/Users/Wanessa Paiva/git/SisDanca/SisDanca/imagens/silhuetas-de-muitas-pessoas-danca_1048-1573.jpg");
		
		JLabel lbImg = new JLabel(img);
		lbImg.setBounds(0, 0, 211, 313);
		contentPane.add(lbImg);
		
		
		
		
		
		
	}
}
