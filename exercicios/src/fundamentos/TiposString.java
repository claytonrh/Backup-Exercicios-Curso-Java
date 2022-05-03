package fundamentos;

public class TiposString {
	
	public static void main(String[] args) {
		System.out.println("Olá Pessoal".charAt(2));
				
		String s = "Boa tarde";
		System.out.println(s. concat("!!!"));
		System.out.println(s + "!!!");
		System.out.println(s.startsWith("Boa"));
		System.out.println(s.toLowerCase() .startsWith("boa"));
		System.out.println(s.toUpperCase() .endsWith("TARDE"));
		System.out.println(s.length());
		System.out.println(s.toLowerCase().equals("boa tarde"));
		System.out.println(s.equalsIgnoreCase("BOA TARDE"));
					
		var nome = "Pedro";
		var sobrenome = "Santos";
		var idade = 33;
		var salario = 12345.987;
		
		String maisUmaFrase = ("\nNome: " + nome + "\nSobrenome: " + sobrenome + "\nIdade: " + idade + "\nSalário: " + salario );
		System.out.println(maisUmaFrase);
			
		
		System.out.println("\nNome: " + nome + "\nSobrenome: " + sobrenome + "\nIdade: " + idade + "\nSalário: " + salario );
		
		System.out.printf("\nO senhor %s %s tem %d anos e ganha R$%.2f.", nome, sobrenome, idade, salario); // %d substitui valores inteiros... %f substitui valores flutuantes
		
		String frase = String.format("\nO senhor %s %s tem %d anos e ganha R$%.2f.", nome, sobrenome, idade, salario);
				System.out.println(frase);
				
		
		
		
		
	}

}
