package aplicacao;

import java.sql.Date;
import java.util.List;

import dao.ProdutoDao;
import entidades.Produto;

public class SistemaProduto {

	public static void main(String[] args) throws ClassNotFoundException {

		ProdutoDao dao = new ProdutoDao();
		dao.getConexao();

		Produto produto = new Produto("Teclado", "Intelbras", 60, 35, Date.valueOf("2024-05-28"), "Periféricos");
		Produto produto1 = new Produto("Mouse", "HP", 20, 10, Date.valueOf("2024-05-21"), "Periféricos");

		// dao.cadastrarProduto(produto);
		// dao.cadastrarProduto(produto1);

		/*List<Produto> lista = dao.listaProdutos();
		for (Produto prod : lista) {
			System.out.println(prod);

		}*/
		
		/*produto = lista.get(1);
		produto.setMarca("Razor");
		produto.setPreco(250);
		
		dao.alterarProduto(produto);
		
System.out.println("Depois de atualizar");

		for (Produto prod : lista) {
			System.out.println(prod);

		}*/
		
		Produto produto3 = dao.findById(1);
		
		System.out.println(produto3);

	}

}
