import java.util.Scanner;

public class Atv6 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i=0;i<n;i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			if(b == 0) {
				System.out.println("Divisão impossible");
			} else {
				double div = (double) a / b;
				System.out.printf("%.2f%n", div);
			}
		}
			
		}

}
