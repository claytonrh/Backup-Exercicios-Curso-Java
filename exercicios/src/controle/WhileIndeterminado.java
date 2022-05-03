package controle;

import java.util.Scanner;

public class WhileIndeterminado {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		String valor = "";
		
		while(!valor.equalsIgnoreCase("sair")) {   // o ponto de interrogação neste caso é uma negação
			System.out.println("Você diz: ");
			valor = entrada.nextLine();
			// aqui é importante informar a variavel para que não gere um lastro infinito
		}
		
		entrada.close();
	}

}
