package lambdas;
// lambdas são funções anonimas que você utiliza dentro do seu método 

@FunctionalInterface	// essa anotação força a utilizar apenas 1 método abstract
						// mas ela permite incluir metodos default
public interface Calculo {
	
	public abstract double executar(double a, double b);
	
	default String lega() {
		return "legal";
	}

}
