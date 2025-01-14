package arrayJava;

public class Exercicio_Array_2_Calculo_Soma_Media {
	public static void main(String[] args) {
		
		double [] numeros = {19,25,39,43,90,89,34,19};
		double soma = 0;
		double media;
		
		for(int posicao = 0; posicao < numeros.length; posicao++) {
			soma += numeros[posicao];
		}
		
		media = soma / numeros.length;
		
		System.out.println("A Soma total de todas as posições é: " + soma);
		System.out.println("Total Itens: " + numeros.length);
		System.out.println("A média é: "+ media);
	}
}
