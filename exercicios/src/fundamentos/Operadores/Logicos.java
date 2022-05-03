package fundamentos.Operadores;

public class Logicos {
	
	public static void main(String[] args) {
		
		boolean condicao1 = true;
		boolean condicao2 = 3 > 7;
		
		System.out.println(condicao1 && condicao2); // e
		System.out.println(condicao1 || condicao2); // ou
		System.out.println(condicao1 ^ condicao2);  // ou exclusivo
		System.out.println(!condicao1);				// não
		System.out.println(!!condicao2);				// duplo não
		
		
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
		
		
		System.out.println("\nTabela verdade Negação (NOT)"); // A tabela verdade da negação é "UNÁRIO" enquanto todas as outras são BINÁRIAS 	 
		System.out.println(!true);
		System.out.println(!true);
		System.out.println(!false);
		System.out.println(!false);
	}
	 

}
