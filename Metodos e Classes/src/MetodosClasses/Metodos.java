package MetodosClasses;

public class Metodos {
	
	/*
	 * Métodos é uma função que programamos para a classe main ele é o método principal
	 * 
	 * Como criar um método?
	 * Indicador de Acesso - public Static
	 * Tipo de Retorno - void / nada
	 * Nome - main
	 * 
	 *Conjunto de parametros desse método - String[] args
	 * 
	 * */
	
	public static void main(String[] args) {
		//Faz a chamada do método e executa a instrução que tem dentro que no caso aqui é o syso
		mensagem();
		
		//Faz a passagem dos itens para o método e imprimir com System.out.println
		instrucoes("Estude e treine bastante");
		instrucoes("Assim você aprende JAVA");
		
		//Faz a passagem de 4 notas e calcula a media
		//Aqui Passamos valores do tipo double
		media(10, 8.5, 9, 6.5);
		
		//Sobrecarga de métodos
		//Podemos criar mais de uma método com o mesmo nome 
		//mas eles devem ter tipos diferentes para serem aceitos
		//Aqui passamos os valores do tipo int
		media(10, 8, 9, 6);
		
		int resultado;
		resultado = soma(50,9); //o que tiver sendo passado aqui está sendo atribuido a variavel resultado que é o retorno
		
		System.out.println("Resultado da soma " + resultado);
		
		
		//-------------------------------------------------------
		
		System.out.println("Resultado: " + somaNumeros(5,10,20,10,30,25,50,75));
	}
	
	//Aqui criamos uma lista de parametros do tipo inteiro
	public static int somaNumeros(int ... numeros) {
		
		int resultado = 0;
		
		for(int posicao = 0; posicao < numeros.length; posicao++) {
			resultado = resultado + numeros[posicao];
		}
		return resultado;
	}
	
	public static int soma(int valor1, int valor2) {
		
		int resultado =  valor1 + valor2;
		
		//return - Retorna o resultado da operação
		return resultado;
		
	}
	
	
	/*
	 public - Tenho acesso a esse método fora da classe
	 Se o método main é static ou outros também terão que ser static
	*/
	
	public static void media(double nota1, double nota2, double nota3, double nota4) {
		
		double media;
		
		media = (nota1 + nota2+ nota3 + nota4) / 4;
		
		System.out.println("Media final com Double: " + media);
		
	}
	
	public static void media(int nota1, int nota2, int nota3, int nota4) {
			
			int media;
			
			media = (nota1 + nota2+ nota3 + nota4) / 4;
			
			System.out.println("Media final com Int: " + media);
			
		}
	
	
	
	/*
	 * Indicador de Acesso - public Static
	 * Tipo de Retorno - void / nada
	 * Nome - mensagem
	 * 
	 * */
	public static void mensagem() {
		System.out.println("Boa noite, estou aprendendo sobre métodos");
	}
	
	//Neste caso criamos o método com um parâmetro de entrada
	//String texto - recebe o texto que vem do método main ou se tivesse trabalhando com outro método viria de outro método
	//e exibe na tela com o auxilio do nosso System.out.println
	public static void instrucoes(String texto) {
		
		System.out.println(texto);
	}
	
}
