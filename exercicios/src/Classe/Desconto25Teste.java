package Classe;

public class Desconto25Teste {

	public static void main(String[] args) {
		
		Desconto25 p1 = new Desconto25("Perfume", 1000);			
		
		var p2 = new Desconto25();
		 p2.nome = "Remédio";
		 p2.preco = 2000;
		 
		 Desconto25.desconto = 0.50;
		 
		 System.out.println(p1.nome + " " + p1.precoComDesconto());	
		 System.out.printf(p2.nome + " " + p2.precoComDesconto());
	}	
}
