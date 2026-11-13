package entidade;

public class Conta {
	
	private int numero;
	public String nome;
	private double saldo;
	
	public Conta(int numero, String nome) {
		this.numero = numero;
		this.nome = nome;
	}
	
	public void deposito(double vdeposito) {
		this.saldo += vdeposito;
	}
	
	public void saque(double vsaque) {
		this.saldo -= (vsaque + 5);
	}
	

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}


}
