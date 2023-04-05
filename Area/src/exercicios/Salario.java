package exercicios;
import java.util.Scanner;

public class Salario {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite seu salario atual: ");
		float salario01 = leitor.nextFloat();
	
		System.out.println("Digite o perceitual de reajuste: ");
		float reajuste = leitor.nextFloat();
		
		float novo = reajuste / 100;
		
		float resultado =  (salario01 * novo) + salario01; 
		
		System.out.println("O valor do novo salario é de: " + resultado);
		
		leitor.close();
	}
}
