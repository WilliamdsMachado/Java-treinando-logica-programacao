package EstruturaRepeticao;

public class For {
	public static void main(String[] args) {
		
		/*
		 Só usamos nossa estrutura do for quando soubermos quantas vezes usar esse comando
		 int contador = 1 -  configura a variável para servir de contador 
		 o nome da variavel pode ser qualquer coisa exemplo: uva, i , j, w
		 
		 contador <= 10 - Condição para continuar a execução. continua executando até a condição ser atingida
		 
		 contador++ - Incremento até o contador atingir resultado esperado
		 
		 Inicialização/ Condição / Incremento
		 
		*/
				
		//for _ Para
		//par ao contador que começa em 1 e vai repetir enquanto for menor ou igual a 10, faça acréscimo contador ++ adicionando 1 
		// a cada vez que passar dentro do for ele incrementa
		/*for(int contador = 1; contador <= 10; contador ++) {
			
			System.out.println("Numero: " + contador);
		}*/
		
		/*
		 * 
		 * 
		*/
		
		/*//Agora vamos fazer um exemplo de decremento
				for(int contador = 10; contador >= 1; contador --) {
					
					System.out.println("Numero: " + contador);
			}*/
	
	
			for(int contador = 2; contador <= 10; contador +=2) {
				
				System.out.println("Numero: " + contador);
			}
			
			
			// contador ++
			// contador = contador + 1
			// contador +=1
	}
}
