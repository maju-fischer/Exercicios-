package exercicios;
import java.util.Scanner;

public class Idade {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Informe sua idade em dias: ");
		int dias = leitor.nextInt();
		
		int anos = dias / 365;
		
		dias = dias % 365;
		
		int meses = dias / 30;
		
		dias = dias % 30;
		
		leitor.close();
			
		System.out.println("Sua idade: " + anos + meses + dias);
		
	}
}
