package Classe;

public class ProdutoTeste {
	
	public static void main(String[] args) { 
		
		// aqui como est� tudo dentro do mesmo pacote
		 // n�o � necess�rio importar, isso vale pra outros atributos que estiverem 
		 //  dentro de determinados pacotes
		
		
 	
		
		Produto 		p1 	= 					new 											Produto("Notebook", 4356.89, 0.25);		
		// TIPO	| 	VARIAVEL | PALAVRA RESERVADA DO JAVA RESPOS�VEL POR CHAMAR UM CONSTRUTOR  | CONSTRUTOR |
		// O CONSTRUTOR � EXATAMENTE O MESMO NOME DA CLASSE QUE NESTE CASO � "PRODUTO"
		
		//p1.nome = "Notebook";
		p1.preco = 4356.89;
		p1.desconto = 0.25;
		//  TIPO | VARIAVEL	|   	VALOR DAVARIAVEL
		// PARA ACESSAR OS ATRIBUTOS DE UMA CLASSE UTILIZAMOS O "." (PONTO)

		var p2 = new Produto();		
		p2.nome = "Caneta Preta";
		p2.preco = 12.56;
		p2.desconto = 0.29;
		//   TIPO "classes definem tipos" |  VARIAVEL 
		
		System.out.println(p1.nome);
		System.out.println(p2.nome);
		
		double precoFinal1 = p1.precoComDesconto();
		double precoFinal2 = p2.precoComDesconto(0.1);
		double mediaCarrinho = (precoFinal1 + precoFinal2) / 2;
		
		System.out.printf("M�dio do carrinho = R$%.2f.", mediaCarrinho);
												//o % significa que � para trazer um numero inteiro,
												//o .2 "ponto dois" � para trazre apenas duas casas depois da virgula
		
		
	}

}
