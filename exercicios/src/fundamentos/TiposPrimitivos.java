package fundamentos;

public class TiposPrimitivos {
	public static void main(String[] args) {
		 
		// informações do funcionário
		
		// tipos numéricos inteiro
		byte anosDeEmpresa = 23;
		short NumeroDeVoos = 542;
		int id = 56789; // seria o codigo do funcionário
		long pontosAcumulados = 3_134_845_223L; // Os underLines são para separar as centenas e facilitar a vizualização, o L no final é para informar que é do tipo Long quando passa do máximo inteiro
	
		
		// Tipos numéricos reais
		float salario = 11_445.44F; // aqui é necessário colocar o F no final porque numeros separados com ponto são do tipo double, por isso é necessário colocar F para o Java entender que se trata de um tipo float
		double VendasAcumaladas = 2_991_797_103.01;
		
		// Tipos Booleano
		boolean EstaDeFerias = false; // ou true
		
		// Tipo Caractere
		char status = 'A'; // "a" de ativo ou "i" de inativo por exemplo. Poderia usar tbm um barra invertida '\u0010' dependendo de onde será buscada a fonte da informação
		
		
		// exemplos de calculos
		
		System.out.println(anosDeEmpresa * 365);
		
		//Numero de viagens
		System.out.println(NumeroDeVoos / 2);
		
		// Pontos acumulados
		System.out.println(pontosAcumulados / VendasAcumaladas);
		
		System.out.println( id + ": ganha -> " + salario);
		System.out.println( "Férias? " + EstaDeFerias);
		System.out.println("Status: " + status);
		
		
		
		//OBS IMPORTANTE: se você criar uma variavel e não utiliza-la posteriormente no seu código irá criar uma advertencia na classe e em todo o projeto.
		
		
				
		
	}

}
