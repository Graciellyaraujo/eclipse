import java.util.Scanner;

public class Exercicio4 {
	
 public static void main(String[] args) {
		
		Scanner leitor = new java.util.Scanner(System.in);
		
		boolean continuar = true;
		long nome;
		double salario,novosalario;
		

		do {
			System.out.println("Digite seu nome: ");
			nome = leitor.nextLong();
		
			System.out.println("Informe seu salario: ");
			salario = leitor.nextDouble();
				if(salario <= 500) {
					novosalario = salario * 0.2;
					salario = salario + novosalario;
					System.out.println("Seu sal�rio teve um aumento de " + novosalario); 
					System.out.println( "Seu sal�rio agora �: " + salario);
				}else {
					System.out.println("Sal�rio maior do que o necess�rio para obter o reajuste .");
				}
		}while( continuar );
			
	}
}