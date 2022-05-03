package lambdas;

import java.util.function.UnaryOperator;

public class OperadorUnario {
	
	 public static void main(String[] args) {
		
//		 					   | maisDois � uma fun��o !	
		 UnaryOperator<Integer> maisDois = n -> n + 2;
		 UnaryOperator<Integer> vezesDois = n -> n * 2;
		 UnaryOperator<Integer> aoQuadrado = n -> n * n;
		 
		 int resultado1 = maisDois
				 .andThen(vezesDois)
				 .andThen(aoQuadrado)
				 .apply(0); //teoricamente a opera��o come�a por aqui
		 System.out.println(resultado1);
		 
		 int resultado2 = aoQuadrado
				 .compose(vezesDois)
				 .compose(maisDois)
				 .apply(0);
		 System.out.println(resultado2);
	}
}
