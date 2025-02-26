package arrayJava;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Exercicio_Array_Ordenacao {
	public static void main(String[] args) {
		
		int qtdVezes = 3;
		int[] arrayNumeros = new int[qtdVezes];
		
		for(int posicao = 0; posicao < qtdVezes; posicao++) {
			
			
			arrayNumeros[posicao] = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro"));
		
		}
		
		System.out.println("Números na ordem digitada\n");
		
		for (int posicao : arrayNumeros) {
			
			System.out.println(posicao);
			
		}
		
		//-----------------------------------------------
		
		System.out.println("Números na ordem crescente\n");
		
		//sort - Método para organizar os números em ordem crescente
		Arrays.sort(arrayNumeros);
		
		for (int posicao : arrayNumeros) {
			
			System.out.println(posicao);
			
		}
		
	}
}
