package Arquivos;

import javax.swing.JOptionPane;

public class Exercico_Matrizes_1_Imprimir_Somar_Matriz_Diagonal_3_x_3 {
	public static void main(String[] args) {
		
		int[][] numeros = new int[3][3];
		int somaDiagonal = 0;
		
		for(int linha = 0; linha < numeros.length; linha++) {
			for(int coluna = 0; coluna < numeros.length; coluna++) {
				numeros[linha][coluna] = Integer.parseInt(JOptionPane.showInputDialog("Insira um número para a posição [" + linha + "][" + coluna + "]"));			
				System.out.print("|" + numeros[linha][coluna] + "|");
			}
			System.out.println(" ");
		}
		// Imprimindo os números da diagonal principal
        System.out.println("Números na diagonal principal:");
        for(int d = 0; d < numeros.length; d++) {
        	for(int j = 0; j < d; j++) {
                System.out.print("  ");  // Espaços em branco para alinhar
            }
            System.out.println(numeros[d][d]);
            somaDiagonal += numeros[d][d];
        }
        System.out.println("Soma dos números da diagonal principal: " + somaDiagonal);
	}
}
