package entidades;

public class Produto {

	// Caracteristicas
	private String nome;
	private double preco;
	private int quantidade;

	// Construtor
	public Produto(String nome, double preco, int quantidade) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		
		if (preco < 0) {
			System.out.println("VALOR INVÁLIDO");
		} else {
			this.preco = preco;
		}
		
		
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public void adicionarEstoque(int quantidade) {
		this.quantidade = this.quantidade + quantidade;
	}

	public void removerEstoque(int quantidade) {
		this.quantidade = this.quantidade - quantidade;
	}

	public double precoTotalEstoque() {
		return quantidade * preco;
	}

	@Override
	public String toString() {
		return "Produto [nome=" + nome + ", preco=" + preco + ", quantidade=" + quantidade + ", precoTotalEstoque()="
				+ precoTotalEstoque() + "]";
	}

}