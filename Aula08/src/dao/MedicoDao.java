package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import entidades.Medico;

public class MedicoDao {

	public Connection getConexao() throws ClassNotFoundException {

		String driver = "com.mysql.cj.jdbc.Driver";
		Class.forName(driver);

		String url = "jdbc:mysql://localhost:3306/jovem_programador_02";

		String user = "root";

		String password = "root";

		Connection conn = null;

		try {

			conn = DriverManager.getConnection(url, user, password);
			System.out.println("Connected");

		} catch (SQLException e) {

			e.printStackTrace();

		}

		return conn;
	}

	public void cadastrarMedico(Medico medico) {

		String insert = "INSERT INTO medicos(nome, especialidade) VALUES(?, ?)";

		try {

			Connection conn = getConexao();
			PreparedStatement pst = conn.prepareStatement(insert);
			pst.setString(1, medico.getNome());
			pst.setString(2, medico.getEspecialidade());

			pst.executeUpdate();
			System.out.println("Cadastrado");
			pst.close();
			conn.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public List<Medico> listarMedicos() {

		List<Medico> medicos = new ArrayList<>();

		String sql = "SELECT * FROM medicos";

		try {

			Connection conn = getConexao();
			PreparedStatement pst = conn.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();

			while (rs.next()) {
				int id = rs.getInt("id");
				String nome = rs.getString("nome");
				String especialidade = rs.getString("especialidade");
				Medico medico = new Medico(id, nome, especialidade);
				medicos.add(medico);
			}

			rs.close();
			pst.close();
			conn.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

		return medicos;

	}

	public void alterarMedico(Medico medico) {
		String sql = "UPDATE medicos SET nome = ?, especialidade = ? WHERE id = ?";

		try {

			Connection conn = getConexao();
			PreparedStatement pst = conn.prepareStatement(sql);

			pst.setString(1, medico.getNome());
			pst.setString(2, medico.getEspecialidade());
			pst.setInt(3, medico.getId());
			pst.executeUpdate();
			pst.close();
			conn.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void deleteMedico(int id) {
		String sql = "DELETE FROM medicos WHERE id=?";

		try {

			Connection conn = getConexao();
			PreparedStatement pst = conn.prepareStatement(sql);

			pst.setInt(1, id);
			pst.executeUpdate();
			System.out.println("Deletado com sucesso");
			pst.close();
			conn.close();

		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public Medico findById(int id) {

		String sql = "SELECT * FROM medicos WHERE id=?";
		Medico medico = null;

		try {

			Connection conn = getConexao();
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setInt(1, id);
			ResultSet rs = pst.executeQuery();

			while (rs.next()) {
				id = rs.getInt("id");
				String nome = rs.getString("nome");
				String especialidade = rs.getString("especialidade");
				medico = new Medico(id, nome, especialidade);
			}

			rs.close();
			pst.close();
			conn.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

		return medico;

	}
}
