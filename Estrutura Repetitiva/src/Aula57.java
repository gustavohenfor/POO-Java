import java.util.Scanner;

public class Aula57 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = 2;
		int soma = 0;
		
		for(int i=0; i<N; i++) {
			
			int x = sc.nextInt();
			soma = soma + x;
		}
		System.out.println(soma);
	}
	

}
