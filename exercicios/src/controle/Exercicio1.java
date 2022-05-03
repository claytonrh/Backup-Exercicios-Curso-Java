package controle;

import java.util.Scanner;

public class Exercicio1 {		
	/**
	 * 1. Criar um programa que receba um nu�?mero e verifique se ele esta�? entre 0 e
	 * 10 e e�? par;
	 */
			
		public static void main(String[] args) {
			
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("Digite um numero: ");
			int numero = scanner.nextInt();
			
			if (numero >= 0 && numero <= 10) {
				if (numero % 2 == 0) {         //essa sentença diz que se o resultado for par deverá puxar o primeiro print, caso não, puxará o segundo   
					System.out.println("O numero " + numero + "está entre 0 e 10 e é um par.");					
				} else {
					System.out.println("O numero " + numero + "está entre 0 e 10 e não é um par.");
				}
			} else {				
				System.out.println("O numero " + numero + "não está entre 0 e 10." );
		    }			
			scanner.close();			
			
		}

	}