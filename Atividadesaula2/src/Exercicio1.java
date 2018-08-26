import java.util.Scanner;
  
 public class Exercicio1 {
	
	public static void main (String[] args){
	Scanner leitor  = new java.util.Scanner(System.in);  
	
	double  salario, aumento, novosalario,percentual;
	
	System.out.println("Digite o valor do salario: ");
	salario = leitor.nextDouble();
	
	System.out.println("Valor de aumento:");
	aumento = leitor.nextDouble();
	//por cento: ex : 2 o mesmo que 2%.
	 percentual  =  (salario*aumento /100);
	 novosalario = salario + percentual;
	
	 System.out.println("Valor do salario atual com o aumento: " + novosalario);
	 System.err.println("Valor de aumento: " + percentual );
	}
}
