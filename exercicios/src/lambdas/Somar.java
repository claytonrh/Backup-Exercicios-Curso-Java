package lambdas;

public class Somar implements Calculo {
	
	// esse n�o � um exemplo de lambda, essa � a forma comum de acessar a interface
	
	@Override
	public double executar(double a, double b) {	
		return a + b;
	}

}
