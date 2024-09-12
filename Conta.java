class Conta {
	String titular, numero, agencia;
	private double saldo;
	
	public double consultaSaldo() {
		return this.saldo;
	}
	public void deposito(double valor) {
		this.saldo += valor;
	}
	public void saque(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
		}
		else {
			System.out.println("Saldo insuficiente! Não é possível sacar R$ " + valor);
		}
	}
}
