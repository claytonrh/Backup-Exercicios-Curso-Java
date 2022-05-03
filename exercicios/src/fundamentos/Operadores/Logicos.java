package fundamentos.Operadores;

public class Logicos {
	
	public static void main(String[] args) {
		
		boolean condicao1 = true;
		boolean condicao2 = 3 > 7;
		
		System.out.println(condicao1 && condicao2); // e
		System.out.println(condicao1 || condicao2); // ou
		System.out.println(condicao1 ^ condicao2);  // ou exclusivo
		System.out.println(!condicao1);				// n�o
		System.out.println(!!condicao2);				// duplo n�o
		
		
		System.out.println("\nTabela verdade E (AND)");
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && true);
		System.out.println(false && false);
		
		System.out.println("\nTabela OU (OR)");
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);
		
		System.out.println("\nTabela verdade OU Exclusivo (XOR)");
		System.out.println(true ^ true);
		System.out.println(true ^ false);
		System.out.println(false ^ true);
		System.out.println(false ^ false);
		
		
		System.out.println("\nTabela verdade Nega��o (NOT)"); // A tabela verdade da nega��o � "UN�RIO" enquanto todas as outras s�o BIN�RIAS 	 
		System.out.println(!true);
		System.out.println(!true);
		System.out.println(!false);
		System.out.println(!false);
	}
	 

}
