package EstruturaRepeticao;

import javax.swing.JOptionPane;

public class Exercicio_Do_While_Numeros_De_1_a_5 {

	public static void main(String[] args) {
		
		double numero;
		
		do {
			numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número ", "Leia com Atenção!", JOptionPane.QUESTION_MESSAGE));
			if(numero < 1 || numero > 5) {
				
				System.out.println(numero + " Número inválido ou incorreto tente novamente");
			}
			
		}while(numero <1 || numero > 5);
			System.out.println("Algoritmo Encerrado !");
	}
}
