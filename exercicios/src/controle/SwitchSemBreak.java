package controle;

public class SwitchSemBreak {
	
	public static void main(String[] args) {
		
		String faixa = "marron";
		
		switch (faixa.toLowerCase()) {
		case "preta":
			System.out.println("Sei o a...");
		case "marron":
			System.out.println("Sei o B...");
		case "roxa":
			System.out.println("Sei o d...");
		case "verde":
			System.out.println("Sei o e...");
		case "laranja":
			System.out.println("Sei o f...");
		case "vermelha":
			System.out.println("Sei o g...");
		case "amarela":
			System.out.println("Sei o h...");
			break;
		default:	
			System.out.println("Não sei nada");
		}		
		
		System.out.println("fim");
		
		int idade = 2;
		switch (idade) {
		case 3:
			System.out.println("sabe falar");
		case 2:
			System.out.println("sabe andara");
		case 1:
			System.out.println("sabe respirar");
			
		}
	}

}
