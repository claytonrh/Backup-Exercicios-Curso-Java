package Classe;

public class ValorNulo {
	
	public static void main(String[] args) {
		
		String s1 = "";
		System.out.println(s1.concat("!!!!"));;
		
		// essa é uma forma de evitar o erro de compilação caso vc acredita que 
		// a variavel possa gerar um valor nulo
		Data d1 = Math.random() > 0.5 ? new Data() : null;
			//	| Math.random gera um numero aleatorio entre 0 e 0,1
		if (d1 !=null) {
			d1.mes = 3;
			System.out.println(d1.obterDataFormatada());
		}
		
		String s2 = Math.random() > 0.5 ? "Opa" : null;
		
		if (s2 != null) {
			System.out.println(s2.concat("???"));
		}
	}

}
