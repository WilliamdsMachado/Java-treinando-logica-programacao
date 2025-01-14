package EstruturaRepeticao;

import javax.swing.JOptionPane;

public class Exercicio_DoWhile_Verifica_Numero_Positivo_Negativo {
	public static void main(String[] args) {
		
		int numero= 0;
		
		do {
			
			numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número ou 0 para sair ", "Leia com Atenção!", JOptionPane.QUESTION_MESSAGE));
			
			if(numero >0) {
				
				System.out.println(numero + " positivo!");
				
			}else if(numero < 0){
				System.out.println(numero + " negativo!");
			}
			
		}while(numero != 0);
		System.out.println("Até a próxima!");
	}
}
