import java.util.Scanner;

public class Exercicio3 {
	
	public static void main(String[] args) {
		
		Scanner leitor = new java.util.Scanner(System.in);
		
		int numero , i,resultado;
		
		System.out.println("Informe a tabuada de 1 a 10: ");
		numero = leitor.nextInt();
		
		for(i = 0; i < 11; i++) {
			resultado = numero*i; 
			System.out.println(resultado);
			
			
		}
		
		
	}

}