package ComandosDecisaoJava;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Exercicio_Switch_Calculadora {
	public static void main(String[] args) {
		
		int n1, n2, resultado;
		int opcao;
		
		
		opcao = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite umas das opções a seguir: \n 1 - Adição \n 2 - Subtração \n 3 - Multiplicação \n 4 - Divisão\n", "Leia com atenção" , JOptionPane.QUESTION_MESSAGE));
		
		n1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o primeiro número: ", "Exercicio Java", JOptionPane.QUESTION_MESSAGE));

		n2 = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o segundo número: ", "Exercicio Java", JOptionPane.QUESTION_MESSAGE));

				
		switch(opcao) {
		
			case 1:
				resultado = n1 + n2;
				System.out.printf("%d + %d = %d", n1, n2, resultado);
			break;

			case 2:
				resultado = n1 - n2;
				System.out.printf("%d - %d = %d", n1, n2, resultado);
			break;

			case 3:
				resultado = n1 * n2;
				System.out.printf("%d * %d = %d", n1, n2, resultado);
			break;
			
			case 4:
				resultado = n1 / n2;
				System.out.printf("%d * %d = %d", n1, n2, resultado);
			break;

			default:
				System.out.println("Opcao Inválida");
			break;
		}
	}
}
