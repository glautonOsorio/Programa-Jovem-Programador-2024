package aplicacao;

import java.sql.Date;
import java.util.List;

import dao.ConsultaDao;
import dao.MedicoDao;
import dao.PacienteDao;
import entidades.Consultas;
import entidades.Medico;
import entidades.Paciente;

public class SistemaMedicoGarcia {

	public static void main(String[] args) throws ClassNotFoundException  {

		
		PacienteDao daoPaciente = new PacienteDao();
		daoPaciente.getConexao();
		MedicoDao daoMedico = new MedicoDao();
		daoMedico.getConexao();
		
		ConsultaDao daoConsulta = new ConsultaDao();
		
		List<Paciente> listaP = daoPaciente.listarPacientes();
		List<Medico> listaM = daoMedico.listarMedicos();
		
		for (Medico medico : listaM) {
			System.out.println(listaM);
		}
		for (Paciente paciente : listaP) {
			System.out.println(listaP);
		}
		
		Paciente paciente = daoPaciente.findById(2);
		Medico medico = daoMedico.findById(1);
		Consultas consulta = new Consultas(paciente, medico, Date.valueOf("2024-06-04"), "Exame de sangue"); 
		daoConsulta.cadastrarConsulta(consulta);
	}

}
