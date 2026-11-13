import java.util.Scanner;

public class Aula47 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int preco = sc.nextInt();
		double desconto =  (preco < 20) ? preco *0.20 : preco * 0.15;
		
		System.out.println("desconto = " + desconto);
		
		
		
	}

}
