package TelasJFrame;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.text.MaskFormatter;

import Classes.DadosAgenda;
import Classes.OperacoesNoBancoDeDados;
import java.awt.Color;

public class Cadastro extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtId;
	private JTextField txtNome;
	private JTextField txtEmail;
	private JTextField txtEndereco;
	public static MaskFormatter txtTelefone;
	public static MaskFormatter txtNascimento;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cadastro frame = new Cadastro();
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
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public Cadastro() {
		setTitle("Cadastrar Dados");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		//Point - Representa o local no espacço de coordenadas x e y
		Point centro = GraphicsEnvironment.getLocalGraphicsEnvironment().getCenterPoint();
		
		int largura = 800;
		int altura = 500;
		
		//Centralizar no meio da tela
		setBounds(centro.x - largura / 2, centro.y - altura / 2, 821, 511 );
		

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ID:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(10, 11, 88, 25);
		contentPane.add(lblNewLabel);
		
		txtId = new JTextField();
		txtId.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtId.setBounds(10, 38, 166, 20);
		txtId.setEnabled(false);
		txtId.setEditable(false);
		contentPane.add(txtId);
		txtId.setColumns(10);
		
		txtNome = new JTextField();
		txtNome.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtNome.setColumns(10);
		txtNome.setBounds(10, 98, 469, 31);
		contentPane.add(txtNome);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNome.setBounds(10, 69, 88, 25);
		contentPane.add(lblNome);
		
		JLabel lblTelefone = new JLabel("Telefone");
		lblTelefone.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblTelefone.setBounds(10, 133, 166, 25);
		contentPane.add(lblTelefone);
		
		JFormattedTextField txtTelefone = new JFormattedTextField(arrumaMascaraTelefone());
		txtTelefone.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtTelefone.setBounds(10, 169, 179, 31);
		contentPane.add(txtTelefone);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblEmail.setBounds(231, 134, 88, 25);
		contentPane.add(lblEmail);
		
		txtEmail = new JTextField();
		txtEmail.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtEmail.setColumns(10);
		txtEmail.setBounds(216, 169, 263, 31);
		contentPane.add(txtEmail);
		
		JLabel lblEndereo = new JLabel("Endereço:");
		lblEndereo.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblEndereo.setBounds(10, 212, 166, 25);
		contentPane.add(lblEndereo);
		
		txtEndereco = new JTextField();
		txtEndereco.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtEndereco.setColumns(10);
		txtEndereco.setBounds(10, 250, 469, 31);
		contentPane.add(txtEndereco);
		
		JLabel lblNascimento = new JLabel("Nascimento:");
		lblNascimento.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNascimento.setBounds(10, 300, 166, 25);
		contentPane.add(lblNascimento);
		
		JFormattedTextField txtNascimento = new JFormattedTextField(arrumaMascaraNascimento());
		txtNascimento.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtNascimento.setBounds(10, 336, 117, 28);
		contentPane.add(txtNascimento);
		
		JLabel lblFilhos = new JLabel("Filhos:");
		lblFilhos.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblFilhos.setBounds(186, 300, 103, 25);
		contentPane.add(lblFilhos);
		
		
		JComboBox comboBox_Filhos = new JComboBox();
		comboBox_Filhos.setModel(new DefaultComboBoxModel(new String[] {"-", "Sim", "Não"}));
		comboBox_Filhos.setBounds(174, 336, 108, 28);
		contentPane.add(comboBox_Filhos);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					DadosAgenda objeto = new DadosAgenda();
					
					objeto.setNome(txtNome.getText());
					objeto.setTelefone(txtTelefone.getText());
					objeto.setEmail(txtEmail.getText());
					objeto.setEndereco(txtEndereco.getText());
					objeto.setNascimento(txtNascimento.getText());
					objeto.setFilhos(comboBox_Filhos.getSelectedItem().toString());
					
					//Instanciando a calsse OperacoesNoBancoDeDados para usar os métodos dela
					OperacoesNoBancoDeDados salvarDados = new OperacoesNoBancoDeDados();
					
					salvarDados.Cadastrar(objeto);
					
					//Fecha o formulário após salvar contato
					dispose();
					
					
				} catch (Exception trata) {
					JOptionPane.showMessageDialog(null, "Erro ao salvar os dados" + trata);
				}
				
			}
		});
		btnSalvar.setMnemonic('S');
		btnSalvar.setIcon(new ImageIcon(Cadastro.class.getResource("/Imagens/salvar.png")));
		btnSalvar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnSalvar.setBounds(585, 53, 138, 42);
		contentPane.add(btnSalvar);
	}
	
	public static MaskFormatter arrumaMascaraTelefone() {
		
			try {
				txtTelefone = new MaskFormatter("(##) #####-#### ");
			} catch (ParseException e) {
				e.printStackTrace();
			}
			
			//Substitui # por _
			txtTelefone.setPlaceholderCharacter('_');
			
			return txtTelefone;
	}
	public static MaskFormatter arrumaMascaraNascimento() {
		
		try {
			txtNascimento = new MaskFormatter("##/##/#### ");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		//Substitui # por _
		txtNascimento.setPlaceholderCharacter('_');
		
		return txtNascimento;
	}
}
