package controle;

import java.util.Random;
import java.util.Scanner;

public class Exercicio6 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int continuar;
		int numeroSorteado;
		int tentativas;
		int numero;
		
		do {
			System.out.println("Sortenando numeo entre  e 100...\n");
			Random numeroAleatorio = new Random();
			numeroSorteado = numeroAleatorio.nextInt(101);
			
			System.out.printf("Começou o jogo! será que consegue me vencer?");
			tentativas = 0;
			
			
			do {
				
				tentativas++;
				System.out.printf("Tentaivas %d: ", tentativas);
				numero = scanner.nextInt();
				
				if (numero > numeroSorteado) {
					
					System.out.printf("Onumero sorteado é menor que %d\n\n", numero);
					
				} else if (numero < numeroSorteado) {
					
					System.out.printf("Onumero sorteado é maior que %d\n\n", numero);
					
					
				}
				
				
			} while (numero != numeroSorteado);
			
			System.out.println("Digite 0 para sair, ou qualquer outro numero para continuar: ");
			continuar = scanner.nextInt();			
			
		} while( continuar != 0);
		
		scanner.close();
	}

}
