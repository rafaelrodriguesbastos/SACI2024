public class Aluno2 extends Pessoa {

	public Aluno2(String nome, String cpf) {
		super(nome, cpf); 
	} 
	
	public String matricula; 
	
	
	public static void main(String[ ] args) {
		Aluno2 aluno = new Aluno2("Jose", "123.456.789-00");
		aluno.matricula = "BG12345";
		
		System.out.println("Nome: " + aluno.nome);
		System.out.println("CPF: " + aluno.cpf);
		System.out.println("Matrícula: " + aluno.matricula);
	}
}

