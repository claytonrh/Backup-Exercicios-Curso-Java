package lambdas;
// lambdas s�o fun��es anonimas que voc� utiliza dentro do seu m�todo 

@FunctionalInterface	// essa anota��o for�a a utilizar apenas 1 m�todo abstract
						// mas ela permite incluir metodos default
public interface Calculo {
	
	public abstract double executar(double a, double b);
	
	default String lega() {
		return "legal";
	}

}
