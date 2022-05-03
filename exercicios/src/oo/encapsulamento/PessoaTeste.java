package oo.encapsulamento;

public class PessoaTeste {
	
	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa("Pedro", "Amoedo", -45);
		p1.alterarIdade(230); // alterando o valor
		
		System.out.println(p1.lerIdade()); // lendo o valor
		System.out.println(p1); // lendo toString
		System.out.println(p1.lerNomeCompleto()); 
	}

}
