import java.util.Scanner;

public class Exercicio2 {
	
	public static void main(String[] args) {
		Scanner leitor  = new java.util.Scanner(System.in); 	
		
		int numero, i; 
		for ( i = 0; i<10; i ++ ) {
			
		
		System.out.println("Digite um numero: ");
		numero =  leitor.nextInt();
		if (numero % 2 <= 0) { 
		System.out.println("Numero é par");
		
			
		} else {
	    System.out.println("Numero é impar");
	}
	 
	
	}
}
}
