class Aluno {
	String nome;
	double nota1, nota2;

	public void calculaMedia() {
		double media = (this.nota1 + this.nota2)/2;
		System.out.println("Média: " + media);
	}


}
