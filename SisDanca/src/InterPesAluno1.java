import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.ufpb.sisDanca.Aluno;
import com.ufpb.sisDanca.DancasDisponiveis;
import com.ufpb.sisDanca.SisDeDanca;
import com.ufpb.sisDanca.exception.AlunoInexistenteException;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.List;
import java.awt.event.ActionEvent;

public class InterPesAluno1 extends JFrame {

	private JPanel contentPane;
	private static SisDeDanca sis = new SisDeDanca();


	public InterPesAluno1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Alunos a ser pesquisado na Dan\u00E7a:");
		lblNewLabel.setBounds(107, 34, 257, 28);
		contentPane.add(lblNewLabel);

		JButton btnNewButton = new JButton("Hip Hop");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				exibeListaAlunos(DancasDisponiveis.HIP_HOP);

			}
		});
		btnNewButton.setBounds(22, 94, 99, 23);
		contentPane.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("Jazz");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				exibeListaAlunos(DancasDisponiveis.JAZZ);
			}
		});
		btnNewButton_1.setBounds(22, 154, 99, 23);
		contentPane.add(btnNewButton_1);

		JButton btnNewButton_2 = new JButton("Dan\u00E7a do Ventre");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				exibeListaAlunos(DancasDisponiveis.DANCA_DO_VENTRE);
				
			}
		});
		btnNewButton_2.setBounds(147, 94, 113, 23);
		contentPane.add(btnNewButton_2);

		JButton btnNewButton_3 = new JButton("Tango");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				exibeListaAlunos(DancasDisponiveis.TANGO);
			}
		});
		btnNewButton_3.setBounds(147, 154, 113, 23);
		contentPane.add(btnNewButton_3);

		JButton btnNewButton_4 = new JButton("Ballet");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				exibeListaAlunos(DancasDisponiveis.BALLET);
			}
		});
		btnNewButton_4.setBounds(291, 94, 105, 23);
		contentPane.add(btnNewButton_4);

		JButton btnNewButton_5 = new JButton("Conteor\u00E2nea");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				exibeListaAlunos(DancasDisponiveis.CONTEPORANEA);
			}
		});
		btnNewButton_5.setBounds(291, 154, 105, 23);
		contentPane.add(btnNewButton_5);

		JButton btnNewButton_6 = new JButton("voltar ao Menu");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				InterStudioDance voltaM = new InterStudioDance();
				voltaM.setVisible(true);
				dispose();
			}
		});
		btnNewButton_6.setBounds(276, 228, 120, 23);
		contentPane.add(btnNewButton_6);

	}

	public void exibeListaAlunos(DancasDisponiveis dancas) {
		List<Aluno> alunosPorDanca;
		try {
			alunosPorDanca = sis.pesquisaAlunosPorDanca(dancas);
			if (alunosPorDanca.size()==0){
				JOptionPane.showMessageDialog(null, "Nenhum aluno foi encontrado");
			}
			for (Aluno a : alunosPorDanca) {
				JOptionPane.showMessageDialog(null, "Aluno encontrado " + a.toString());
			}
		} catch (AlunoInexistenteException e) {
			JOptionPane.showMessageDialog(null,e.getMessage());

		}

	}

}
