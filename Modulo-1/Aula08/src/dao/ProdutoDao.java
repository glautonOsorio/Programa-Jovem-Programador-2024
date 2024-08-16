package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import entidades.Produto;

public class ProdutoDao {

	public Connection getConexao() throws ClassNotFoundException {

		String driver = "com.mysql.cj.jdbc.Driver";
		Class.forName(driver);

		String url = "jdbc:mysql://localhost:3306/jovem_programador_02";

		String user = "root";

		String password = "root";

		Connection conn = null;

		try {

			conn = DriverManager.getConnection(url, user, password);
			System.out.println("Amigo estou aqui");

		} catch (SQLException e) {

			e.printStackTrace();

		}

		return conn;
	}

	public void cadastrarProduto(Produto produto) {

		String insert = "INSERT INTO produtos(nome,marca,preco,quantidade,data_entrada,categoria)VALUES(?,?,?,?,?,?)";

		try {

			Connection conn = getConexao();
			PreparedStatement pst = conn.prepareStatement(insert);
			pst.setString(1, produto.getNome());
			pst.setString(2, produto.getMarca());
			pst.setDouble(3, produto.getPreco());
			pst.setInt(4, produto.getQuantidade());
			pst.setDate(5, produto.getData());
			pst.setString(6, produto.getCategoria());

			pst.executeUpdate();

			System.out.println("Cadastrado");

			pst.close();
			conn.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public List<Produto> listaProdutos() {

		List<Produto> produtos = new ArrayList<>();

		String sql = "SELECT * FROM produtos";

		try {

			Connection conn = getConexao();
			PreparedStatement pst = conn.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();

			while (rs.next()) {
				int id = rs.getInt(1);
				String nome = rs.getString(2);
				String marca = rs.getString(3);
				double preco = rs.getDouble(4);
				int quantidade = rs.getInt(5);
				Date data_entrada = rs.getDate(6);
				String categoria = rs.getString(7);
				Produto produto = new Produto(id, nome, marca, preco, quantidade, data_entrada, categoria);
				produtos.add(produto);
			}

			rs.close();
			pst.close();
			conn.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

		return produtos;

	}

	public void alterarProduto(Produto produto) {
		String sql = "UPDATE produtos SET marca = ?, preco= ? WHERE id = ?";

		try {

			Connection conn = getConexao();
			PreparedStatement pst = conn.prepareStatement(sql);

			pst.setString(1, produto.getMarca());
			pst.setDouble(2, produto.getPreco());
			pst.setInt(3, produto.getId());
			pst.executeUpdate();
			pst.close();
			conn.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void deleteProdutos(int id) throws ClassNotFoundException {
		String sql = "DELETE FROM produtos WHERE id=?";

		try {

			Connection conn = getConexao();
			PreparedStatement pst = conn.prepareStatement(sql);

			pst.setInt(1, id);
			pst.executeUpdate();
			System.out.println("Deletado com sucesso");
			pst.close();
			conn.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public Produto findById(int id) {


		String sql = "SELECT * FROM produtos WHERE id=?";
		Produto produto = null;

		try {

			Connection conn = getConexao();
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setInt(1, id);
			ResultSet rs = pst.executeQuery();

			while (rs.next()) {
				id = rs.getInt(1);
				String nome = rs.getString(2);
				String marca = rs.getString(3);
				double preco = rs.getDouble(4);
				int quantidade = rs.getInt(5);
				Date data_entrada = rs.getDate(6);
				String categoria = rs.getString(7);
				produto = new Produto(id, nome, marca, preco, quantidade, data_entrada, categoria);
				
			}

			rs.close();
			pst.close();
			conn.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

		return produto;

	}
}
