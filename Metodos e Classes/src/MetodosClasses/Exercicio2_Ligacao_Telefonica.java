/*
 Crie um algoritmo com 2 status: Ligar e Desligar. 
 
•	Ao chamar o status Ligar, verifique se Você
 já está em uma ligação e exiba uma mensagem
  de Ligação Iniciada ou Você já está em uma ligação.
  
•	Ao chamar o status Desligar, verifique se 
você já está em uma ligação e exiba uma mensagem
 de Você não pode desligar por que não está em uma
  ligação ou Ligação Encerrada com sucesso.

 */

package MetodosClasses;

public class Exercicio2_Ligacao_Telefonica {

	public static void main(String[] args) {

		//Instanciando para ter acesso a tudo da classe Telefone
		Telefone ligacao = new Telefone();
		
		ligacao.ligar();
		ligacao.ligar();
		ligacao.desligar();
		ligacao.desligar();
		ligacao.desligar();
		ligacao.ligar();
		ligacao.desligar();
		ligacao.ligar();

	}

}
