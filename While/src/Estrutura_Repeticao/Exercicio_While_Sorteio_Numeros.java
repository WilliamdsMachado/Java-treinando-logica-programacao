package Estrutura_Repeticao;

import java.util.Random;

import javax.swing.JOptionPane;

public class Exercicio_While_Sorteio_Numeros {
	 public static void main(String[] args) {
		// Gera números Aleatórios
		 Random gerador = new Random();

		 boolean acertou = false;
		 int palpite, tentativas = 0;
		 
		 int numero = gerador.nextInt(101);
		 
		 System.out.println("Numero sorteado: " + numero);
		 
		 while(acertou == false) {
			 
			 palpite = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número entre 0 e 100", "Leia com Atenção!",JOptionPane.QUESTION_MESSAGE));
			 
			 //sempre acrescenta 1
			 tentativas++;
			 
			 if(palpite == numero) {
				 
				 System.out.println("Acertou em " +  tentativas + "Tentativas!");
				 acertou = true;
				 
			 }else if(palpite > numero) {
				 
				 System.out.println("O numero digitado é Maior  que " + numero);
				 
			 }else {
				
				 System.out.println("O numero digitado é Menor que " + numero);

				 
			 }
			 
		 }
		 
	}
}
