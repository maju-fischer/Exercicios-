package exercicios;
import java.util.Scanner;

public class Temperatura {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite a temperatura em graus Fahrenheit: ");
		float fahrenheit = leitor.nextFloat();
		
		float celsius = 5 / 9 * (fahrenheit - 32);
		
		System.out.println("A temperatura em correspondente em Celsius é: " + celsius);
		
		leitor.close();
				
	}
}
