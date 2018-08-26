import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		
		Scanner leitor = new java.util.Scanner(System.in);
		
		double totalgasolina , totalrefrigerantes , total;
		int quantidade, litros;
		
		System.out.println("Informe a quantidade de refrigerantes: ");
		quantidade = leitor.nextInt();
		totalrefrigerantes = quantidade * 3.00;
		
		System.out.println("Informe quantos litros de gasolina: ");
		litros = leitor.nextInt();
		totalgasolina = litros * 2.50;
		
		 total = totalgasolina + totalrefrigerantes;
		
		System.out.println("Total a pagar: " + total + "reais.");
		
		
	}	
		
}
