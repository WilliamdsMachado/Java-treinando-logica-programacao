package arrayJava;

import java.util.Arrays;
import java.util.Iterator;

public class Array_Aula_2 {
	public static void main(String[] args) {
		
		//final é uma constante / fixo e pode ser usado em diversas partes
		final int tamanho = 3;
		
		/*
	 	Array é semelhante a criação de várias variáveis
	 	ele faz a mesma coisa / função
	 	
	 	[ ] - siginifica que estou criando um array quando o java encontrar os conchetes ele vai entende que é um array
	 	new - siginifica que vou instanciar da classe int
	*/
		
		int[] precos = new int[tamanho];
		
		precos [0] = 18;
		precos [1] = 45;
		precos [2] = 90;
		
		System.out.println("Imprimindo Array de preços");
		
		//for - length retorna o tamanho do array
		//esse for está falando que vai repetir até quando a posicao for menor que tamaho do array precos
		// Length - Atributo do array que vai retornar o tamanho do array precos Ex até 3 posições que é fixa(final).
		for(int posicao = 0; posicao < precos.length; posicao++) {
			
			System.out.println("Preco: " + posicao + " : " + precos[posicao]);
		}
		
		//---------------------------------------------------------------------------
		
		String[] letras = {"A", "B", "C", "D", "E", "F", "G", "H"};
		
		System.out.println("\n\n>>>>---For Array Letras ---<<<< ");
		
		//For utilizado como uma opção para ler itens do Array
		// for(tipo do array  String | Variavel linha | e a referencia a qual array que no caso do nome do array após os 2 pontos : letras)
		for (String linha : letras) {
			
			System.out.println(linha);
			
		}
		
		//---------------------------------------------------------------------------
		
		int[] numeros = {18, 22, 37, 44, 51, 67, 78, 86, 91, 150};
				
		System.out.println("\n\n>>>>---For Array Numeros ---<<<< ");
				
		//For utilizado como uma opção para ler itens do Array
		// for(tipo do array  String | Variavel linha | e a referencia a qual array que no caso do nome do array após os 2 pontos : letras)
		for (int linha : numeros) {
					
			System.out.println(linha);
					
		}
		
		//------------------------------------------------------------
		
		//fill - preenche os arrays com um valor pre-determinado
		Arrays.fill(numeros, 5);
		
		System.out.println("\n\n>>>>---For Array fill ---<<<< ");
		
		//For utilizado como uma opção para ler itens do Array
		// for(tipo do array  String | Variavel linha | e a referencia a qual array que no caso do nome do array após os 2 pontos : letras)
		for (int linha : numeros) {
					
			System.out.println(linha);
					
		}
		
		
		//------------------------------------------------------------
		
		//fill - preenche os arrays com um valor pre-determinado
		Arrays.fill(letras, "W");
				
		System.out.println("\n\n>>>>---For Array fill ---<<<< ");
				
		//For utilizado como uma opção para ler itens do Array
		// for(tipo do array  String | Variavel linha | e a referencia a qual array que no caso do nome do array após os 2 pontos : letras)
		for (String linha : letras) {
							
			System.out.println(linha);
							
		}
	}
}
