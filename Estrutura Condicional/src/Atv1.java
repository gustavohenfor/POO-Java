import java.util.Scanner;

public class Atv1 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double salario;
		double imposto;
		
		salario = sc.nextDouble();
		
		if(salario <= 2000.00) {
			
		System.out.println("Você está isento!");
		} else if (salario >= 2000.01) {
			
			imposto = salario * 0.08;
			System.out.println("Imposto a pagar pro cugervo "+ imposto);
			
		} else if(salario >= 3000.01) {
			imposto = salario * 0.18;
			System.out.println("Imposto a pagar "+ imposto);
		} else if (salario >= 4500.00) {
			imposto = salario * 0.28;
			System.out.println("Imposto a pagar "+ imposto);
		}
	}

}
