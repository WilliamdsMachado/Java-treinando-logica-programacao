package arrayJava;

public class Array {
	public static void main(String[] args) {
		
		int n1, n2, n3, n4, n5;
		
		n1 = 10;
		n2 = 18;
		n3 = 31;
		n4 = 45;
		n5 = 52;
		
		System.out.println("Exemplo com variáveis");
		System.out.println("Numero1: " + n1);
		System.out.println("Numero2: " + n2);
		System.out.println("Numero3: " + n3);
		System.out.println("Numero4: " + n4);
		System.out.println("Numero5: " + n5);
		
		
		/*
		 	Array é semelhante a criação de várias variáveis
		 	ele faz a mesma coisa / função
		 	
		 	[ ] - siginifica que estou criando um array quando o java encontrar os conchetes ele vai entende que é um array
		 	new - siginifica que vou instanciar da classe int
		*/
		
		int[] numeros= new int[5];
		
		numeros[0] = 19; 
		numeros[1] = 25; 
		numeros[2] = 39; 
		numeros[3] = 43; 
		numeros[4] = 90; 
				
				
		System.out.println("\nImprimindo o Array\n\n");
		System.out.println("Posição 0: " + numeros[0]);
		System.out.println("Posição 1: " + numeros[1]);
		System.out.println("Posição 2: " + numeros[2]);
		System.out.println("Posição 3: " + numeros[3]);
		System.out.println("Posição 4: " + numeros[4]);
		
		//----------------------------------------------------------
		
		//Criando um Array de texto e preenchendo os itens
		//direto de dentro do array
		String[] letras = {"A", "B", "C", "D", "E"};
		
		System.out.println("\nImprimindo o Array de Letras\n\n");
		System.out.println("Posição 0: " + letras[0]);
		System.out.println("Posição 1: " + letras[1]);
		System.out.println("Posição 2: " + letras[2]);
		System.out.println("Posição 3: " + letras[3]);
		System.out.println("Posição 4: " + letras[4]);
		System.out.println("-------------------------------\n");
		
		
		//----------------------------------------------------------
		
		//Criando um Array de texto e preenchendo os itens
		//direto de dentro do array
		String[] animais = {"Ave", "Macaco", "Girafa", "Cachorro"};
		
		//for - para
		//para cada vez que passar pelo for a variavel posicao que inicia com 0 vai recebendo mais 1 e assim por diante 
		for(int posicao = 0; posicao < 4; posicao++) {
			System.out.println("Animal posição: " + posicao + " : " + animais[posicao]);
		}
		
	}
}
