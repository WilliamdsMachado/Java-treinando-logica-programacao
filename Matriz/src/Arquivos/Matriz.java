package Arquivos;

public class Matriz {
	public static void main(String[] args) {

		// [][] - Matriz - Dentro de uma matriz podemos ter vários arrays
		// [] - Array
		// Matriz é representada por linhas e colunas(rows e Collums)
		// Primeiro índice é as linhas{3]
		// Segundo índice é as colunas[4]
		// Cada linha da matriz é um array
		// Se tiver 8 linhas é 8 Arrays
		int[][] numeros = new int[3][4];

		// Populando a matriz
		// Percorre as linhas
		for (int linha = 0; linha < 3; linha++) {
			// Percorre as colunas
			for (int coluna = 0; coluna < 4; coluna++) {

				// Estou colocando o valor 5 em cada item da matriz
				numeros[linha][coluna] = 5;

			}

		}

		// Imprimindo a matriz
		// Percorre as linhas
		for (int linha = 0; linha < 3; linha++) {
			// Percorre as colunas
			for (int coluna = 0; coluna < 4; coluna++) {

				// Estou colocando o valor 5 em cada item da matriz
				System.out.print(numeros[linha][coluna] + " ");
			}

			System.out.println("");

		}

		// ---------------------------------------------------------

		int linhas = 3;
		int colunas = 4;

		String[][] matrizLetras = new String[linhas][colunas];
		String[] array_1 = { "A", "B", "C", "D" };
		String[] array_2 = { "E", "F", "G", "H" };
		String[] array_3 = { "I", "J", "K", "L" };

		matrizLetras[0] = array_1;
		matrizLetras[1] = array_2;
		matrizLetras[2] = array_3;
		
		System.out.println("");

		for (int linha = 0; linha < linhas; linha++) {
			// Percorre as colunas
			for (int coluna = 0; coluna < colunas; coluna++) {

				// Estou colocando o valor 5 em cada item da matriz
				System.out.print(matrizLetras[linha][coluna] + " ");
			}

			System.out.println("");

		}

	}
}
