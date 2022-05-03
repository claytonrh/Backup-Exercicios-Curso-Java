package excecao.personalizadaA;

@SuppressWarnings("serial")
public class NumeroForaIntervaloException extends RuntimeException {

	private String nomeDoAtributo;
	
	// this is a constructor
	public NumeroForaIntervaloException(String nomeDoAtributo) {
		this.nomeDoAtributo = nomeDoAtributo;
 
	}
	
	
	public String getLocalizedMessage() {		
		return String.format("O atributo '%s' está fora do intervalo",
				nomeDoAtributo);
				
	}
	
}
