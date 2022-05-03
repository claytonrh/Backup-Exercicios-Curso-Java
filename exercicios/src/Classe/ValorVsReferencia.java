package Classe;

public class ValorVsReferencia {

	public static void main(String[] args) {
		
		double a = 2;
		double b = a; // atribui��o por valor
		
		a++;
		b--;
		
		System.out.println(a + "" + b);
		
		Data d1 = new Data(1, 6, 2022);
		Data d2 = d1; // atribui��o por referencia (Objeto)
		
		d1.dia = 31;
		d2.mes = 12; // aqui altera os dois valores ent�o a data ser� a mesma 
						// para os dois
		
		System.out.println(d1.obterDataFormatada());		
		
	}
	
          	// voc� s� consegue acessar um m�todo static a partir de 
			// um m�todo static, voc� n�o consegue acessar de um metodo de de instancia
	
	static void  VoltarDaataParavalorPadrao (Data d) {
		d.dia =1;
		d.mes = 1;
		d.ano = 1970;
		
	}
}
