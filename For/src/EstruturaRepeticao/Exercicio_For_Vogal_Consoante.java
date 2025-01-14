package EstruturaRepeticao;

import javax.swing.JOptionPane;

public class Exercicio_For_Vogal_Consoante {

	public static void main(String[] args) {

		String nome;
		int nomesComVogal = 0;
		int nomesComConsoante = 0;
		
		for(int i = 1; i <=3; i++) {
			nome = JOptionPane.showInputDialog(null, "Digite o nome " + i + " :", "Leia com Atenção",  JOptionPane.QUESTION_MESSAGE);
			
			
			// o trim remove os espaços em branco do incicio do nome
			//toLoweCase - Deixa todas as letras em minúsculas
			//charAt(0) - Primeira letra da variavel nome
			//|| - ou
			if(nome.trim().toLowerCase().charAt(0) == 'a' ||
					nome.trim().toLowerCase().charAt(0) == 'e' ||
					nome.trim().toLowerCase().charAt(0) == 'i' ||
					nome.trim().toLowerCase().charAt(0) == 'o' ||
					nome.trim().toLowerCase().charAt(0) == 'u') {
				
				nomesComVogal++;
			
			}
			
		}
		
		nomesComConsoante = 3 - nomesComVogal;
		
		System.out.println("Total com vogal: " + nomesComVogal);
		System.out.println("Total com consoante: " + nomesComConsoante);
	}

}
