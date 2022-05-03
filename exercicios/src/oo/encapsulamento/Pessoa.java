package oo.encapsulamento;

public class Pessoa {
	
	// EXEMPLO DOS METODOS GETTERS E SETTERS
	// O Java tem a op��o de adicionar autom�ticamente essa fun��o em Source
	
	private String nome;
	private String sobrenome;
	private int idade;	
	// como a classe � privada ela estar� indisponivel para
	 // leitura e altera��o da variavel por outras classes
	
	public Pessoa(String nome, String sobrenome, int idade) {
		alterarNome(nome);
		alterarSobrenome(sobrenome);
		alterarIdade(idade);
	}
	
	public String lerNome () {
		return nome;
	}
	
	public void alterarNome(String nome) {
		this.nome = nome;
	}	
	
	
	
	public String lerSobrenome() {
		return sobrenome;
	}

	public void alterarSobrenome(String sobreNome) {
		this.sobrenome = sobreNome;
	}
	
	public String lerNomeCompleto() {
		return lerNome() + " " + lerSobrenome();
	}

	public Pessoa(int idade) {
		alterarIdade(idade);
	}
	
	// resolvendo o problema de leitura para as outras classes
	// criando um m�todo publico 
	// usando o "M�todo Getters" == lerIdade
	public int lerIdade() {
		return idade;
	}
	
	// resolvendo o problema de leitura para as outras classes
	// criando um m�todo publico
	// usando o "M�todo Setters" == alterarIdade
	public void alterarIdade(int novaIdade) {
		novaIdade = Math.abs(novaIdade);
		if(novaIdade >= 0 && novaIdade <=120) {
//						|e igualmente deve ser maior ou igual a.....	
		this.idade = novaIdade;
		
		}
		
	}	
	public String toString() {
		return "Ol� eu sou o " + lerNome()
			+ " e tenho " + lerIdade() + " anos.";
			
		}
	}

