package entidade;

public class Conta {
	
	private int numero;
	public String nome;
	private double saldo;
	
	public Conta(int numero, String nome) {
		this.numero = numero;
		this.nome = nome;
	}
	public void deposito(double vdeposito)	{
		this.saldo += vdeposito;
	}
	
	public void saque(double vsaque) {
		this.saldo -= (5+vsaque);
	}
	
	
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public Double getSaldo() {
		return saldo;
	}
	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	
	
	

}
