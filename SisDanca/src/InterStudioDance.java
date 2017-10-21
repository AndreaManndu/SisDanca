import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.ufpb.sisDanca.Aluno;
import com.ufpb.sisDanca.Professor;
import com.ufpb.sisDanca.SisDeDanca;
import com.ufpb.sisDanca.exception.AlunoInexistenteException;
import com.ufpb.sisDanca.exception.ProfessorInexistenteException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;

public class InterStudioDance extends JFrame {

	private JPanel contentPane;
	private static InterPesAluno1 pa = new InterPesAluno1();
	
	
	private static SisDeDanca sisDanca = new SisDeDanca();


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterStudioDance frame = new InterStudioDance();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public InterStudioDance() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 648, 488);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Cadastrar Aluno");
		btnNewButton.addActionListener(new ActionListener() {
			// passar como parametro o sistema
			InterCadAluno telaCad = new InterCadAluno(sisDanca);
			public void actionPerformed(ActionEvent arg0) {
				telaCad.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setBounds(378, 11, 222, 59);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Cadastrar Professor");
		btnNewButton_1.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e){
				InterCadProf as = new InterCadProf(sisDanca);
			
				
				as.setVisible(true);
				dispose();
				
			}
		});
		
		btnNewButton_1.setBounds(378, 88, 222, 59);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Remover Professor");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String cpf = JOptionPane.showInputDialog("Informe o CPF do professor a ser removido: ");
				try {
					Professor a = sisDanca.removerProfessor(cpf);
					JOptionPane.showMessageDialog(null, "O professor "+ a.getNome()+ " foi removido");
				} catch (ProfessorInexistenteException e1) {
					JOptionPane.showMessageDialog(null,e1.getMessage());
					
				}
				
				
			}
		});
		btnNewButton_2.setBounds(378, 380, 222, 59);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Pesquisar Aluno Por Dan\u00E7a");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pa.setVisible(true);
				dispose();
				
			}
		});
		btnNewButton_3.setBounds(378, 170, 222, 59);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Remover Aluno");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String cpf = JOptionPane.showInputDialog("Informe o CPF do aluno a ser removido");
				try {
					Aluno a = sisDanca.removerAluno(cpf);
					JOptionPane.showMessageDialog(null, "O aluno "+ a.getNome()+ " foi removido");
				} catch (AlunoInexistenteException e1) {
					JOptionPane.showMessageDialog(null,e1.getMessage());
					
				}
				
				
			}
		});
		btnNewButton_4.setBounds(378, 322, 222, 48);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("Pesquisar Professor");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				InterPesProf p = new InterPesProf(sisDanca);
				p.setVisible(true);
				dispose();
				
			}
		});
		btnNewButton_5.setBounds(378, 252, 222, 48);
		contentPane.add(btnNewButton_5);
		
		JLabel lblSt = new JLabel("Sistema Studio Dance");
		lblSt.setFont(new Font("Tempus Sans ITC", Font.BOLD, 14));
		lblSt.setForeground(new Color(0, 0, 0));
		lblSt.setBounds(107, 24, 202, 31);
		contentPane.add(lblSt);
		
		ImageIcon img = new ImageIcon("imagens/silhuetas-de-muitas-pessoas-danca_1048-1573.jpg");
		
		JLabel lbImg = new JLabel(img);
		lbImg.setBounds(0, 0, 405, 383);
		contentPane.add(lbImg);
		JButton BTAbout = new JButton("About");
		BTAbout.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				InterSobre in = new InterSobre ();
				in.setVisible(true);
			}
		});
		BTAbout.setBounds(24, 398, 89, 23);
		contentPane.add(BTAbout);
		JButton btnSair = new JButton("Sair");
		
		btnSair.addActionListener(new ActionListener(){
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Gravador gravador= new Gravador();
				try {
					
					gravador.gravar2(sisDanca.getAlunos(), "alunos.dat");
				} catch (IOException e1) {
					JOptionPane.showMessageDialog(null, "erro "+e1.getMessage());
				}
				
				try {
					gravador.gravar2(sisDanca.getProfessores(), "professores.dat");
				} catch (IOException e1) {
					JOptionPane.showMessageDialog(null, e1.getMessage());
				}
				
				dispose();
			}
		});
		btnSair.setBounds(123, 398, 89, 23);
		contentPane.add(btnSair);
		
		
		
		
		
		
		
	}
}
