package Classe;

public class DataTeste {
	
	public static void     main  (            String[]  args) {
	// TIPO DE RETORNO |   NOME |  PARAMETROS ( TIPO |  NOME) 	
		
					// do NOME até abrir a primeira colcheia se chama IDENTIDADE/ASSINATURA DO MÉTODO 
			
	Data d1 = new Data();
	
	var d2 = new Data(11, 02, 1982);
		
		
	String dataFormatada1 = d1.obterDataFormatada();		
	
	System.out.println(dataFormatada1);
	System.out.println(d2.obterDataFormatada());
	
	d1.imprimirDataFormatada();
	d2.imprimirDataFormatada();
	
	}

}
