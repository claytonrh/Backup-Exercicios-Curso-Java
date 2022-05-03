 package Classe;

public class Data {
	
	int dia;
	int mes;
	int ano;
	
		// ATRIBUTOS DEFINIDO

	Data() {
		// dia = 1;
		// mes = 1;
		// ano = 1970;
		this(1, 1, 1970); // essa é uma outra forma de fazer 
							// só pode ser usando dentro de um construtor
	}
	

	Data(int diaInicial, int mesInicial, int ano) {
		dia = diaInicial;
		mes = mesInicial;
		this.ano = ano; // essa é uma outra forma de acessar a variavel da sntancia atual
		
	}
	  // final String formato = "%d/%d/%d"; > para acessar essa variavel em outro método
	// necessário traze-la para fora do metodo e torna-la uma variavel de classe
	
	String obterDataFormatada() {						// todo este bloco é definido como método					
		final String formato = "%d/%d/%d"; 				// todo este bloco é definido como método
		//coloca o final na frente ela se tora uma constante
		// variaveis e constantes são visiveis apenas dentro do método
		
		return String.format(formato, dia, mes, ano);	// todo este bloco é definido como método
		
	}	
	
	void imprimirDataFormatada() {;
		System.out.println(obterDataFormatada());
	}
}
