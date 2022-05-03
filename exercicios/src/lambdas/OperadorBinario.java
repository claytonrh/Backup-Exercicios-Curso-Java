package lambdas;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class OperadorBinario {
	
	public static void main(String[] args) {
		
		BinaryOperator<Double> media = (n1, n2) -> (n1 + n2) / 2;
//		|OperadorBinario| receber� apenas 1 variavel | <do tipo Double | e se chamar� |m�dia|
//		m�dia receber� duas variaveis |n1 e n2|
//		Lambda executar� a seguinte fun��o | n1 + n2 / 2		
		
		System.out.println(media.apply(9.8,  5.7));
				
		BiFunction<Double, Double, String> resultado = (n1, n2) -> {
			double notaFinal = (n1 + n2) / 2;
			return notaFinal >= 7 ? "Aprovado" : "Reprovado";
		};
		System.out.println(resultado.apply(9.7,  4.1));
		
		Function<Double, String> conceito =
				m -> m >= 7 ? "Aprovado" : "Reprovado";			
//		|Fun��o| receber� 2 variaveis | <uma do tipo Double e uma do tipo String> | e se chamar� |conceito|
//		| m | ser� a variavel de conceito
//		Lambda executar� a seguinte tarefa 
//  	se | m for maior ou igual a 7 ? | ent�o |Aprovado| caso contr�rio |reprovado|  				
				
		System.out.println(media.andThen(conceito).apply(9.7, 5.1));	
	}

}
