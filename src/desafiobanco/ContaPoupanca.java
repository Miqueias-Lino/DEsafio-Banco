package desafiobanco;

public class ContaPoupanca extends Conta{
	public ContaPoupanca(Cliente cliente) {
		super(cliente);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void ImprimirExtrato() {
		System.out.println("==== Imprimindo Extrato Poupança =====");
		super.ImprimirInfosComuns();
	}
}
