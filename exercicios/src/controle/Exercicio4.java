package controle;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		int contadorDeDivisores = 0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("\nDigite um numero: ");
		int numero = scanner.nextInt();
		
		for (int i = 2; i < numero; i++) {
			if (numero % i == 0) {
				contadorDeDivisores++;
			}
		}
		
		if (contadorDeDivisores == 0) {
			System.out.println("\nO numero " + numero + " � primo");
		} else {
			System.out.println("\nO numero " + numero + "N�o � primo");
		}
		
		scanner.close();
	}
}
