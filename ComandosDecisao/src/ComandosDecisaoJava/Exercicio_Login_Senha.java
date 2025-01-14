package ComandosDecisaoJava;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Exercicio_Login_Senha {
	public static void main(String[] args) {
		
		Scanner objetoLogin = new Scanner(System.in);
		
		System.out.println("Digite o nome de usuário cadastrado: ");
		String nome = objetoLogin.nextLine();// o nextLine pega texto e transformar em texto mesmo e armazenar na variavel login
		
		System.out.println("Digite a senha cadastrada: ");
		String senha = objetoLogin.nextLine();
		
		if(nome.equals("Roger") && (senha.equals("123"))) {
			System.out.printf("Usuario %s logado com sucesso ", nome);
		}else {
			
			System.out.printf("Usuário ou senha inválidos");
			
		}
		
		
		// Eu fiz dessa forma e funcionou perfeitamente validando maiúsculas e minúscula no nome inserido
//		String nome;
//		String senha;
//		
//		nome = JOptionPane.showInputDialog("Digite o nome de usuário cadastrado");
//		senha = JOptionPane.showInputDialog("Digite a senha cadastrada"));
//		
//		nome = nome.toLowerCase();
//		
//		
//		if(nome.equals("roger") && (senha.equals("123")) {
//			System.out.println("Logado com Sucesso");
//		}else {
//			System.out.println("Usuário e senhas informados não conferem com o cadastrado!");
//		}
	}
}
