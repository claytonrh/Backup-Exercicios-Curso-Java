package fundamentos;

import java.util.Scanner;

public class Dani {
	
	public static void main(String[] args) {
	
		// o syso quando tem o ln no final significa que ir� imprimir em uma nova linha, se n�o tiver o ln no final ele ir� imprimir tudo na mesma linha 	

		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite seu nome: ");
		String nome = entrada.nextLine();
		
		System.out.print("Digite seu sobrenome: ");
		String sobrenome = entrada.nextLine();
		
		System.out.print("Digite sua idade: ");
		int idade = entrada.nextInt ();
		
		System.out.printf("A %s %s � fidida e tem %d anos.%n", nome, sobrenome, idade);
		
		entrada.close();
		
				
				
		
		
		
		
	}

}
