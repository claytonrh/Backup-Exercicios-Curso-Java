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
		this(1, 1, 1970); // essa � uma outra forma de fazer 
							// s� pode ser usando dentro de um construtor
	}
	

	Data(int diaInicial, int mesInicial, int ano) {
		dia = diaInicial;
		mes = mesInicial;
		this.ano = ano; // essa � uma outra forma de acessar a variavel da sntancia atual
		
	}
	  // final String formato = "%d/%d/%d"; > para acessar essa variavel em outro m�todo
	// necess�rio traze-la para fora do metodo e torna-la uma variavel de classe
	
	String obterDataFormatada() {						// todo este bloco � definido como m�todo					
		final String formato = "%d/%d/%d"; 				// todo este bloco � definido como m�todo
		//coloca o final na frente ela se tora uma constante
		// variaveis e constantes s�o visiveis apenas dentro do m�todo
		
		return String.format(formato, dia, mes, ano);	// todo este bloco � definido como m�todo
		
	}	
	
	void imprimirDataFormatada() {;
		System.out.println(obterDataFormatada());
	}
}
