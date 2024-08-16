package aplicacao;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import dao.ProdutoDao;
import entidades.Produto;

public class SistemaProduto {

	public static void main(String[] args) throws ClassNotFoundException {
		
		ProdutoDao dao = new ProdutoDao();		
		dao.getConexao();
		
		
		// Criar o meu produto
		Produto produto = 
				new Produto
				("Teclado", "Intelbras", 
				60, 35, Date.valueOf("2024-05-28"),"Periféricos");
//		dao.cadastrarProduto(produto);
		
		Produto produto1 = 
				new Produto("Fonte de alimentação",
						"Corsair", 350, 20,
						Date.valueOf("2024-05-28") ,
						"Hardware");
//		dao.cadastrarProduto(produto1);		
		
		// Listando produtos - Comando select
//		List<Produto> lista =  dao.listaProdutos();
//		for (Produto product : lista) {
//			System.out.println(product);
//		}
		
		
		// Pegando o produto mouse da lista
//		produto = lista.get(0);
//		produto.setMarca("Intelbras");
//		produto.setPreco(99);
//		dao.alterarProduto(produto);
//		
//		System.out.println("PRODUTOS APÓS A ATUALIAZAÇÃO DO MOUSE");
//		
//		lista =  dao.listaProdutos();
//		for (Produto product : lista) {
//			System.out.println(product);
//		}
		
		// Deletar produto
//		dao.deletarProduto(2);
		
		
		// Buscando o produto com id = 3;
		Produto produtoBuscado = dao.pesquisarPorId(3);
		System.out.println(produtoBuscado);
		
		
		
		
		
		
		
		
		

	}

}
