package lambdas;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class OperadorBinario {
	
	public static void main(String[] args) {
		
		BinaryOperator<Double> media = (n1, n2) -> (n1 + n2) / 2;
//		|OperadorBinario| receberá apenas 1 variavel | <do tipo Double | e se chamará |média|
//		média receberá duas variaveis |n1 e n2|
//		Lambda executará a seguinte função | n1 + n2 / 2		
		
		System.out.println(media.apply(9.8,  5.7));
				
		BiFunction<Double, Double, String> resultado = (n1, n2) -> {
			double notaFinal = (n1 + n2) / 2;
			return notaFinal >= 7 ? "Aprovado" : "Reprovado";
		};
		System.out.println(resultado.apply(9.7,  4.1));
		
		Function<Double, String> conceito =
				m -> m >= 7 ? "Aprovado" : "Reprovado";			
//		|Função| receberá 2 variaveis | <uma do tipo Double e uma do tipo String> | e se chamará |conceito|
//		| m | será a variavel de conceito
//		Lambda executará a seguinte tarefa 
//  	se | m for maior ou igual a 7 ? | então |Aprovado| caso contrário |reprovado|  				
				
		System.out.println(media.andThen(conceito).apply(9.7, 5.1));	
	}

}
