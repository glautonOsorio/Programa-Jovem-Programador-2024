package entidades;

import java.sql.Date;

public class Produto {
	
	private int id;
	private String nome;
	private String marca;
	private double preco;
	private int quantidade;
	private Date data;
	private String categoria;
	
	public Produto(int id, String nome, String marca, double preco, int quantidade, Date data, String categoria) {
		this.id = id;
		this.nome = nome;
		this.marca = marca;
		this.preco = preco;
		this.quantidade = quantidade;
		this.data = data;
		this.categoria = categoria;
	}
	// sobrecarga
	public Produto(String nome, String marca, double preco, int quantidade, Date data, String categoria) {
		this.nome = nome;
		this.marca = marca;
		this.preco = preco;
		this.quantidade = quantidade;
		this.data = data;
		this.categoria = categoria;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	@Override
	public String toString() {
		return "Produto [id=" + id + ", nome=" + nome + ", marca=" + marca + ", preco=" + preco + ", quantidade="
				+ quantidade + ", data=" + data + ", categoria=" + categoria + "]";
	}
	
	
	
	
	
	

}