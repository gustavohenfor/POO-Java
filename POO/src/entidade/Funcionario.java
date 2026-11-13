package entidade;

public class Funcionario {
	
	public String name;
	public double grossSalary;
	public double tax;
	
	public double salarioLiquido() {
		return  grossSalary - tax;
	}
	
	public void aumentoSalario(double porcentagem) {
		this.grossSalary += porcentagem;
	}
	
	public String toString() {
		return name + ", $ " + grossSalary;
	}

}
