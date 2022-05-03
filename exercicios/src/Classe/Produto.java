package Classe;

public class Produto {   // CLASSE = TIPO

	String nome;       //ATRIBUTOS
	double preco;		//ATRIBUTOS
	double desconto;	//ATRIBUTOS
	
	Produto(String nomeInicial, double precoFinal, double descontoInicial) {
		nome = nomeInicial;
		preco = precoFinal;
		desconto = descontoInicial;
		
	}
	
	Produto() {
		
	}
	
	double       precoComDesconto () {
	// retorno | m�tododo       | esse m�todo n�o receber� nenhum par�metro 
	//porque as informa��es que ele precsia j� est�o declaradas nas variaveis  
		return preco * (1 - desconto);
		// EU POSSO CRIAR VARIAVEIS A PARTIR DO TIPO QUE A CLASSE DEFINE	
	}
	
	double precoComDesconto(double descontoDoGerente) {
		return preco * (1 - desconto + descontoDoGerente);
	
	
	}
	
}
