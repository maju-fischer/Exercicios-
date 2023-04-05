package exercicios;

import java.util.Scanner;

public class Vendas {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite o numero de carros vendidos: ");
		double carros = leitor.nextFloat();
		
		System.out.println(" Digite valor de suas vendas: ");
		double vendas = leitor.nextDouble();
		
		System.out.println("Digite o valor do salario fixo: ");
		double salario = leitor.nextDouble();
		
		System.out.println("Digite o valor por carro vendido: ");
		double porc = leitor.nextDouble();
		
		double total = salario + (carros * porc) + (vendas * 0.05);
		
		System.out.println(" O salario final é de: " + total);
		
		leitor.close();
	}
}
