package PrimeirosPassosJava;

public class ImpressaoTexto {
	public static void main(String[] args) {
		//System.out -  É o objeto de saída padrão
		//print - Imprimir
		// o caractere \n é um caractere de escape que faz a quebra de linha
		System.out.print("Olá, Mundo! \n");
		
		//ln - posiciona o cursor na linha de baixo
		System.out.println("Texto simples");
		System.out.println("Texto simples 2");
	
		/*
		 * Os especificadores de formato em Java são ferramentas poderosas para controlar
		 * a saída de texto formatado. Combinando esses especificadores com flags e modificadores,
		 * você pode formatar strings de maneira muito precisa e customizada.
		 
		 f -Formatted, Formato que permite fazer impressões personalizdas
		 %s - String / Texto
		 %d - Inteiro
		 %f - Float
		 %b - Boleano True ou False
		 %n - No printf inidica uma quebra de linha
		*/
		System.out.printf("%s","Nome: Ana Paula\n");
		System.out.printf("%s idade: %d","Nome: Ana Paula", 33);
		
		//%n - No printf inidica uma quebra de linha
		System.out.printf("%n%nNome: %s %nIdade: %d","Ana Paula", 33);
		
		
		//Variavel - Espaço para armazenamento temporário
		int numero1 = 5;
		int numero2 = 10;
		
		System.out.printf("\n\nSoma dos números: %d", (numero1 + numero2));
		
	}
}
