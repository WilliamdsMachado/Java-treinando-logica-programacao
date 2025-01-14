package Classes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class OperacoesNoBancoDeDados {

	//Atributo
	private Connection conexao;
	
	public OperacoesNoBancoDeDados() {
		
		//O nosso atributo conexao vai receber uma nova conexão com o BD
		//Quando eu chamar  a OperacoesNoBancoDeDados primeiramente vai receber uma nova conexao, vai conectar pra gente
		//Depois disso vamos ter um método para cadastrar que estará logo abaixo deste construtor
		this.conexao = new ConectarAoBancoDeDados().getConnection();
	}
	
	//Para iniciar este método precisamos de outra classe informando quais dados vamos cadastrar no banco de dados
	// e os tipos de dados que queremos cadastrar no banco de dados então criamos a classe DadosAgenda
	public void Cadastrar(DadosAgenda objeto) {
		try {
			//Insert = Inserir
			//tabela-cadastro - tabela do banco de dados
			//values - valores
			//Insira na tabela casdastro esses valores em cada colunas
			String informacoesSql = "insert into tabela_cadastro(nome, telefone, email, endereco, nascimento, filhos)"
					+ "values(?,?,?,?,?,?)";
			
			
				//Preparando / Tratando a execução dos comandos SQL
			
				PreparedStatement gravarInformacao = conexao.prepareStatement(informacoesSql);
				
				gravarInformacao.setString(1, objeto.getNome());
				gravarInformacao.setString(2, objeto.getTelefone());
				gravarInformacao.setString(3, objeto.getEmail());
				gravarInformacao.setString(4, objeto.getEndereco());
				gravarInformacao.setString(5, objeto.getNascimento());
				gravarInformacao.setString(6, objeto.getFilhos());
				
				//Executa os comandos SQL
				gravarInformacao.execute();
				
				gravarInformacao.close();
				
				JOptionPane.showMessageDialog(null, "Dados Cadastrados com sucesso!");
				
				
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Erro ao salvar os dados!");
		}
	}
	
	//Metodo para listar todos os registros da agenda
	public List<DadosAgenda> listarItens() {
		
		try {
			
			List<DadosAgenda> lista = new ArrayList<>();
			
			//Select - Selecione
			//From - De / Da
			String sqlBancoDados = "Select * from tabela_cadastro ";
			
			//Preparando / Tratando a execução dos comandos SQL
			
			PreparedStatement lerInformacao = conexao.prepareStatement(sqlBancoDados);
			
			//A variavel resultado vai receber o resultado da execução da query
			ResultSet resultado = lerInformacao.executeQuery(); 
			
			//while - Enquanto
			//Enquanto existir o próximo item faça a condição do while
			while(resultado.next()) {
				
				DadosAgenda linha = new DadosAgenda();
				
				linha.setId(resultado.getInt("id"));
				linha.setNome(resultado.getString("nome"));
				linha.setTelefone(resultado.getString("telefone"));
				linha.setEmail(resultado.getString("email"));
				linha.setEndereco(resultado.getString("endereco"));
				linha.setNascimento(resultado.getString("nascimento"));
				linha.setFilhos(resultado.getString("filhos"));
				
				lista.add(linha);
				
			}
			
			return lista;
			
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Erro ao carregar os Dados: " + e);
		}
		
		return null;
	}

	public List<DadosAgenda> FiltrarDados(String nome) {
		
try {
			
			List<DadosAgenda> lista = new ArrayList<>();
			
			//Select - Selecione
			//From - De / Da
			//like - valor aproximado
			//selecione na minha tabela cadastro onde na coluna de nome siginifica valor aproximado e vou receber no  ? que é o parametro para valor no BD
			String sqlBancoDados = "Select * from tabela_cadastro where nome like ?";
			
			//Preparando / Tratando a execução dos comandos SQL
			
			PreparedStatement lerInformacao = conexao.prepareStatement(sqlBancoDados);
			
			lerInformacao.setString(1, nome);
			
			//A variavel resultado vai receber o resultado da execução da query
			ResultSet resultado = lerInformacao.executeQuery(); 
			
			//while - Enquanto
			//Enquanto existir o próximo item faça a condição do while
			while(resultado.next()) {
				
				DadosAgenda linha = new DadosAgenda();
				
				linha.setId(resultado.getInt("id"));
				linha.setNome(resultado.getString("nome"));
				linha.setTelefone(resultado.getString("telefone"));
				linha.setEmail(resultado.getString("email"));
				linha.setEndereco(resultado.getString("endereco"));
				linha.setNascimento(resultado.getString("nascimento"));
				linha.setFilhos(resultado.getString("filhos"));
				
				lista.add(linha);
				
			}
			
			return lista;
			
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Erro ao carregar os Dados: " + e);
		}
		
		return null;
	}
}
