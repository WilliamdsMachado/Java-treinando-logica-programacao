/*
 * Numeros impares
 */
package EstruturaRepeticao;

import javax.swing.JOptionPane;

public class Exercicio_For_Numeros_Impares {

	public static void main(String[] args) {
		
		int numero;
		
		numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número positivo maior que 1: ", "Leia com Atenção", JOptionPane.QUESTION_MESSAGE));
	
		for(int contador = 1; contador <= numero; contador++) {
			
			if(contador %2 == 1) {// colocando 1 será ímpar se colocar 1 verifica números ímpar
				System.out.println("Impar: " + contador);
			}
		}
	}
}
