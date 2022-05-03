package controle;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
						
		String texto = "";
						
		do {			
			System.out.println("Você precisa falar "
					+ "\nas palavras mágica");
			System.out.println("Qure sair?");
		}while(!texto.equalsIgnoreCase("Por favor"));
			
		// nesse caso o while vai executar pelo menos uma vez
		// mesmo que ele encontro um resultado falso
							
		System.out.println("Obrigado!");
		entrada.close();
		
	}
}
