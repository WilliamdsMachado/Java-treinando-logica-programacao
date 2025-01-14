package ComandosDecisaoJava;

public class Funcao_IF {
	public static void main(String[] args) {
		
		int numero = 9;
		String nome = "Amanda";
		/*
		 == - Igual - Equals
		 != - Diferente
		 > - Maior
		 < - Menor
		 >= - Maior ou igual
		 <= - Menor ou igual
		*/
		
		if(numero != 10) {
			
			System.out.println("O número é diferente de 10");
			
		}else {
			System.out.println("O número é igual a 10");
		}
		
		if(nome.equals("Ana")) {
			
			System.out.println("O nome é : " +  nome);
			
		}else {
			System.out.println("Nome Inválido");
		}
	}
}
