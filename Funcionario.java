class Funcionario {
	String nome, cpf, matricula, cargo;
	double salario;
	
	public Funcionario(String arg_nome, String arg_matricula, String arg_cargo, double arg_salario) {
		this.nome = arg_nome;
		this.matricula = arg_matricula;
		this.cargo = arg_cargo;
		this.salario = arg_salario;
	}
	
	public void trocaCargo(String novoCargo) {
		this.cargo = novoCargo;
	}
	public void aumentoSalario(double novoSalario) {
		this.salario = novoSalario;
	}	
	public void mostraDados() {
			System.out.println("Nome: " + this.nome + " - " + this.cargo + " - " + this.salario);
	}

}
