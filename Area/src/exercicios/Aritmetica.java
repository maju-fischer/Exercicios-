package exercicios;
import java.util.Scanner;

public class Aritmetica {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite a primeira nora: ");
		float nota1 = leitor.nextFloat();
		
		System.out.println("Digite a segunda nota: ");
		float nota2 = leitor.nextFloat();
		
		System.out.println("Digite a terceira nota: ");
		float nota3 = leitor.nextFloat();
		
		float media = (nota1) + (nota2) + (nota3) / 3;
		
		//leitor = close();
		
	}
}
