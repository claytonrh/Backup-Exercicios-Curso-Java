package controle;

import java.util.Scanner;

public class WhileIndeterminado {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		String valor = "";
		
		while(!valor.equalsIgnoreCase("sair")) {   // o ponto de interroga��o neste caso � uma nega��o
			System.out.println("Voc� diz: ");
			valor = entrada.nextLine();
			// aqui � importante informar a variavel para que n�o gere um lastro infinito
		}
		
		entrada.close();
	}

}
