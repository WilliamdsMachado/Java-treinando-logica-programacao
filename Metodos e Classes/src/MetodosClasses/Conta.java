package MetodosClasses;

public class Conta {

	//Atributos
	public String nome;
	public double saldo;
	
	void sacar(double valor) {
		
		//Apontar para o atributo da classe
		this.saldo -= valor; //Dessa forma o valor que usuario informar vai ser passado para a variavel valor e em seguida vamos armazenar na variavel saldo
		
	}
	
	void depositar(double valor) {
		
		this.saldo = saldo + valor;
		
	}
	
}
