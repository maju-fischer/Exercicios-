package exercicios;

import java.util.Scanner;

public class Custo {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
				
		System.out.println(" digite o valor do custo de fabrica: ");
		double fabrica = leitor.nextDouble();
		
		double conta = fabrica * 1.73;
		
		System.out.println("O custo ao consumidor é de: " + conta);
		
		leitor.close();
		
	}
}
