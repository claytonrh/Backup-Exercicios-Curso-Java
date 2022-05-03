package lambdas;

public class Somar implements Calculo {
	
	// esse não é um exemplo de lambda, essa é a forma comum de acessar a interface
	
	@Override
	public double executar(double a, double b) {	
		return a + b;
	}

}
