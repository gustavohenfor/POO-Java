package entidade;

public class Retangulo {
	
	public double largura;
	public double comprimento;
	
	public double Area() {
		return largura * comprimento;
	}
	
	public double Perimeter() {
		return (largura *2)+ (comprimento * 2);
	}
	public double Diagonal() {
		return Math.sqrt(Math.pow(largura, 2) + Math.pow(comprimento, 2));
	}
 
}
