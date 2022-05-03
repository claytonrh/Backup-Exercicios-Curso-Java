package fundamentos;

public class TiposPrimitivos {
	public static void main(String[] args) {
		 
		// informa��es do funcion�rio
		
		// tipos num�ricos inteiro
		byte anosDeEmpresa = 23;
		short NumeroDeVoos = 542;
		int id = 56789; // seria o codigo do funcion�rio
		long pontosAcumulados = 3_134_845_223L; // Os underLines s�o para separar as centenas e facilitar a vizualiza��o, o L no final � para informar que � do tipo Long quando passa do m�ximo inteiro
	
		
		// Tipos num�ricos reais
		float salario = 11_445.44F; // aqui � necess�rio colocar o F no final porque numeros separados com ponto s�o do tipo double, por isso � necess�rio colocar F para o Java entender que se trata de um tipo float
		double VendasAcumaladas = 2_991_797_103.01;
		
		// Tipos Booleano
		boolean EstaDeFerias = false; // ou true
		
		// Tipo Caractere
		char status = 'A'; // "a" de ativo ou "i" de inativo por exemplo. Poderia usar tbm um barra invertida '\u0010' dependendo de onde ser� buscada a fonte da informa��o
		
		
		// exemplos de calculos
		
		System.out.println(anosDeEmpresa * 365);
		
		//Numero de viagens
		System.out.println(NumeroDeVoos / 2);
		
		// Pontos acumulados
		System.out.println(pontosAcumulados / VendasAcumaladas);
		
		System.out.println( id + ": ganha -> " + salario);
		System.out.println( "F�rias? " + EstaDeFerias);
		System.out.println("Status: " + status);
		
		
		
		//OBS IMPORTANTE: se voc� criar uma variavel e n�o utiliza-la posteriormente no seu c�digo ir� criar uma advertencia na classe e em todo o projeto.
		
		
				
		
	}

}
