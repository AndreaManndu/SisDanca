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

import com.ufpb.sisDanca.Danca;
import com.ufpb.sisDanca.DancasDisponiveis;
import com.ufpb.sisDanca.SisDeDanca;

public class DancaGUI extends JFrame {
	private JLabel linha1;
	private JButton cadastrar_Aluno;
	private JButton cadastrar_Professor;

	private JButton pesquisar_Aluno_Por_Dança;
	private JButton pesquisar_Professor;
	private JButton remover_Aluno;
	private JButton remover_Professor;
	
	private static DancaGUI frame;
	
	ImageIcon principalImagem = new ImageIcon("./imagens/TangoSilhouette");
	ImageIcon addAlunoImagem = new ImageIcon("./imagens/mais");
	ImageIcon addProfessorImagem = new ImageIcon("./imagens/mais");
	ImageIcon pesquisaAlunoImagem = new ImageIcon("./imagens/lupa");
	ImageIcon pesquisaProfessorImagem = new ImageIcon("./imagens/lupa");
	ImageIcon removerAlunoImagem = new ImageIcon();
	ImageIcon removerProfessorImagem = new ImageIcon();

	SisDeDanca dancaFacade = new SisDeDanca();
	
		
	public DancaGUI (){
		setTitle("Sistema de Dança");
		setSize(800,600);
		setLocation(150,150);
		setResizable(false);
		
		getContentPane().setBackground(Color.blue);
		linha1= new JLabel("Sistema de Dança",JLabel.CENTER);
		linha1.setBounds(0, 91, 397, 95);
		linha1.setForeground(Color.GREEN);
		linha1.setFont(new Font("Serif",Font.ROMAN_BASELINE,24));
		cadastrar_Aluno = new JButton ("Cadastrar Aluno",addAlunoImagem);
		cadastrar_Aluno.setBounds(397, 1, 397, 95);
		cadastrar_Aluno.addActionListener(new DancaAddController1(dancaFacade,this));
		cadastrar_Professor = new JButton ( "Cadastrar Professor",addProfessorImagem);
		cadastrar_Professor.setBounds(397, 96, 397, 95);
		cadastrar_Professor.addActionListener(new DancaAddController(dancaFacade,this));
		pesquisar_Aluno_Por_Dança = new JButton ("Pesquisar Aluno Por Dança",pesquisaAlunoImagem);
		pesquisar_Aluno_Por_Dança.setBounds(397, 191, 397, 95);
		pesquisar_Aluno_Por_Dança.addActionListener(new DancaSearchController(dancaFacade,this));
		pesquisar_Professor = new JButton ("Pesquisar Professor",pesquisaProfessorImagem);
		pesquisar_Professor.setBounds(397, 286, 397, 95);
		pesquisar_Professor.addActionListener(new DancaSearchController1(dancaFacade,this));
		remover_Aluno = new JButton ("Remover Aluno",removerAlunoImagem);
		remover_Aluno.setBounds(397, 381, 397, 95);
		remover_Aluno.addActionListener(new DancaRemoveController(dancaFacade, this));
		remover_Professor = new JButton("Remover Professor", removerProfessorImagem);
		remover_Professor.setBounds(397, 476, 397, 95);
		remover_Professor.addActionListener(new DancaRemoveController1(dancaFacade, this));
		getContentPane().setLayout(null);
		getContentPane().add(linha1);
		getContentPane().add(cadastrar_Aluno);
		getContentPane().add(cadastrar_Professor);
		getContentPane().add(pesquisar_Aluno_Por_Dança);
		getContentPane().add(pesquisar_Professor);
		JLabel label_2 = new JLabel();
		label_2.setBounds(0, 381, 397, 95);
		getContentPane().add(label_2);
		getContentPane().add(remover_Aluno);
		JLabel label_3 = new JLabel();
		label_3.setBounds(0, 476, 397, 95);
		getContentPane().add(label_3);
		getContentPane().add(remover_Professor);
		
		JLabel labImg = new JLabel(principalImagem);
		labImg.setBounds(0, 1, 397, 570);
		getContentPane().add(labImg);
				
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
		
		public static Danca leMensalidade(JFrame janelaPrincipal){
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
			String dataDeEntrada = JOptionPane.showInputDialog("Digite sua data de entrada na academia:");
			Danca dancaEMensalidade = new Danca(dancas, dataDeEntrada, 0);
			dancaEMensalidade.valorMensalidade();	
			
			return dancaEMensalidade;
		}
		
		public static Danca leHorario(JFrame janelaPrincipal){
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
			String dataDeEntrada = JOptionPane.showInputDialog("Digite sua data de entrada na academia:");
			Danca dancaEMensalidade = new Danca(dancas, dataDeEntrada, 0);
			dancaEMensalidade.Horario();	
			
			return dancaEMensalidade;
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
