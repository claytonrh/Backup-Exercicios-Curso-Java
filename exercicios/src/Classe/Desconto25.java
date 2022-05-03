package Classe;

public class Desconto25 {
	
	String nome;
	double preco;
	static double desconto = 0.25;	

	Desconto25(String nomeInicial, double precoFinal) {
		nome = nomeInicial;
		preco = precoFinal;		
	}
	
	Desconto25() {
		
	}
	
	double precoComDesconto () {
	
		return preco * (1 - desconto);
		
	}

}
