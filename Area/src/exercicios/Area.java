package exercicios;
import java.util.Scanner;

public class Area {
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Informe o valor da base: ");
		float base = leitor.nextFloat();
		
		System.out.println("Informe o valor da altura: ");
		float altura = leitor.nextFloat();
		
		float area = base * altura;
		
		System.out.println("A área do retangulo é: " + area);
		
		//leitor = close();
		
	}
}
