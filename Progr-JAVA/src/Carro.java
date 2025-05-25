import java.util.Scanner;

public class Carro {
	private String marca;
	private String modelo;
	private int ano;
	private boolean ligado;
	
	public Carro(String marca, String modelo, int ano) {
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
		this.ligado = false;
	}
	
	public void ligar() {
		ligado = true;
		System.out.println("O carro está ligado");
	}
	
	public void desligar() {
		ligado = false;
		System.out.println("O carro está desligado");
	}
	
	public void mostrarInformacoes() {
		System.out.println(marca + " " + modelo + " - " + ano);
	}
	
	public static void main(String[] args) {
		Scanner enter = new Scanner(System.in);
		
		System.out.print("Diga a marca: ");
		String marca = enter.nextLine();
		
		System.out.print("O modelo: ");
		String modelo = enter.nextLine();
		
		System.out.print("O ano: ");
		int ano = enter.nextInt();
		
		Carro carro = new Carro(marca, modelo, ano);
		carro.ligar();
		carro.mostrarInformacoes();
		carro.desligar();
	}
}