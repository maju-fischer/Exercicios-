package exercicios;
import java.util.Scanner;

public class Eleitores {

	public static void main(String[] args) {
		
		Scanner leitor = new  Scanner(System.in);
		
		System.out.println("Digite o valor total de eleitores do municipio: ");
		float total = leitor.nextFloat();
		
		System.out.println("Digite o valor dos votos em branco: ");
		float branco = leitor.nextFloat();
		
		System.out.println("Digite o valor dos votos nulos: ");
		float nulos = leitor.nextFloat();
		
		float tbrancos = (100 * branco) / total;
		
		float tnulo = (100 * nulos) / total;
		
		System.out.println("O valor total de votos brancos é de: " + tbrancos + "O valor de votos nulos é de: " + tnulo);
		
		leitor.close();
		
	}
}
