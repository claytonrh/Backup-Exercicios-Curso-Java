 package fundamentos.Operadores;

public class Aritmiticos {

		public static void main(String[] args) {
			
			var x = 34.56;
			double y = 2.2;
			
			System.out.println(x + y);
			System.out.println(x - y);
			System.out.println(x * y);
			System.out.println(x / y);
			
			int a = 8;
			int b = 3;
			
			System.out.println(a + b);
			System.out.println(a - b);
			System.out.println(a * b);
			System.out.println(a / b);
			System.out.println(a / (double) b); // aqui foi utilizado uma cast
			System.out.println(a / (float) b);
			//operadores modulo
			
			System.out.println(a % b); // n�o entendi porra nenhuma, ele fala em resto da divis�o
			System.out.println(8 % 3); // � como se fosse 8/3.... 2 x 3 da 6 e o resto que sobra � 2 
			
			
	}
}
