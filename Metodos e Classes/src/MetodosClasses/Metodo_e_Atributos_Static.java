package MetodosClasses;

public class Metodo_e_Atributos_Static {

	public static void main(String[] args) {

		/*
		 Quando crio um elemento e defino para Static eu posso
		 Instaciar v�rios objetos dessa clasee, mas todos que 
		 eu instanciar, v�o apontar para o mesmo endere�o da
		 mem�ria, � como se eu tivesse v�rias variaveis e quando
		 eu altero o valor de uma, todas as variaveis que est�o
		 usando receber�o o mesmo valor
		 
		 
		 */
		
		System.out.println(Pao.quantidadePao);
		Pao pao1 = new Pao("Franc�s", 20, "Pequeno");
		Pao pao2 = new Pao("P�o de Centeio", 50, "M�dio");
		Pao pao3 = new Pao("P�o Autraliano", 35, "Grande");
		
		//M�todos e Atributos Static, temos acesso sem
		//ter que instanciar um objeto da classe
		Pao.quantidadePao = 300;
		
		System.out.println("----------------------\n\n");
		pao1.imprimir();
		pao2.imprimir();
		pao3.imprimir();

	}

}
