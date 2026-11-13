package entidade;

public class Estudante {
	
	public String nome;
	public double n1;
	public double n2;
	public double n3;
	
	public double media() {
		return (n1 * 0.30) + (n2 * 0.35) + (n3 * 0.35) ;
	}
	
	}

