package entidades;

public class Funcionario {
	
	private int Id;
    private String nome;
	private double salario;
	
	
	
	public Funcionario(int Id, String nome, double salario) {
				
		this.Id = Id;
		this.nome = nome;
		this.salario = salario;
		
		System.out.println("Objeto criado com sucesso");
	}


	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public void setAumentoSalario(double salario, double aumento) {		
		if (aumento <= 0) {
			System.out.println("Opção errada");			
		} else {		
		this.salario += salario * (aumento / 100.0);
	}
		
	}


	@Override
	public String toString() {
		return "Pessoa [Id=" + Id + ", nome=" + nome + ", salario=" + salario + "]";
	}




}
