package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import entidades.Consulta;
import entidades.Medico;
import entidades.Paciente;
import entidades.Produto;

public class ConsultaDao {

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

	public void cadastrarConsulta(Consulta consulta) {

		String insert = "INSERT INTO consultas" + "(id_paciente,id_medico,data_consulta,descricao) "
				+ "VALUES(?,?,?,?)";

		try {
			Connection conn = getConexao();
			PreparedStatement pst = conn.prepareStatement(insert);

			// Trocando os ?,?,?,?,?,? pelos valores
			pst.setInt(1, consulta.getPaciente().getId());
			pst.setInt(2, consulta.getMedico().getId());
			pst.setDate(3, consulta.getData());
			pst.setString(4, consulta.getDescricao());

			// Executando a consulta
			pst.executeUpdate();

			// Fechamento da conexão
			pst.close();
			conn.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public List<Consulta> listarConsultas() {
		List<Consulta> consultas = new ArrayList<>();
		String sql = "SELECT * FROM consultas INNER JOIN pacientes ON consultas.id_paciente = pacientes.id INNER JOIN medicos ON consultas.id_medico = medicos.id";

		try {
			Connection conn = getConexao();
			PreparedStatement pst = conn.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				int idPaciente = rs.getInt(6);
				String nomePaciente = rs.getString(7);
				int idade = rs.getInt(8);
				Paciente paciente = new Paciente(idPaciente, nomePaciente, idade);
				int idMedico = rs.getInt(9);
				String nomeMedico = rs.getString(10);
				String especialidade = rs.getString(11);
				Medico medico = new Medico(idMedico, nomeMedico, especialidade);
				int idConsulta = rs.getInt(1);
				Date data_consulta = rs.getDate(4);
				String descricao = rs.getString(5);
				Consulta consulta = new Consulta(idConsulta, paciente, medico, data_consulta, descricao);

				consultas.add(consulta);

			}
			rs.close();
			pst.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return consultas;
	}

	public void alterarProduto(Produto produto) {

		String sql = "UPDATE produtos SET marca = ? , preco = ? WHERE id = ?";

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

	public void deletarProduto(int id) {

		String sql = "delete from produtos where id = ?";
		try {
			Connection conn = getConexao();
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setInt(1, id);

			// Executando minha consulta
			pst.executeUpdate();

			pst.close();
			conn.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public Produto pesquisarPorId(int id) {

		String sql = "SELECT * FROM produtos where id = ?";

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
				Date data = rs.getDate(6);
				String categoria = rs.getString(7);

				produto = new Produto(id, nome, marca, preco, quantidade, data, categoria);

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
