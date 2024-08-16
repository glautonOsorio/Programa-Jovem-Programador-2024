package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import entidades.Consultas;
import entidades.Paciente;

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
	
	public void cadastrarConsulta(Consultas consulta) {

		String insert = "INSERT INTO consultas (id_paciente, id_medico, data_consulta, descricao)VALUES(?,?,?,?)";

		try {

			Connection conn = getConexao();
			PreparedStatement pst = conn.prepareStatement(insert);
			pst.setInt(1, consulta.getPaciente().getId());
			pst.setInt(2, consulta.getMedico().getId());
			pst.setDate(3, consulta.getData());
			pst.setString(4, consulta.getDescricao());

			pst.executeUpdate();
			System.out.println("Cadastrado");
			pst.close();
			conn.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
}
