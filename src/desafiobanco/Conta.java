package desafiobanco;

public abstract class Conta implements IConta {
	private static final int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;
	
	protected int agencia;
	protected int numeroconta;
	protected double saldo;
	protected Cliente cliente;

	public Conta(Cliente cliente) {
	this.agencia = Conta.AGENCIA_PADRAO;
	this.numeroconta = SEQUENCIAL++;
	this.cliente = cliente;
	}
	
	@Override
	public void sacar(double valor) {
		saldo -= valor;
		
	}
	@Override
	public void tranferir(double valor, Conta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
		
	}
	@Override
	public void depositar(double valor) {
		saldo += valor;
		
	}
	protected void ImprimirInfosComuns() {	
		System.out.println(String.format("Titular: %s", this.cliente.getNome()));
		System.out.println(String.format("agencia: %d", this.agencia));
		System.out.println(String.format("Numero: %d", this.numeroconta));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
	}

	public int getAgencia() {
		return agencia;
	}
	public int getNumConta() {
		return numeroconta;
	}
	public double getSaldo() {
		return saldo;
	}
	public Cliente getCliente() {
		return cliente;
	}
}
