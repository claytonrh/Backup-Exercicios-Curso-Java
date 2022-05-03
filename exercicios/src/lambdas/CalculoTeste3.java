package lambdas;

import java.util.function.BinaryOperator;

public class CalculoTeste3 {

	public static void main(String[] args) {
		
	// NÃO: int -> Double
	// double -> Double	
		
	BinaryOperator<Double> calc = (x, y) -> {return x + y; };
	System.out.println(calc.apply(2.0, 3.0));
	// essa é uma interface já disponibilizada pelo Java que permite acessa-la
	// diretamente sem a necessidade de criar uma classe inteface
	
	calc = (x, y) -> x * y;
	System.out.println(calc.apply(2.0, 3.0));
	
	BinaryOperator<Integer> calc2 = (x, y) -> {return x + y; };
	System.out.println(calc2.apply(2, 3));
	
	calc = (x, y) -> x * y; 
	System.out.println(calc2.apply(2, 3));
	
	}

}
