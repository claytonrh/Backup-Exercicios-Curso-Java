package fundamentos;

import java.util.Scanner;

public class Dani {
	
	public static void main(String[] args) {
	
		// o syso quando tem o ln no final significa que irá imprimir em uma nova linha, se não tiver o ln no final ele irá imprimir tudo na mesma linha 	

		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite seu nome: ");
		String nome = entrada.nextLine();
		
		System.out.print("Digite seu sobrenome: ");
		String sobrenome = entrada.nextLine();
		
		System.out.print("Digite sua idade: ");
		int idade = entrada.nextInt ();
		
		System.out.printf("A %s %s é fidida e tem %d anos.%n", nome, sobrenome, idade);
		
		entrada.close();
		
				
				
		
		
		
		
	}

}
