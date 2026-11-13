package entidade;

public class Funcionario {
	
	private Integer id;
	public String name;
	private Double salario;
	
	public Funcionario() {
		
	}
	
	public Funcionario(Integer id, String name, Double salario) {
		this.id = id;
		this.name = name;
		this.salario = salario;
	}
	
	public void Aumento(int vAumento) {
		salario += ((vAumento/100) * salario);	
	}
	
	public String toString() {
		return "\nId: " + id +
				"\nNome: " + name +
				"\nSalario: " + salario;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}
	
	

}
