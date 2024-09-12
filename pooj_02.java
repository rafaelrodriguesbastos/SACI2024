import java.util.Scanner;
class pooj_02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Qual seu nome?");
		String nome = scanner.nextLine();
		System.out.println("Quantos anos você tem?");
		int idade = scanner.nextInt();
		System.out.println(nome + ", você tem " + idade + " anos");
	}
}
