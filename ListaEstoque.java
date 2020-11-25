package PacoteJava6;
import java.util.HashSet;
import java.util.Set;

public class ListaEstoque {
	public static void main(String args[]) {
		Set<produtos> estoque = new HashSet<produtos>();
		produtos a = new produtos("Salgadinho", 200);
		produtos b = new produtos("Danone", 300);
		produtos c = new produtos("Bolacha", 400);
		produtos d = new produtos("Suco", 500);
		produtos e = new produtos("Banana", 600);

		
		estoque.add(a);
		estoque.add(b);
		estoque.add(c);
		estoque.add(d);
		estoque.add(e);
		
		System.out.println(estoque);
	}
}
