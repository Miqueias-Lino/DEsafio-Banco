package desafiobanco;

public interface IConta {
	 void sacar(double valor);
	
	 void tranferir(double valor, Conta contaDestino);
	
	 void depositar(double valor);
	 
	 void ImprimirExtrato();
}
