package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DeafioFilter {
	
	public static void main(String[] args) {
		
		Produto p1 = new Produto ("Notebook", 3000.00, 0.15, 100.0);
		Produto p2 = new Produto ("Tablet", 25000.00, 0.31, 0.0);
		Produto p3 = new Produto ("Mouse", 100.00, 0.18, 0.0);
		Produto p4 = new Produto ("Monitor", 700.00, 0.40, 0.0);
		Produto p5 = new Produto ("Desktop", 3500.00, 0.21, 0.0);
		Produto p6 = new Produto ("HeadPhone", 350.00, 0.35, 35.50);
		
		List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5, p6);
		
		Predicate<Produto> promocao = p -> p.desconto >= 0.3;
		Predicate<Produto> freteGratis = f -> f.frete == 0;
		
		Function<Produto, String> chamadaPromocional =
				p -> "Aprobeite " + p.nome + " por R$" + p.preco;
		
		produtos.stream()
		.filter	(freteGratis)
		.filter(promocao)
		.map(chamadaPromocional)
		.forEach(System.out::println);
		// o nome disso é "pipe line"
	}
}
