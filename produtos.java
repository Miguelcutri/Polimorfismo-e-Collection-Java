package PacoteJava6;

public class produtos {
	private String produto;
	private int quantidade;
	
	
	public produtos(String produto, int quantidade) {
		this.produto = produto;
		this.quantidade = quantidade;
	}

	public String getProdutos() {
		return produto;
	}

	public void setProdutos(String produtos) {
		this.produto = produtos;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	@Override
	public String toString() {
	return "produto =" + produto +", quantidade =" + quantidade;
}
	
	
	
}
