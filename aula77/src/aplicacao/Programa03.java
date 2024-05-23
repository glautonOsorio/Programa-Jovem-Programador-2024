package aplicacao;


import java.util.Scanner;

import entidades.Produto;

public class Programa03 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);		
	
		
		System.out.println("Digite o nome do produto");
		String nome = leia.nextLine();
		
		System.out.println("Digite o preço");
		double preco = leia.nextDouble();
		
		System.out.println("Digite a quantidade");
		int quantidade = leia.nextInt();
		
		Produto produto = new Produto(nome, preco, quantidade);
		System.out.println(produto);
		
		System.out.println("O nome do produto é " + produto.getNome());
		System.out.println("O preço do produto é " + produto.getPreco());
		// produto.preco = -1946; // Erro, estou usando encapsulamento
		produto.setPreco(-1946);
		
		System.out.println("O preço do produto é " + produto.getPreco());
		
		
		System.out.println("Digite a quantidade do produto a adicionar no estoque");
		quantidade = leia.nextInt();
		produto.adicionarEstoque(quantidade);
		System.out.println(produto);
		
		
		System.out.println("Digite a quantidade do produto a remover do estoque");
		quantidade = leia.nextInt();
		produto.removerEstoque(quantidade);
		System.out.println(produto);
		
		
		

	}

}
