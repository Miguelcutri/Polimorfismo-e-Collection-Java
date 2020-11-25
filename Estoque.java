package PacoteJava6;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;


public class Estoque {


	public Estoque(String produtos, int quantidade) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String args[]){
		Collection <String> Estoque = new ArrayList();
		Estoque.add("Salgadinho");
		Estoque.add("Danone");
		Estoque.add("Bolacha");
		Estoque.add("Suco");
		Estoque.add("Banana");
		System.out.println("LISTA" +Estoque);
		Estoque.remove("Bolacha");
		
		System.out.println("LISTA ATUALIZADA:" + Estoque);
		Collection <String> produtos2 = Arrays.asList("Laranja", "Alface");
		Estoque.addAll(produtos2);
		System.out.println("LISTA ATUALIZADA:" + Estoque);
				
	}
}
