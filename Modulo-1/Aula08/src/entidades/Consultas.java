package entidades;

import java.sql.Date;

public class Consultas {

	

	private int id;
	private Paciente paciente;
	private Medico medico;
	private Date data;
	private String descricao;

	public Consultas(int id, Paciente paciente, Medico medico, Date data, String descricao) {
		this.id = id;
		this.paciente = paciente;
		this.medico = medico;
		this.data = data;
		this.descricao = descricao;
	}
	
	public Consultas(Paciente paciente, Medico medico, Date data, String descricao) {
		this.paciente = paciente;
		this.medico = medico;
		this.data = data;
		this.descricao = descricao;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public Medico getMedico() {
		return medico;
	}

	public void setMedico(Medico medico) {
		this.medico = medico;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	@Override
	public String toString() {
		return "Consultas [id=" + id + ", paciente=" + paciente + ", medico=" + medico + ", data=" + data
				+ ", descricao=" + descricao + "]";
	}

}
