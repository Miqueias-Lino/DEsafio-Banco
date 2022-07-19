package desafiobanco;

public class Main {

	public static void main(String[] args) {
		Cliente miqueias = new Cliente();
		Conta cc = new ContaCorrente(miqueias);
		Conta cp = new ContaPoupanca(miqueias);

		miqueias.setNome("Miqueias");
		
		cc.ImprimirExtrato();
		cp.ImprimirExtrato();
	}

}
