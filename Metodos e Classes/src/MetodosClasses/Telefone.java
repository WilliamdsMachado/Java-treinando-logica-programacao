package MetodosClasses;

public class Telefone {

	//boolean - Verdadeiro ou Falso
		//false - Com a ligação desligada
		boolean ligacao = false;
		
		void ligar() {
			
			//if - se
			if(ligacao == true) {
				System.out.println("Você já está em uma ligação");
			}else {
				ligacao = true;
				System.out.println("Ligação Iniciada");
			}
		}

		void desligar() {
			//if - se
			//true - Significa que estou em uma ligação
			//false - Significa que não estou em uma ligação
			if(ligacao == true) {
				System.out.println("Ligação Encerrada com sucesso!");
				ligacao = false;
			}else {
				System.out.println("Você não pode desligar por que não está em uma ligação");
			}
		}
}
