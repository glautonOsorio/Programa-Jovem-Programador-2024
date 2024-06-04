package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import entidades.Paciente;
import entidades.Produto;

public class PacienteDao {
	
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
	
	public void cadastrarPaciente(Paciente paciente) {

		String insert = "INSERT INTO pacientes(nome,idade)VALUES(?,?)";

		try {

			Connection conn = getConexao();
			PreparedStatement pst = conn.prepareStatement(insert);
			pst.setString(1, paciente.getNome());
			pst.setInt(2, paciente.getIdade());

			pst.executeUpdate();
			System.out.println("Cadastrado");
			pst.close();
			conn.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	public List<Paciente> listarPacientes() {

		List<Paciente> pacientes = new ArrayList<>();

		String sql = "SELECT * FROM pacientes";

		try {

			Connection conn = getConexao();
			PreparedStatement pst = conn.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();

			while (rs.next()) {
				int id = rs.getInt(1);
				String nome = rs.getString(2);
				int idade = rs.getInt(3);
				Paciente paciente = new Paciente(id, nome, idade);
				pacientes.add(paciente);
			}

			rs.close();
			pst.close();
			conn.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

		return pacientes;

	}
	
	public void alterarPaciente(Paciente paciente) {
		String sql = "UPDATE pacientes SET nome = ?, idade= ? WHERE id = ?";

		try {

			Connection conn = getConexao();
			PreparedStatement pst = conn.prepareStatement(sql);

			pst.setString(1, paciente.getNome());
			pst.setDouble(2, paciente.getIdade());
			pst.setInt(3, paciente.getId());
			pst.executeUpdate();
			pst.close();
			conn.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	public void deletePacientes(int id) throws ClassNotFoundException {
		String sql = "DELETE FROM pacientes WHERE id=?";

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
	
	public Paciente findById(int id) {


		String sql = "SELECT * FROM pacientes WHERE id=?";
		Paciente paciente = null;
		
		try {

			Connection conn = getConexao();
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setInt(1, id);
			ResultSet rs = pst.executeQuery();

			while (rs.next()) {
				id = rs.getInt(1);
				String nome = rs.getString(2);
				int idade = rs.getInt(3);
				paciente = new Paciente(id, nome, idade);
				
			}

			rs.close();
			pst.close();
			conn.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

		return paciente;

	}


}
