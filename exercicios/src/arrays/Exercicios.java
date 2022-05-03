package arrays;

import java.util.Arrays;

public class Exercicios {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		double [] notasDoAlunoA = new double [3];
		// "homogenio" porque todos os dados serão do tipo double
		// e "fixo" porque a quantidade é fixada em 3
		
		System.out.println(Arrays.toString(notasDoAlunoA));
		
		notasDoAlunoA[0] = 7.9;
		notasDoAlunoA[1] = 8; // aqui o fato de ser um int não vai dar problema
							  // porque o java vai alterar para o formato determinado no array
		notasDoAlunoA[2] = 6.7;
		
		System.out.println(Arrays.toString(notasDoAlunoA));
		System.out.println(notasDoAlunoA [1]);
		
		double totalAlunoA = 0;
		//for(int i = 0; i < 3; i++) {
			for(int i = 0; i < notasDoAlunoA.length; i++) {
			// esta é uma forma melhor de escrever porque vai pegar automáticamente todas as notas lançadas

			totalAlunoA += notasDoAlunoA[i];
		}
				
		//System.out.println(total / 3);
		System.out.println(totalAlunoA / notasDoAlunoA.length);
		
		double[] notasDoAlunoB = { 6.9, 8.9, 5.5, 10 };
		
		double totalAlunoB = 0;
		for (int i = 0; i < notasDoAlunoB.length; i++) {
			totalAlunoB += notasDoAlunoB [i];
			
			
		}
		
		System.out.println(totalAlunoB / notasDoAlunoB.length);
		System.out.println(Arrays.toString(notasDoAlunoB));
		
	}	

}
