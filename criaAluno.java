class criaAluno {
	public static void main (String[] args) {
		Aluno ob_aluno = new Aluno();
		ob_aluno.nome = "Rafael";
		ob_aluno.nota1 = 7.5;
		ob_aluno.nota2 = 5.3;
			
		System.out.println("Nome: " + ob_aluno.nome);
		ob_aluno.calculaMedia();
	}
}
