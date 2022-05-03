package controle;

import java.util.Scanner;

public class Exercicio3 {
	/**
	 * 3. Criar um programa que receba duas notas parciais, calcular a me�?dia
	 * final. Se a nota do aluno for maior ou igual a 7.0 imprime no console
	 * "Aprovado", se a nota for menor que 7.0 e maior do que 4.0 imprime no console
	 * "Recuperação", caso contra�?rio imprime no console "Reprovado".
	 */

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Nota parcial 1:");
		double nota1 = scanner.nextDouble();
		
		System.out.println("Nota parcial 2: ");		
		double nota2 = scanner.nextDouble();
				
		double media = (nota1 + nota2) / 2;
		
		if(media >= 7) {
		 System.out.println("Aprovado");		 
		} else if (media >= 4) {		 
		 System.out.println("Recuperação");		 
		} else {
		 System.out.println("reprovado");
		}
		
		scanner.close();
		
	}

}
