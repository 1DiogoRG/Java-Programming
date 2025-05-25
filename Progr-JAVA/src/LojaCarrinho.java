import java.util.Scanner;

public class LojaCarrinho {
	public static void main(String[] args) {
		Scanner enter= new Scanner(System.in);
		double total = 0;
		int quantidade = 0;
		
		while (true) {
			System.out.print("Digite o nome do produto (ou 'sair'): ");
			String produto = enter.nextLine();
			
			if (produto.equalsIgnoreCase("sair")) {
				break;
			}
			
			System.out.print("Digite o preço do produto: ");
			double preco = enter.nextDouble();
			enter.nextLine();
			
			total += preco;
			quantidade++;
		}
		
		System.out.print("\nCompra finalizada. ");
		System.out.print("Total de itens: - " + quantidade + " -");
		System.out.printf(" Valor total: R$ %.2f\n", total);
		
		enter.close();
	}
}