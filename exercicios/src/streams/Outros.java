package streams;

import java.util.Arrays;
import java.util.List;

public class Outros {
	
	public static void main(String[] args) {
		
		
		Aluno a1 = new Aluno("Ana", 7.1);
		Aluno a2 = new Aluno("Luna", 6.1);
		Aluno a3 = new Aluno("Gui", 8.1);
		Aluno a4 = new Aluno("Gabi", 10);
		Aluno a5 = new Aluno("Ana", 7.1);
		Aluno a6 = new Aluno("Pedro", 9.1);
		Aluno a7 = new Aluno("Gui", 8.1);
		Aluno a8 = new Aluno("Maria", 10);
		
		List<Aluno> alunos = 
				Arrays.asList(a1, a2, a3, a4, a5, a6, a7, a8);
		
			
		
		System.out.println("Modo distinct...");
		alunos.stream().distinct().forEach(System.out::println);
		// na lista de alunos       <alunos.stream()> 
		// busque valores distintos <.distinct()>
		// e quanto achalos         <.forEach()>   
		//imprima na tela			<(System.out::println)>
		
		System.out.println("\nModo Skip and Limit...");
		alunos.stream()
		.distinct()
		.skip(2) // pule os dois pimeiros
		.limit(2) // pegue apenas os proximos dois
		.forEach(System.out::println);
		
		
		System.out.println("\nModo Take and While...");
		alunos.stream()
		.distinct()
		.skip(2) // pule os dois pimeiros
		.takeWhile(a -> a.nota >= 7) //pegue notas apenas iguais ou maiores que 7
		.forEach(System.out::println);
		
		//OBS IMPORTANTE: no takeWhile se aparecer um valor fora do parametro...
		 // ... os próximo dentro do parametro tbm ficarão de fora
		
	}

}
