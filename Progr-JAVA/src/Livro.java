import java.util.Scanner;

public class Livro {
	private String titulo, autor;
	private int paginas;
	
	public Livro(String titulo, String autor, int paginas) {
		this.titulo = titulo;
		this.autor = autor;
		this.paginas = paginas;
	}
	
	public void mostrarDetalhes() {
		System.out.println(titulo + " de " + autor + ", " + paginas + " páginas ao todo");
	}
	
	public static void main(String[] args) {
		Scanner enter = new Scanner(System.in);
		
		System.out.print("Me diga o título: ");
		String titulo = enter.nextLine();
		
		System.out.print("O autor: ");
		String autor = enter.nextLine();
		
		System.out.print("Tanto de páginas: ");
		int paginas = enter.nextInt();
		
		Livro livro = new Livro(titulo, autor, paginas);
		livro.mostrarDetalhes();
	}
}