class Banco {
	public static void main (String[] args) {
		Conta obConta = new Conta();
		obConta.titular = "RAfael";
		obConta.numero = "12345-6";
		obConta.agencia = "001-0";
		
		System.out.println("Saldo = " + obConta.consultaSaldo());
		obConta.deposito(1000);
		obConta.saque(450);
		obConta.deposito(230);
		System.out.println("Saldo = " + obConta.consultaSaldo());
		obConta.saque(500);
		System.out.println("Saldo = " + obConta.consultaSaldo());
		obConta.saque(1000);
		System.out.println("Saldo = " + obConta.consultaSaldo());
		obConta.saque(1000);
		System.out.println("Saldo = " + obConta.consultaSaldo());
	}
}
