package controle;

import java.util.Scanner;

public class DesafioWhile {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int quantidadeDeNotas = 0;
		double nota = 0;
		double total = 0;
		
		
		while(nota != -1) {
			System.out.print("Digite a nota ou -1 p/ sair: ");
		nota = entrada.nextDouble();
		
		if(nota <= 10 && nota >= 0) { // se a nota for maior que zero e menor que 10 
		total += nota;				  // some tdas as notas	
		quantidadeDeNotas++;		  // e conte a quantidade de notas 
		} else if (nota != -1){		  // se digitar uma nota inv�lida que seja diferente de -1 mostre essa notifica��o	
			System.out.println("Nota inv�lida!!!! ;D");
		}
	}
		double media = total / quantidadeDeNotas;
		System.out.println("M�dia = " + media);		
		
		entrada.close();
		
	}
	} 
