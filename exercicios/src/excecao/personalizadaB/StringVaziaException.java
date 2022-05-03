package excecao.personalizadaB;


	@SuppressWarnings("serial")
	public class StringVaziaException extends RuntimeException {

		private String nomeDoAtributo;
		
		// this is a constructor
		public StringVaziaException(String nomeDoAtributo) {
			this.nomeDoAtributo = nomeDoAtributo;
	 
		}
		
		
		public String getLocalizedMessage() {		
			return String.format("O atributo '%s' está vazio",
					nomeDoAtributo);
					
	}
}
