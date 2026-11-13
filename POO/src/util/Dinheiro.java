package util;

public class Dinheiro {
	
	public final double IOF = 1.06;
	
	public double currencyConverter(double dollar, double dollardj) {
		return (dollar * IOF) * dollardj;
	}
	

}
