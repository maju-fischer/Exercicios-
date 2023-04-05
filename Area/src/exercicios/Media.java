package exercicios;
import java.util.Scanner;

public class Media {

		public static void main(String[] args) {
			
			Scanner leitor = new Scanner(System.in);
			
			System.out.println("Informe a primeira nota: ");
			float nota1 = leitor.nextFloat();
			
			System.out.println("Informe a segunda nota: ");
			float nota2 = leitor.nextFloat();
			
			System.out.println("Informe a terceira nota: ");
			float nota3 = leitor.nextFloat();
			
			float resultado = (nota1*2) + (nota2*3) + (nota3*5);
			
			float mediap = resultado / (2 + 3 + 5);
			
			System.out.println("A média ponderada é: " + mediap);
			
			//leitor = close;
					
		}
}
