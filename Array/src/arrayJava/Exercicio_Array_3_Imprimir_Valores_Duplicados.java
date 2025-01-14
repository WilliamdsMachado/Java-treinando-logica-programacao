package arrayJava;

public class Exercicio_Array_3_Imprimir_Valores_Duplicados {
	public static void main(String[] args) {
		
		int[] numeros = {5, 10, 10, 10, 21, 10, 21, 9, 31};
        
        System.out.println("Valores duplicados no array:");

        // Loop para percorrer o array
        for (int i = 0; i < numeros.length; i++) {
            // Verifica se o número já foi impresso
            boolean jaImpressos = false;
            for (int j = 0; j < i; j++) {
                if (numeros[i] == numeros[j]) {
                    jaImpressos = true;
                    break;
                }
            }
            
            if (!jaImpressos) {
                // Verifica se o número é duplicado
                for (int k = i + 1; k < numeros.length; k++) {
                    if (numeros[i] == numeros[k]) {
                        System.out.println(numeros[i]);
                        break;
                    }
                }
            }
        }
		
//		int[] arrayNumeros = {5, 10, 10, 12, 21, 24, 21, 9, 31};
//		
//		for(int contador_x = 0; contador_x < arrayNumeros.length -1; contador_x++) {
//			
//			for(int contador_y = contador_x + 1; contador_y < arrayNumeros.length; contador_y ++ ) {
//				
//				if( (arrayNumeros[contador_x] == arrayNumeros[contador_y]) && (contador_x != contador_y) ) {
//					
//					System.out.println("Item duplicado: " + arrayNumeros[contador_y]);
//				}
//				
//			}
//			
//		}
	}
}
