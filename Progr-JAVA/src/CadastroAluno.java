import java.util.Scanner;

public class CadastroAluno {
	public static void main(String[] args) {
		Scanner enter = new Scanner(System.in);
		
		System.out.print("Quantos cadastro de aluno vai fazer? ");
		int qtdAluno = enter.nextInt();
		enter.nextLine();
		
		for (int i = 0; i < qtdAluno; i++) {
			System.out.println("\nAluno " + (i + 1));
			System.out.print("Nome: ");
			String nome = enter.nextLine();
			
			double somaNotas = 0;
			for (int j = 1; j <= 3; j++) {
				System.out.print("Nota " + j + ": ");
				somaNotas += enter.nextDouble();
			}
			enter.nextLine();
			
			double media = somaNotas / 3;
			String status = media >= 7 ? "Aprovado" : "Reprovado";
			
			System.out.printf("%s - Média: %.2f - %s\n", nome, media, status);
		}
		enter.close();
	}
}