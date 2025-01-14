package TelasJFrame;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.GraphicsEnvironment;
import java.awt.Point;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.util.Iterator;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import Classes.DadosAgenda;
import Classes.OperacoesNoBancoDeDados;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Pesquisa extends JFrame {

	private JPanel contentPane;
	private JTextField txtConsulta;
	private JTextField txtQuantidadeItens;
	private JTable tabelaAgenda;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pesquisa frame = new Pesquisa();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Pesquisa() {
		setFont(new Font("Tahoma", Font.PLAIN, 22));
		setTitle("Pesquisa");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		//Point - Representa o local no espacço de coordenadas x e y
		Point centro = GraphicsEnvironment.getLocalGraphicsEnvironment().getCenterPoint();
		
		int largura = 800;
		int altura = 500;
		
		//Centralizar no meio da tela
		setBounds(centro.x - largura / 2, centro.y - altura / 2, 817, 506 );
		

		setContentPane(contentPane);
		
		JButton btnNovo = new JButton("Novo");
		btnNovo.setBounds(624, 11, 167, 33);
		btnNovo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Cadastro abreTela = new Cadastro();
				
				abreTela.setVisible(true);
				
			}
		});
		contentPane.setLayout(null);
		btnNovo.setIcon(new ImageIcon(Pesquisa.class.getResource("/Imagens/novo.png")));
		btnNovo.setMnemonic('N');
		btnNovo.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(btnNovo);
		
		JLabel lblNewLabel = new JLabel("Digite algo para pesquisar");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(10, 11, 249, 33);
		contentPane.add(lblNewLabel);
		
		txtConsulta = new JTextField();
		txtConsulta.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				
				String nome = "%" + txtConsulta.getText() + "%";
				
				OperacoesNoBancoDeDados itens = new OperacoesNoBancoDeDados();
				
				List<DadosAgenda> itensLista = itens.FiltrarDados(nome);
				
				DefaultTableModel dados = (DefaultTableModel) tabelaAgenda.getModel();
				
				//Limpa os dados da tabela
				dados.setNumRows(0);
				
				for (DadosAgenda linha : itensLista) {
					
					dados.addRow(new Object[] {
						
						linha.getId(),
						linha.getNome(),
						linha.getTelefone(),
						linha.getEmail(),
						linha.getEndereco(),
						linha.getNascimento(),
						linha.getFilhos()
							
					});
				}
				
				contarLinhasTabela();
				
			}
		});
		txtConsulta.setFont(new Font("Tahoma", Font.PLAIN, 26));
		txtConsulta.setBounds(10, 48, 508, 43);
		contentPane.add(txtConsulta);
		txtConsulta.setColumns(10);
		
		txtQuantidadeItens = new JTextField();
		txtQuantidadeItens.setFont(new Font("Tahoma", Font.PLAIN, 26));
		txtQuantidadeItens.setBounds(10, 116, 404, 43);
		contentPane.add(txtQuantidadeItens);
		txtQuantidadeItens.setColumns(10);
		txtQuantidadeItens.setBorder(new LineBorder(Color.white, 1));
		txtQuantidadeItens.setBackground(new Color(255,255,255));
		txtQuantidadeItens.setEditable(false);
		
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 170, 781, 286);
		contentPane.add(scrollPane);
		
		tabelaAgenda = new JTable();
		
		scrollPane.setViewportView(tabelaAgenda);
		
		tabelaAgenda.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"ID", "Nome", "Telefone", "Email", "Endereco", "Nascimento", "Filhos"
			}
		));
		
		//Estou aumentandoo a largura da linha
		tabelaAgenda.setRowHeight(30);
		
		JButton btnNovo_1 = new JButton("Exportar");
		btnNovo_1.setIcon(new ImageIcon(Pesquisa.class.getResource("/Imagens/excel.png")));
		btnNovo_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNovo_1.setMnemonic('N');
		btnNovo_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNovo_1.setBounds(624, 99, 167, 43);
		contentPane.add(btnNovo_1);
		
		JButton btnNovo_1_1 = new JButton("Excluir");
		btnNovo_1_1.setIcon(new ImageIcon(Pesquisa.class.getResource("/Imagens/excluir.png")));
		btnNovo_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNovo_1_1.setMnemonic('N');
		btnNovo_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNovo_1_1.setBounds(624, 55, 167, 36);
		contentPane.add(btnNovo_1_1);
		
		//Desabilitando a seleção da célula da tabela quando der um duplo clique
		tabelaAgenda.setDefaultEditor(Object.class, null);
		
		carregarItens();
	}
	
	//Metodo para carregar as informacoes
	public void carregarItens() {
		//Instanciando para poder usar ter acesso a todos os itens métodos da classe total
		OperacoesNoBancoDeDados itens = new OperacoesNoBancoDeDados();
		 List<DadosAgenda> itensLista = itens.listarItens();
		 
		 //Criando objeto que vai passar os dados da lista para a tabela
		 DefaultTableModel dados = (DefaultTableModel) tabelaAgenda.getModel();
		
		 //Limpoar os dados da tabela
		 dados.setNumRows(0);
		 
		 for(DadosAgenda linha : itensLista) {
			 //Em cada linha estamos transformando o objeto pegando o itens das colunas 
			 dados.addRow(new Object[] {
				 
				 linha.getId(),
				 linha.getNome(),
				 linha.getTelefone(),
				 linha.getEmail(),
				 linha.getEndereco(),
				 linha.getNascimento(),
				 linha.getFilhos()
				 
			 });
		 }
		 
		 tabelaAgenda.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		 
		 tabelaAgenda.getColumnModel().getColumn(0).setPreferredWidth(50);//ID
		 tabelaAgenda.getColumnModel().getColumn(1).setPreferredWidth(200);//Nome
		 tabelaAgenda.getColumnModel().getColumn(2).setPreferredWidth(200);//Telefone
		 tabelaAgenda.getColumnModel().getColumn(3).setPreferredWidth(300);//Email
		 tabelaAgenda.getColumnModel().getColumn(4).setPreferredWidth(200);//Endereco
		 tabelaAgenda.getColumnModel().getColumn(5).setPreferredWidth(150);//Nascimento
		 tabelaAgenda.getColumnModel().getColumn(6).setPreferredWidth(100);//Filhos
		 
		 
		 contarLinhasTabela();
	}
	
	public void contarLinhasTabela() {
		
		int qtdLinhas = 0;
		
		//For - para
		qtdLinhas = tabelaAgenda.getRowCount();
		
		txtQuantidadeItens.setText("Total de registros: "+ qtdLinhas);
	}
}
