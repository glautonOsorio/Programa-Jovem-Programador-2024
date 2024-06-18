package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import entidades.Pessoa;

public class PessoaDao {

	public Connection getConexao() throws ClassNotFoundException {

		// Driver
		String driver = "com.mysql.cj.jdbc.Driver";
		Class.forName(driver);

		// Banco de dados
		String url = "jdbc:mysql://localhost:3306/jovem_programador_02?useTimezone=true&serverTimezone=UTC";

		// Usuario
		String user = "root";

		// Senha
		String password = "root";

		Connection con = null;
		try {
			con = DriverManager.getConnection(url, user, password);
			System.out.println("Conectado ao banco de dados");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;

	}

	public List<Pessoa> listarPessoas() {
		List<Pessoa> pessoas = new ArrayList<>();
		String query = "SELECT * FROM pessoas";
		try {
			Connection con = getConexao();
			PreparedStatement pst = con.prepareStatement(query);
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				int id = rs.getInt(1);
				String nome = rs.getString(2);
				int idade = rs.getInt(3);
				String email = rs.getString(4);
				pessoas.add(new Pessoa(id, nome, idade, email));
			}
			rs.close();
			pst.close();
			con.close();
			return pessoas;
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}

	public int inserirPessoa(Pessoa novaPessoa) {

		// SQL
		String insert = "INSERT INTO pessoas (nome, idade, email) VALUES (?, ?, ?)";

		try {
			Connection con = getConexao();
			PreparedStatement pst = con.prepareStatement(insert, Statement.RETURN_GENERATED_KEYS);
			pst.setString(1, novaPessoa.getNome());
			pst.setInt(2, novaPessoa.getIdade());
			pst.setString(3, novaPessoa.getEmail());
			pst.executeUpdate();

			// Pegando a chave
			ResultSet rs = pst.getGeneratedKeys();
			int chaveGerada;
			if (rs.next()) {
				chaveGerada = rs.getInt(1);
				return chaveGerada;
			}
			rs.close();
			pst.close();
			con.close();

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return 0;

	}

	public void excluirPessoa(int id) {
		String delete = "Delete FROM pessoas WHERE (id = ?)";
		try {
			Connection con = getConexao();
			PreparedStatement pst = con.prepareStatement(delete);
			pst.setInt(1, id);
			pst.executeUpdate();

			pst.close();
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public Pessoa pesquisarPorId(int id) {
		Pessoa pessoa = new Pessoa();
		String query = "SELECT * FROM pessoas WHERE Id = ?";
		try {
			Connection con = getConexao();
			PreparedStatement pst = con.prepareStatement(query);
			pst.setInt(1, id);
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				id = rs.getInt(1);
				String nome = rs.getString(2);
				int idade = rs.getInt(3);
				String email = rs.getString(4);
				pessoa = new Pessoa(id, nome, idade, email);
			}
			pst.close();
			pst.close();
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		return pessoa;
	}

	public void alterarPessoa(Pessoa pessoaAlterado) {

		String update = "UPDATE pessoas SET nome = ?, idade = ?, email = ? WHERE Id = ?";
		try {
			Connection con = getConexao();
			PreparedStatement pst = con.prepareStatement(update);
			pst.setString(1, pessoaAlterado.getNome());
			pst.setInt(2, pessoaAlterado.getIdade());
			pst.setString(3, pessoaAlterado.getEmail());
			pst.setInt(4, pessoaAlterado.getId());
			pst.executeUpdate();

			pst.close();
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	public ArrayList<Pessoa> pesquisar(String coluna, String valor) {
		ArrayList<Pessoa> pessoas = new ArrayList<>();

		String query = null;
		if (coluna.equals("email")) {
			query = "SELECT * FROM pessoas WHERE email LIKE '%" + valor + "%'";
		} else if (coluna.equals("nome")) {
			query = "SELECT * FROM pessoas WHERE nome LIKE '%" + valor + "%'";
		}

		try {
			Connection con = getConexao();
			PreparedStatement pst = con.prepareStatement(query);
			ResultSet rs = pst.executeQuery();

			while (rs.next()) {
				int id = rs.getInt(1);
				String nome = rs.getString(2);
				int idade = rs.getInt(3);
				String email = rs.getString(4);
				pessoas.add(new Pessoa(id, nome, idade, email));
			}
			rs.close();
			pst.close();
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		return pessoas;
	}

}