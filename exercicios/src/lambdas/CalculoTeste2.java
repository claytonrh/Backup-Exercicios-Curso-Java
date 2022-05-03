package lambdas;

public class CalculoTeste2 {

	public static void main(String[] args) {		
		
	Calculo calc = (x, y) -> {return x + y; };
	// utlizando lambdas voc� pode acessar diretamente o metodo da interface
	// sem precisar criar classes
	
	System.out.println(calc.executar(2, 3));
	
	calc = (x, y) -> x * y;
	System.out.println(calc.executar(2, 3));
	// neste exemplo como n�o foi criado o corpo utilizando o par de chaves {}
	// n�o � necess�rio usar a express�o return, por o java entende de forma implicita
	
	}

}
