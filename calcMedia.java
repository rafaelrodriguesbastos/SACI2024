import java.util.Scanner;
class calcMedia {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Qual seu nome?");
		String nome = scanner.nextLine();
		
		System.out.println("Qual a primeira nota?");
		double nota1 = scanner.nextDouble();
		System.out.println("Qual a segunda nota?");
		double nota2 = scanner.nextDouble();
		
		double media = (nota1 + nota2)/2;
		
		System.out.println(nome + ", sua média é " + media);

		if (media >= 7.5) {
			System.out.println("Aprovado");	
		}
		else {
			System.out.println("Em exame");
		}
	}
}
