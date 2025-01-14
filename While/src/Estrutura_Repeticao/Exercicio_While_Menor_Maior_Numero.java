package Estrutura_Repeticao;

import javax.swing.JOptionPane;

public class Exercicio_While_Menor_Maior_Numero {
	public static void main(String[] args) {
		
		int numeroDigitadoPorUltimo, maior, menor;
		
		numeroDigitadoPorUltimo = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número", "Leia Com Atenção!", JOptionPane.QUESTION_MESSAGE));
		
		menor = numeroDigitadoPorUltimo;
		maior = numeroDigitadoPorUltimo;
		
		while(numeroDigitadoPorUltimo >= 0) {
			System.out.println(numeroDigitadoPorUltimo);
			
			numeroDigitadoPorUltimo = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número", "Leia Com Atenção!", JOptionPane.QUESTION_MESSAGE));
			
			if(numeroDigitadoPorUltimo > maior) {
				maior = numeroDigitadoPorUltimo;
			}
			
			if(numeroDigitadoPorUltimo < menor && numeroDigitadoPorUltimo >=0) {
				menor = numeroDigitadoPorUltimo;
			}
		}
		
		System.out.println("Menor numero: " + menor);
		System.out.println("Maior numero: " + maior);
	}
}
