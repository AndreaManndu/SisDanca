import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.UIManager;
import javax.swing.JButton;

public class InterSobre extends JFrame {

	private JPanel contentPane;
	private static 	InterStudioDance si = new InterStudioDance();


	public InterSobre() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 465, 474);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JLabel lblDesenvolvedoresAndrMandu = new JLabel("Desenvolvedores: Andre\u00E1 Mandu e Wanessa Paiva\r\n  ");
		lblDesenvolvedoresAndrMandu.setEnabled(false);
		lblDesenvolvedoresAndrMandu.setBackground(Color.DARK_GRAY);
		lblDesenvolvedoresAndrMandu.setForeground(Color.RED);
		lblDesenvolvedoresAndrMandu.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblDesenvolvedoresAndrMandu.setBounds(41, 245, 451, 286);
		contentPane.add(lblDesenvolvedoresAndrMandu);
		

		JLabel lblNewLabel = new JLabel("Disciplina: Programa\u00E7\u00E3o Orientada a Objetos");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setForeground(Color.DARK_GRAY);
		lblNewLabel.setBackground(Color.RED);
		lblNewLabel.setBounds(50, 411, 346, 14);
		contentPane.add(lblNewLabel);
		
		ImageIcon ufpb = new ImageIcon("C:/Users/Wanessa Paiva/git/SisDanca/SisDanca/imagens/ufpb.jpg");

		JLabel lbimage = new JLabel(ufpb);
		
		
		lbimage.setBounds(-1, 0, 462, 436);
		contentPane.add(lbimage);
		
		
			
		
		
		
	}
}
