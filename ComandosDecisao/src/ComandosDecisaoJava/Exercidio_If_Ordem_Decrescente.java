package ComandosDecisaoJava;

import javax.swing.JOptionPane;

public class Exercidio_If_Ordem_Decrescente {

	public static void main(String[] args) {
		
		int numero1, numero2;
		
		numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o número 1"));
		numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o número 2"));
		
		if(numero1 >= numero2) {
			System.out.println(numero1 + "\n" + numero2);
		}else {
			System.out.println(numero2 + "\n" + numero1);
		}
	}
}
