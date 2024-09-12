public class Aluno3 {
	String nome;
	double media;

	public Aluno3(String nome) {
		this.nome = nome; 
	}
	public Aluno3(String nome, double media) {
		this.nome = nome;
		this.media = media; 
	} 
	
	public static void main(String args[]) {
	  Aluno3 ob1 = new Aluno3("Rafael", 7.8);
	  Aluno3 ob2 = new Aluno3("Cadu");
	  
	  System.out.println("Aluno 1: " + ob1.nome + " média " + ob1.media);
	  System.out.println("Aluno 2: " + ob2.nome + " média " + ob2.media);
	
	}	
}

