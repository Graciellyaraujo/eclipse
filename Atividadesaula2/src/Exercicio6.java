import java.util.Scanner;

public class Exercicio6 {

public static void main(String[] args) {
		
   Scanner leitor = new java.util.Scanner(System.in);
    double salario, emprestimo;
    
    System.out.println("Informe o seu sal�rio: ");
	salario = leitor.nextDouble();
	
	System.out.println("Qual o valor de emprestimo que voc� deseja: ");
	emprestimo = leitor.nextDouble();
	
	if (salario * 0.3 >= emprestimo) {
		System.out.println("Emprestimo concedido!");
	}else {
		System.out.println("Emprestimo superior a 30% do seu sal�rio, n�o concedido!");
	}
}
}