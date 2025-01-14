package arrayJava;

import java.util.Arrays;
import java.util.HashSet;

public class Exercicio_Array_4_Imprimir_2_Arrays_Strings {
	public static void main(String[] args) {
		
		String[] array1 = {"A", "B", "C", "D"};
		String[] array2 = {"W", "A", "T", "C"};
		
		System.out.println("Array 1: " + Arrays.toString(array1));
		System.out.println("Array 2: " + Arrays.toString(array2));
		
		//HashSet é uma coleção de itens onde cada item é único
		//e é encontrado no apcote java.util
		var itensRepetidos =  new HashSet<String>();
		
		for(int contadorArray1 = 0; contadorArray1 <= array1.length -1; contadorArray1++ ) {
			
			for(int contadorArray2 = 0; contadorArray2 <= array2.length -1; contadorArray2++) {
				
				if(array1[contadorArray1].equals(array2[contadorArray2])) {
					itensRepetidos.add(array1[contadorArray1]);
				}
			}
			
		}
		System.out.println("Itens: " + itensRepetidos);
	}
}
