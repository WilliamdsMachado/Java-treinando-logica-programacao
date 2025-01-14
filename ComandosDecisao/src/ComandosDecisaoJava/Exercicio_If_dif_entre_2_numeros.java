package ComandosDecisaoJava;

import javax.swing.JOptionPane;

public class Exercicio_If_dif_entre_2_numeros {
	public static void main(String[] args) {
		
		int numero1;
		int numero2;
		int res;
		
		System.out.println("Informe 2 Números que iremos subtrair e lhe mostrar a diferença");
		System.out.println("---------------------------------------------------------------");
		System.out.println("---------------------------------------------------------------");
		System.out.println("---------------------------------------------------------------");
		numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número: "));
		numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número: "));
		
		

		if(numero1 >= numero2) {
			
			res = numero1 - numero2;
			
			System.out.println("------- Resposta Exercicio ------");
			System.out.println("\n\nNumero 1: " + numero1);
			System.out.println("Numero 2: " + numero2);
			System.out.println("Diferenca: " + numero1 + " - " + numero2 + " = " + res);
			
			
		//else - senão
		}else {
			
			res = numero2 - numero1;
			
			System.out.println("------- Resposta Exercicio ------");
			System.out.println("\n\nNumero 1: " + numero1);
			System.out.println("Numero 2: " + numero2);
			System.out.println("Diferenca: " + numero2 + " - " + numero1 + " = " + res);
			
			
		}
		
		// fiz dessa forma e achei mais preciso pois valida números negativos não deixa informar numero menor que 1	
//		if(numero1 > 0 && numero2 > 0) {
//			res = numero1 - numero2;
//			System.out.println("A diferença entre " + numero1 + " - " + numero2 + " é = " + res);
//		}else {
//			System.out.println("Números digitados inválidos! Algum número digitado é negativo. Informe números maior que 0");
//		}
	}
}
