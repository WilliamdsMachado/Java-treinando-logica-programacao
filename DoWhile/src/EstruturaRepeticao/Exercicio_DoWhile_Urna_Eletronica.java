package EstruturaRepeticao;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Exercicio_DoWhile_Urna_Eletronica {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String candidato1, candidato2, candidato3;
		int votosCandidato1, votosCandidato2, votosCandidato3;
		int votacao, totalVotos, maiorVotacao;
		
		votosCandidato1 = votosCandidato2 = votosCandidato3 = 0;
		
		System.out.println("Nome Candidato 1 ");
		candidato1 = scanner.nextLine();
		
		System.out.println("Nome Candidato 2 ");
		candidato2 = scanner.nextLine();
		
		System.out.println("Nome Candidato 3 ");
		candidato3 = scanner.nextLine();
		
		totalVotos = 0;
	
		do {
			System.out.println("Digite o número do seu candidato para votar: ");
			votacao = scanner.nextInt();
			
				switch(votacao) {
				
				case 1:{
					
					votosCandidato1++;
					totalVotos++;
					break;
				}
				
				case 2:{
					
					votosCandidato2++;
					totalVotos++;
					break;
				}
				
				case 3:{
					
					votosCandidato3++;
					totalVotos++;
					break;
				}
				
				default :
				if(votacao != 0) {
					System.out.println("Voto Inválido");
				}
			}
			
		}while(votacao != 0);
		System.out.println(candidato1 + " - " + votosCandidato1 + " votos");
		System.out.println(candidato2 + " - " + votosCandidato2 + " votos");
		System.out.println(candidato3 + " - " + votosCandidato3 + " votos");
		System.out.println(" Total votos Eleição: " + totalVotos);
		
		maiorVotacao = votosCandidato1;
		
		if(votosCandidato2 > maiorVotacao) {
			maiorVotacao = votosCandidato2;
		}
		
		if(votosCandidato3 > maiorVotacao) {
			maiorVotacao = votosCandidato3;
		}
		
		System.out.println("Candidato vencedor da Eleição ");
		
		if(votosCandidato1 == maiorVotacao ) {
			System.out.println(candidato1 + " ganhou a eleição com " +  votosCandidato1 + " votos!");
		}
		
		if(votosCandidato2 == maiorVotacao ) {
			System.out.println(candidato2 + " ganhou a eleição com " +  votosCandidato2 + " votos!");
		}
		
		if(votosCandidato3 == maiorVotacao ) {
			System.out.println(candidato3 + " ganhou a eleição com " +  votosCandidato3 + " votos!");
		}
		
	}
}
