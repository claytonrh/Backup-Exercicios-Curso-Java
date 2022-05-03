package fundamentos.Operadores;

public class Relacionais {
	
	public static void main(String[] args) {
		
		int a = 97;
		int b = 'a';
		
		System.out.println(a == b); // operadores relacionais são binarios eles tem o operadore que neste caso é o igual "=" e os operandos "A e B".
		
		System.out.println( 3 > 4);
		System.out.println( 3 >= 4); //o igual vem sempre depois		
		System.out.println( 3 < 4);
		System.out.println( 30 <= 7);
		System.out.println( 30 != 7); //diferente
		
		double nota = 6.3;
		boolean bomComportamento = false;
		boolean passouPorMedia = nota >= 7;
		boolean temDesconto = bomComportamento && passouPorMedia;
		
		System.out.println("Tem desconto? " + temDesconto);
		
		
	}

}
