package exercicios;
import java.util.Scanner;

public class Calculo {
	 public static void main(String[] args) {
		
		 Scanner leitor =  new Scanner(System.in);
		 
		 System.out.println("Informe sua idade em anos: ");
		 int anos  = leitor.nextInt();
		 
		 System.out.println("Digite sua idade em messes: ");
		 int meses = leitor.nextInt();
		
		 System.out.println("Digite sua idade em dias: ");
		 int dias = leitor.nextInt();
		 
		 int total = (anos * 365) + (meses * 30) + dias;
		 
		System.out.println("Sua idade em dias é: " + total);
		
		leitor.close();
	}
}
