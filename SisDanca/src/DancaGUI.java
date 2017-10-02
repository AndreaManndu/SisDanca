import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import com.ufpb.sisDanca.DancasDisponiveis;
import com.ufpb.sisDanca.SisDeDanca;

public class DancaGUI extends JFrame {
	private JLabel linha1;
	private JLabel linha2;
	private JButton cadastrar_Aluno;
	private JButton cadastrar_Professor;
	private JButton cadastrar_Dança;
	private JButton pesquisar_Aluno_Por_Dança;
	private JButton pesquisar_Professor;
	// criar os privates do remover
	
	private static DancaGUI frame;
	
	ImageIcon principalImagem = new ImageIcon("./imagens/TangoSilhouette");
	ImageIcon addAlunoImagem = new ImageIcon("./imagens/mais");
	ImageIcon addProfessorImagem = new ImageIcon("./imagens/mais");
	ImageIcon addDancaImagem = new ImageIcon("./imagens/mais");
	ImageIcon pesquisaAlunoImagem = new ImageIcon("./imagens/lupa");
	ImageIcon pesquisaProfessorImagem = new ImageIcon("./imagens/lupa");
	

	SisDeDanca dancaFacade = new SisDeDanca();
		
	public DancaGUI (){
		setTitle("Sistema de Dança");
		setSize(800,600);
		setLocation(150,150);
		setResizable(false);
		
		getContentPane().setBackground(Color.blue);
		linha1= new JLabel("Sistema de Dança",JLabel.CENTER);
		linha1.setForeground(Color.GREEN);
		linha1.setFont(new Font("Serif",Font.ROMAN_BASELINE,24));
		linha2 = new JLabel (principalImagem,JLabel.CENTER);
		cadastrar_Aluno = new JButton ("Cadastrar Aluno",addAlunoImagem);
		cadastrar_Aluno.addActionListener(new DancaAddController(dancaFacade,this));
		cadastrar_Professor = new JButton ( "Cadastrar Professor",addProfessorImagem);
		cadastrar_Professor.addActionListener(new DancaAddController(dancaFacade,this));
		cadastrar_Dança = new JButton ("Cadastrar Dança",addDancaImagem );
		cadastrar_Dança.addActionListener(new DancaAddController(dancaFacade,this));
		pesquisar_Aluno_Por_Dança = new JButton ("Pesquisar Aluno Por Dança",pesquisaAlunoImagem);
		pesquisar_Aluno_Por_Dança.addActionListener(new DancaSearchController(dancaFacade,this));
		pesquisar_Professor = new JButton ("Pesquisar Professor",pesquisaProfessorImagem);
		pesquisar_Professor.addActionListener(new DancaSearchController(dancaFacade,this));
		
		getContentPane().setLayout(new GridLayout(5,2));
		getContentPane().add(linha1);
		getContentPane().add(cadastrar_Aluno);
		getContentPane().add(new JLabel());
		getContentPane().add(cadastrar_Professor);
		getContentPane().add(new JLabel());
		getContentPane().add(cadastrar_Dança);
		getContentPane().add(linha2);
		getContentPane().add(pesquisar_Aluno_Por_Dança);
		getContentPane().add(new JLabel());

		getContentPane().add(pesquisar_Professor);
		//getContentPane().add(new JLabel());
				
		}
		public static DancasDisponiveis leDancas(JFrame janelaPrincipal){
			DancasDisponiveis dancas = DancasDisponiveis.PADRAO;
			while (dancas ==DancasDisponiveis.PADRAO){
				int tipoDeDanca = Integer.parseInt(JOptionPane.showInputDialog("Qual é o tipo da dança? \n1.HIP_HOP.\n2.DANCA_DO_VENTRE.\n3.TANGO.\n4.SALSA.\n5.BALLET.\n6.JAZZ\n7.CONTEPORANEA.\n8.Outro"));
				switch (tipoDeDanca){
				case 1:
					dancas = DancasDisponiveis.HIP_HOP;
					break;
				case 2:
					dancas = DancasDisponiveis.DANCA_DO_VENTRE;
					break;
				case 3:
					dancas = DancasDisponiveis.TANGO;
					break;
				case 4:
					dancas = DancasDisponiveis.SALSA;
					break;
				case 5:
					dancas = DancasDisponiveis.BALLET;
					break;
				case 6:
					dancas = DancasDisponiveis.JAZZ;
					break;
				case 7:
					dancas = DancasDisponiveis.CONTEPORANEA;
					break;
				}
			
			}
			return dancas;
		}
		public static void main (String args[]){
			JFrame janela = new DancaGUI();
			janela.setVisible(true);
			WindowListener fechadorDeJanelaPrincipal = new WindowAdapter(){
				public void windowClosing(WindowEvent e ){
					System.exit(0);
				}
		
			};
			janela.addWindowListener(fechadorDeJanelaPrincipal);
			
			
		}

}
