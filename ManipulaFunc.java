class ManipulaFunc {
	public static void main (String[] arg) {
		Funcionario obFunc = new Funcionario("Rafael", "123", "Vendedor", 1000.99);
		Funcionario obFunc2 = new Funcionario("Maria", "22", "Gerente", 500.00);
		Funcionario obFunc3 = new Funcionario("Ana", "15", "Contadora", 5000.00);
	
		obFunc.mostraDados();
		obFunc2.mostraDados();
		obFunc3.mostraDados();
		obFunc.trocaCargo("Diretor");
		obFunc.aumentoSalario(12000.50);
		obFunc2.aumentoSalario(2000.50);
		obFunc3.aumentoSalario(3000.50);
		obFunc.mostraDados();
		obFunc2.mostraDados();
		obFunc3.mostraDados();
		
	}
}
