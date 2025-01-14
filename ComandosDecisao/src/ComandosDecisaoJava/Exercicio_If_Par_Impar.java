package ComandosDecisaoJava;

import java.util.Scanner;

public class Exercicio_If_Par_Impar {
	public static void main(String[] args) {
		
		Scanner objetoNumero = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Digite um número inteiro");
		
		//Utilizando nextInt() estamos convertendo o que está sendo passado pelo usuário e armazena como tipo inteiro na variavel numero
		//lê o texto e retorna como inteiro na variavel como inteiro
		numero = objetoNumero.nextInt();
		
		if(numero %2 == 0) {
			System.out.println("Numero " + numero + ", PAR");
		}else {
			System.out.println("Numero " + numero + ", IMPAR");
			
		}
		
		//EU FIZ de uma forma diferente também DEU CERTO
//		int numero;
//		
//		numero = Integer.parseInt(JOptionPane.showInputDialog("Informe um número para sabermos se ele é ímpar ou par"));
//		
//		if(numero %2 == 0) {
//			System.out.println("Número é Par");
//		}else {
//			System.out.println("número é Ímpar");
//		}
	}
}
