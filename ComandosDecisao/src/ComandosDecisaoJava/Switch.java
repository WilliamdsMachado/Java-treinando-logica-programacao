package ComandosDecisaoJava;

import javax.swing.JOptionPane;

public class Switch {

	public static void main(String[] args) {
		String fruta;
		
		fruta = JOptionPane.showInputDialog("Digite o nome de uma fruta");
		
		fruta = fruta.toLowerCase();
		//Escolha
		switch(fruta) {
			
		
		case "banana":
			
			System.out.println("Você digitou Banana!");
			
			break;
			
			
		case "laranja":
				
				System.out.println("Você digitou Laranja!");
				
				break;	
			
		case "uva":
					
					System.out.println("Você digitou Uva!");
					
					break;	
					
		default:
			System.out.println("Você não digitou uma fruta válida!");
			break;
	
		}
		
	}
	
}
