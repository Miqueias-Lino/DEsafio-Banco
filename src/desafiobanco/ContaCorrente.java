package desafiobanco;

public class ContaCorrente extends Conta {
	public ContaCorrente(Cliente cliente) {
		super(cliente);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void ImprimirExtrato() {
		System.out.println("==== Imprimindo Extrato =====");
		super.ImprimirInfosComuns();
	}
	
	}
	

